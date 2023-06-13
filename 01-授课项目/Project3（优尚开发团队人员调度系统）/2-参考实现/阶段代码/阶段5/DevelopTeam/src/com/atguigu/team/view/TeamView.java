package com.atguigu.team.view;

import com.atguigu.team.domain.Employee;
import com.atguigu.team.domain.Programmer;
import com.atguigu.team.service.NameListService;
import com.atguigu.team.service.TeamException;
import com.atguigu.team.service.TeamService;

public class TeamView {

	private NameListService listSvc = new NameListService();
	private TeamService teamSvc = new TeamService();

	/**
	 * 主界面显示及控制方法
	 */
	public void enterMainMenu() {
		
		boolean isFlag = true;
		char menu = 0;
		do{
			if(menu != '1'){
				listAllEmployees();
				
			}
			
			System.out.print("1-团队列表  2-添加团队成员  3-删除团队成员 4-退出   请选择(1-4)：");
			menu = TSUtility.readMenuSelection();
			switch (menu) {
			case '1':
				getTeam();
				break;
			case '2':
				addMember();
				break;
			case '3':
				deleteMember();
				break;
			case '4':
				System.out.print("确认是否退出(Y/N)：");
				char isExit = TSUtility.readConfirmSelection();
				if(isExit == 'Y'){
					isFlag = false;
				}
				break;
			}
			
		}while(isFlag);
		
	}

	/**
	 * 以表格形式列出公司所有成员
	 */
	private void listAllEmployees() {
		System.out.println("-------------------------------优尚开发团队调度系统--------------------------------\n");
		
		Employee[] employees = listSvc.getAllEmployees();
		if(employees.length == 0){
			System.out.println("员工列表为空");
			System.out.println("--------------------------------------------------------------");
		}else{
			System.out.println("ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t领用设备");
			for(Employee emp : employees){
				System.out.println(emp);
			}
			System.out.println("--------------------------------------------------------------");
			
		}
	}

	/**
	 * 显示团队成员列表操作
	 */
	private void getTeam() {
		System.out.println("--------------------团队成员列表---------------------");
		
		Programmer[] team = teamSvc.getTeam();
		if(team.length == 0){
			System.out.println("开发团队目前没有成员！");
			
		}else{
			System.out.println("TDI/ID\t姓名\t年龄\t工资\t职位\t奖金\t股票");
			for(int i = 0;i < team.length;i++){
				System.out.println(team[i].getDetailsForTeam());
				
			}
		}
		System.out.println("-----------------------------------------------------");
	}

	/**
	 * 实现添加成员操作
	 */
	private void addMember() {
		System.out.println("---------------------添加成员---------------------");
		System.out.print("请输入要添加的员工ID：");
		int id = TSUtility.readInt();
		try {
			Employee emp = listSvc.getEmployee(id);
			teamSvc.addMember(emp);
			System.out.println("添加成功");
		} catch (TeamException e) {
			System.out.println("添加失败。失败的原因：" + e.getMessage());
			
		}
		//按回车键继续...
		TSUtility.readReturn();
	}

	/**
	 * 实现删除成员操作
	 */
	private void deleteMember() {
		System.out.println("---------------------删除成员---------------------");
		
		System.out.print("请输入要删除员工的TID：");
		int memberId = TSUtility.readInt();
		System.out.print("确认是否删除(Y/N)：");
		char delOrNot = TSUtility.readConfirmSelection();
		if(delOrNot == 'Y'){
			try {
				teamSvc.removeMember(memberId);
				System.out.println("删除成功");
				
			} catch (TeamException e) {
				System.out.println("删除失败，失败原因：" + e.getMessage());
			}
			//按回车键继续...
			TSUtility.readReturn();
		}
		
	}

	public static void main(String[] args) {
		TeamView view = new TeamView();
		view.enterMainMenu();
	}

}
