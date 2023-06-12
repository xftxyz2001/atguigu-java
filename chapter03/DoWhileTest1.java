/*
题目：模拟ATM取款

声明变量balance并初始化为0，用以表示银行账户的余额，下面通过ATM机程序实现存款，取款等功能。

=========ATM========
   1、存款
   2、取款
   3、显示余额
   4、退出
请选择(1-4)：
*/
import java.util.Scanner;
class DoWhileTest1 {
	public static void main(String[] args) {
		
		//1. 定义balance的变量，记录账户余额
		double balance = 0.0;

		boolean flag = true; //控制循环的结束

		Scanner scan = new Scanner(System.in);//实例化Scanner

		do{
			//2. 声明ATM取款的界面
			System.out.println("=========ATM========");
			System.out.println("   1、存款");
			System.out.println("   2、取款");
			System.out.println("   3、显示余额");
			System.out.println("   4、退出");
			System.out.print("请选择(1-4)：");

			//3. 使用Scanner获取用户的选择
			
			int selection = scan.nextInt();
			switch(selection){
				//4. 根据用户的选择，决定执行存款、取款、显示余额、退出的操作
				case 1:
					System.out.print("请输入存款的金额：");
					double money1 = scan.nextDouble();
					if(money1 > 0){
						balance += money1;
					}
					break;
				case 2:
					System.out.print("请输入取款的金额：");
					double money2 = scan.nextDouble();
					
					if(money2 > 0 && money2 <= balance){
						balance -= money2;
					}else{
						System.out.println("输入的数据有误或余额不足");
					}


					break;
				case 3:
					System.out.println("账户余额为：" + balance);
					break;
				case 4 :
					flag = false;
					System.out.println("感谢使用，欢迎下次光临^_^");
					break;
				default:
					System.out.println("输入有误，请重新输入");
					//break;
			
			}
		
		
		}while(flag);

		
		//关闭资源
		scan.close();

		

	}
}
