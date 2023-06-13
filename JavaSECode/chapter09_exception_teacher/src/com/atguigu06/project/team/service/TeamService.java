package com.atguigu06.project.team.service;

import com.atguigu06.project.team.domain.Architect;
import com.atguigu06.project.team.domain.Designer;
import com.atguigu06.project.team.domain.Employee;
import com.atguigu06.project.team.domain.Programmer;

/**
 * ClassName: TeamService
 * Description:
 *      关于开发团队成员的管理：添加、删除等。
 * @Author 尚硅谷-宋红康
 * @Create 15:29
 * @Version 1.0
 */
public class TeamService {
    private static int counter = 1; //给memberID进行自动赋值的基数

    private final int MAX_MEMBER = 5;//表示开发团队最大成员数

    private Programmer[] team = new Programmer[MAX_MEMBER];//开发团队的数组

    private int total; //记录开发团队中的人数

    /**
     * 返回当前团队的所有对象
     * @return 包含所有成员对象的数组，数组大小与成员人数一致
     */
    public Programmer[] getTeam(){
        Programmer[] team = new Programmer[total];
        for(int i = 0;i< total;i++){
            team[i] = this.team[i];
        }
        return team;
    }

    /**
     * 向团队中添加成员
     * @param e 待添加成员的对象
     * @throws TeamException 添加失败， TeamException中包含了失败原因
     */
    public void addMember(Employee e) throws TeamException{
//        成员已满，无法添加
        if(total >= MAX_MEMBER){
            throw new TeamException("成员已满，无法添加");
        }
//        该成员不是开发人员，无法添加
        if(!(e instanceof Programmer)){
            throw new TeamException("该成员不是开发人员，无法添加");
        }

        Programmer p = (Programmer) e;
        Status status = p.getStatus();
//        该员工已是某团队成员

//        该员工正在休假，无法添加
        switch (status){
            case BUSY:
                throw new TeamException("该员工已是某团队成员");
            case VOCATION:
                throw new TeamException("该员工正在休假，无法添加");
        }
//        该员工已在本开发团队中
        boolean isExist = isExist(p);
        if(isExist){
            throw new TeamException("该员工已在本开发团队中");
        }

//        团队中至多只能有一名架构师
//        团队中至多只能有两名设计师
//        团队中至多只能有三名程序员
//        int progNum = 0 ,desNum = 0,arcNum = 0;

        //记录程序员、设计师、架构师的个数
        int progNum,desNum,arcNum;
        progNum = desNum = arcNum = 0;
        for (int i = 0; i < total; i++) {
            if(team[i] instanceof Architect){
                arcNum++;
            }else if(team[i] instanceof Designer){
                desNum++;
            }else{
                progNum++;
            }
        }
        //正确的写法：
        if(p instanceof Architect){
            if(arcNum >= 1){
                throw new TeamException("团队中至多只能有一名架构师");
            }
        }else if(p instanceof Designer){
            if(desNum >= 2){
                throw new TeamException("团队中至多只能有两名设计师");
            }
        }else{
            if(progNum >= 3){
                throw new TeamException("团队中至多只能有三名程序员");
            }
        }

        //错误的写法：
//        if(p instanceof Architect && arcNum >= 1){
//            throw new TeamException("团队中至多只能有一名架构师");
//        }else if(p instanceof Designer && desNum >= 2){
//            throw new TeamException("团队中至多只能有两名设计师");
//        }else if(p instanceof Programmer && progNum >= 3){
//            throw new TeamException("团队中至多只能有三名程序员");
//        }

        //代码如果能执行到此位置，意味着p是可以添加到team数组中的。
        team[total++] = p;
        p.setMemberId(counter++);
        p.setStatus(Status.BUSY);


    }

    /**
     * 判断p是否存在于当前的开发团队中
     * @param p
     * @return
     */
    private boolean isExist(Programmer p) {

        for (int i = 0; i < total; i++) {
            if(team[i].getId() == p.getId()){
                return true;
            }
        }
        return false;

    }

    /**
     * 从团队中删除成员
     * @param memberId 待删除成员的memberId
     * @throws TeamException 找不到指定memberId的员工，删除失败
     */
    public void removeMember(int memberId) throws TeamException{
        int i = 0;
        for(;i < total;i++){

            if(team[i].getMemberId() == memberId){
                //找到了这个员工，需要调整其相关属性
                team[i].setStatus(Status.FREE);
                //员工的memberId可以不修改。
                break;
            }

        }

        //没找到
        if(i == total){
            throw new TeamException("找不到指定memberId的员工，删除失败");
        }

        //调整数组
        for(int j = i;j < total - 1;j++){
            team[j] = team[j + 1];
        }
//        team[total-1] = null;
//        total--;
        //合并
        team[--total] = null;

    }

}
