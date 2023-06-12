/*
案例：编写程序：从键盘上输入2023年的“month”和“day”，要求通过程序输出输入的日期为2023年的第几天。
*/
import java.util.Scanner;

class SwitchCaseTest2 {
	public static void main(String[] args) {
		//1.使用Scanner，从键盘获取2023年的month、day
		Scanner input = new Scanner(System.in);

		System.out.println("请输入2023年的月份：");
		int month = input.nextInt();//阻塞式方法

		System.out.println("请输入2023年的天：");
		int day = input.nextInt();

		//假设用户输入的数据是合法的。后期我们在开发中，使用正则表达式进行校验。

		//2. 使用switch-case实现分支结构
		int sumDays = 0;//记录总天数
		//方式1：不推荐。存在数据的冗余
		/*
		switch(month){
			case 1:
				sumDays = day;
				break;
			case 2:
				sumDays = 31 + day;
				break;
			case 3:
				sumDays = 31 + 28 + day;
				break;
			case 4:
				sumDays = 31 + 28 + 31 + day;
				break;
			//...
			case 12:
				sumDays = 31 + 28 + ... + 30 + day;
				break;
		
		}
		*/
		//方式2：
		switch(month){
			case 12:
				sumDays += 30;
			case 11:
				sumDays += 31;
			case 10:
				sumDays += 30;
			case 9:
				sumDays += 31;
			case 8:
				sumDays += 31;
			case 7:
				sumDays += 30;
			case 6:
				sumDays += 31;
			case 5:
				sumDays += 30;
			case 4:
				sumDays += 31;
			case 3:
				sumDays += 28; //28:2月份的总天数
			case 2:
				sumDays += 31; //31:1月份的总天数
			case 1:
				sumDays += day;
				//break;
		}
		

		System.out.println("2023年" + month + "月" + day + "日是当前的第" + sumDays + "天");
		
		
		input.close();//为了防止内存泄漏
	}
}
