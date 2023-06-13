package com.atguigu.team.service;

import com.atguigu.team.domain.Architect;
import com.atguigu.team.domain.Designer;
import com.atguigu.team.domain.Employee;
import com.atguigu.team.domain.Programmer;

public class TeamService {

	private static int counter = 1;// 用来为开发团队新增成员自动生成团队中的唯一ID
	private final int MAX_MEMBER = 5;// 开发团队最多的人员数
	private Programmer[] team = new Programmer[MAX_MEMBER];
	private int total = 0;// 用来记录添加到team中开发团队的人数

	// 返回开发团队人员构成的数组
	public Programmer[] getTeam() {
		Programmer[] team = new Programmer[total];
		for (int i = 0; i < team.length; i++) {
			team[i] = this.team[i];
		}
		return team;
	}

	// 添加指定的员工到开发团队中

	public void addMember(Employee e) throws TeamException {
		if (total >= MAX_MEMBER) {
			throw new TeamException("成员已满，无法添加");
		}
		if (!(e instanceof Programmer)) {
			throw new TeamException("该成员不是开发人员，无法添加");
		}

		Programmer p = (Programmer) e;

		switch (p.getStatus()) {
		case BUSY:
			throw new TeamException("该员工已是某团队成员");
		case VOCATION:
			throw new TeamException("该员正在休假，无法添加");
		}

		if (isExist(p)) {
			throw new TeamException("该员工已在本团队中");
		}

		// 计算出现有的开发团队中程序员、设计师、架构师的人数
		int numOfPro = 0, numOfDes = 0, numOfArch = 0;
		for (int i = 0; i < total; i++) {
			if (team[i] instanceof Architect) {
				numOfArch++;
			} else if (team[i] instanceof Designer) {
				numOfDes++;
			} else if (team[i] instanceof Programmer) {
				numOfPro++;
			}
		}
		// 判断要添加的p是否满足各个工种人数的要求
		if (p instanceof Architect) {

			if (numOfArch >= 1) {
				throw new TeamException("团队中至多只能有一名架构师");

			}

		} else if (p instanceof Designer) {
			if (numOfDes >= 2) {
				throw new TeamException("团队中至多只能有两名设计师");
			}
		} else if (p instanceof Programmer) {
			if (numOfPro >= 3) {
				throw new TeamException("团队中至多只能有三名程序员");

			}
		}

		// 一旦能执行到此位置，证明上述的异常，都不会发生
		p.setStatus(Status.BUSY);
		p.setMemberId(counter++);
		team[total++] = p;

	}

	// 判断p是否已经存在于当前的开发团队中
	private boolean isExist(Programmer p) {
		for (int i = 0; i < total; i++) {
			if (team[i].getId() == p.getId()) {
				return true;
			}
		}
		return false;
	}

	// 从开发团队中移除指定memberId的员工。
	public void removeMember(int memberId) throws TeamException {
		int i;
		for (i = 0; i < total; i++) {
			if (team[i].getMemberId() == memberId) {
				team[i].setStatus(Status.FREE);
				break;
			}
		}

		if (i == total) {
			throw new TeamException("找不到指定memberId的员工，删除失败");
		}

		for (int j = i; j < total - 1; j++) {
			team[j] = team[j + 1];
		}
		// 方式一：
		// team[total - 1] = null;
		// total--;
		// 方式二：
		team[--total] = null;
	}

}
