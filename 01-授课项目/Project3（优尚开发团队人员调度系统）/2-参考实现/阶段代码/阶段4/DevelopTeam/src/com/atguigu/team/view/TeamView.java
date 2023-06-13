package com.atguigu.team.view;

import com.atguigu.team.service.NameListService;
import com.atguigu.team.service.TeamService;

public class TeamView {

	private NameListService listSvc = new NameListService();
	private TeamService teamSvc = new TeamService();

	/**
	 * 主界面显示及控制方法
	 */
	public void enterMainMenu() {
		
		boolean isFlag = true;
		
		do{
			listAllEmployees();
			
			System.out.print("1-团队列表  2-添加团队成员  3-删除团队成员 4-退出   请选择(1-4)：");
			char menu = TSUtility.readMenuSelection();
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
		System.out.println("显示所有的成员");
	}

	/**
	 * 显示团队成员列表操作
	 */
	private void getTeam() {

	}

	/**
	 * 实现添加成员操作
	 */
	private void addMember() {

	}

	/**
	 * 实现删除成员操作
	 */
	private void deleteMember() {

	}

	public static void main(String[] args) {
		TeamView view = new TeamView();
		view.enterMainMenu();
	}

}
