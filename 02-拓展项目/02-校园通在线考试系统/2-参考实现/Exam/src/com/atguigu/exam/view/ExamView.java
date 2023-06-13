package com.atguigu.exam.view;

import java.util.Scanner;

import com.atguigu.exam.domain.Item;
import com.atguigu.exam.service.ItemService;

public class ExamView {
	private ItemService itemService = new ItemService();
	private char[] answer;

	public ExamView() {
		answer = new char[itemService.TOTAL_ITEMS];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = ' ';
		}
	}

	public void enterMainMenu() {
		while (true) {
			displayMainMenu();
			char key = getUserAction();
			switch (key) {
			case '1':
				testExam();
				break;
			case '2':
				reviewLastExam();
				break;
			case '3':
				if (confirmEnd("确认是否退出(Y/N):"))
					return;
			}
		}
	}
	
	/**
	 * 获取用户输入的指定字符
	 * @return
	 */
	public char getUserAction() {
		char[] validKey = { '1', '2', '3', 'A', 'B', 'C', 'D', 'F', 'N', 'P',
				'Y' };
		char key = 0;

		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			String str = scanner.next();
			if (str.length() != 1)
				continue;

			str = str.toUpperCase();
			key = str.charAt(0);
			for (char k : validKey) {
				if (k == key) {
					return key;
				}
			}
		}

		return key;
	}
	/**
	 * 显示指定的考题内容
	 * @param no
	 */
	public void displayItem(int no) {
		if (no < 1 || no > itemService.TOTAL_ITEMS)
			return;

		Item item = itemService.getItem(no);

		System.out.println();
		System.out.println();
		System.out.println(item.getQuestion());

		String[] options = item.getOptions();
		for (String option : options) {
			System.out.println(option);
		}
		System.out.println();
		if (answer[no - 1] != ' ') {
			System.out.println("你已选择的答案：" + answer[no - 1]);
		}
	}
	/**
	 * 默认显示第一题，并记录答案，并提示上一题、下一题等
	 */
	private void testExam() {
		int curItem = 1;

		displayWelcomInfo();

		while (true) {
			displayItem(curItem);
			System.out.print("请选择正确答案(p-上一题  n-下一题):");

			char key = getUserAction();
			switch (key) {
			case 'A':
			case 'B':
			case 'C':
			case 'D':
				answer[curItem - 1] = key;
				// break;
			case 'N':
				if (curItem < itemService.TOTAL_ITEMS) {
					++curItem;
				} else {
					System.out.println("已到达最后一题");
				}
				break;
			case 'P':
				if (curItem > 1) {
					--curItem;
				} else {
					System.out.println("已到达第1题");
				}
				break;
			case 'F':
				if (confirmEnd("确认是否结束考试(Y/N):")) {
					itemService.saveAnswer(answer);
					displayResults(answer);
					return;
				}

				break;
			default:
				System.out.println("输入无效");
			}
		}
	}
	/**
	 * 是否确认考试结束
	 * @param msg
	 * @return
	 */
	private boolean confirmEnd(String msg) {
		System.out.println();
		System.out.print(msg);

		while (true) {
			char key = getUserAction();
			if (key != 'N' && key != 'Y')
				continue;
			return (key == 'Y');
		}
	}
	
	/**
	 * 显示进入考试系统的提示信息
	 */
	private void displayWelcomInfo() {
		System.out.println();
		System.out.println();
		System.out.println("-----------欢迎进入考试-----------");
		System.out.println();
		System.out.println("       使用以下按键进行考试：");
		System.out.println();
		System.out.println("        A-B：选择指定答案");
		System.out.println("        P  ：显示上一题");
		System.out.println("        N  ：显示下一题");
		System.out.println("        F  ：结束考试");
		System.out.println();
		System.out.print("        请按N键进入考试...");

		while (true) {
			char key = getUserAction();
			if (key == 'N')
				break;
		}
	}
	

	/**
	 * 显示答案
	 * @param charAnswer
	 */
	private void displayResults(char[] charAnswer) {
		int score = 0;

		for (int i = 0; i < itemService.TOTAL_ITEMS; i++) {
			Item item = itemService.getItem(i + 1);
			if (charAnswer[i] == item.getAnswer()) {
				score += 10;
			}
		}

		System.out.println("序   号   标准答案    你的答案");
		for (int i = 0; i < itemService.TOTAL_ITEMS; i++) {
			Item item = itemService.getItem(i + 1);

			System.out.println("第" + ((i < 9) ? " " : "") + (i + 1)
					+ " 题      " + item.getAnswer() + "           "
					+ charAnswer[i]);
		}
		System.out.println("恭喜，本次考试成绩为：" + score + " 分");
	}
	
	/**
	 * 显示主页面信息
	 */
	private void displayMainMenu() {
		System.out.println();
		System.out.println();
		System.out.println("-------欢迎使用校园通在线考试系统-------");
		System.out.println();
		System.out.println("       1 进入考试");
		System.out.println("       2 查看成绩");
		System.out.println("       3 系统退出");
		System.out.println();
		System.out.print("       请选择...");
	}
	/**
	 * 显示上次答题情况
	 */
	private void reviewLastExam() {
		System.out.println();
		System.out.println();

		char[] charAnswer = itemService.readAnswer();
		displayResults(charAnswer);
	}
}
