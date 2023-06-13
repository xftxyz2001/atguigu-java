
public class FamilyAccount {

	public static void main(String[] args) {

		boolean isFlag = true;
		String details = "收支\t账户金额\t\t收支金额\t说    明\n";
		double balance = 10000;//初始账户 金额

		do {
			System.out
					.println("\n-----------------谷粒收支记账软件-----------------\n");
			System.out.println("                   1 收支明细");
			System.out.println("                   2 登记收入");
			System.out.println("                   3 登记支出");
			System.out.println("                   4 退    出\n");
			System.out.print("                   请选择(1-4)：");

			// 要求用户输入1-4选择
			char menu = Utility.readMenuSelection();
			switch (menu) {
			case '1':
//				System.out.println("显示详情");
				System.out.println("-----------------当前收支明细记录-----------------");
				System.out.println(details);
				
				System.out.println();
				System.out.println("---------------------------------------------");
				
				break;
			case '2':
//				System.out.println("收入情况");
				System.out.print("本次收入金额：");
				int money = Utility.readNumber();//从键盘获取收入的金额
				
				System.out.print("本次收入说明：");
				String desc = Utility.readString();//从键盘获取收入的说明
				
				//根据获取的金额和收入说明修改用户的信息
				balance += money;
				
				details += ("收入\t" + balance + "\t\t" + money + "\t" +desc + "\n");
				
				System.out.println("---------------------登记完成-------------------");
				break;
			case '3':
//				System.out.println("支出情况");
				System.out.print("本次支出金额：");
				int money1 = Utility.readNumber();//从键盘获取支出的金额
				
				System.out.print("本次支出说明：");
				String desc1 = Utility.readString();//从键盘获取支出的说明
				
				//根据获取的金额和支出说明修改用户的信息
				if(balance >= money1){
					balance -= money1;
					details += ("支出\t" + balance + "\t\t" + money1 + "\t" +desc1 + "\n");
					System.out.println("---------------------登记完成-------------------");
				}else{
					System.out.println("余额不足，支出失败");
				}
				
				break;
			case '4':
				System.out.print("确认是否退出(Y/N)：");
				char exit = Utility.readConfirmSelection();
				if(exit == 'Y'){
					isFlag = false;
				}
				
				break;

			}

		} while (isFlag);

	}

}
