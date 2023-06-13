
public class FamilyAccount {

	public static void main(String[] args) {

		boolean isFlag = true;

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
				System.out.println("显示详情");
				break;
			case '2':
				System.out.println("收入情况");
				break;
			case '3':
				System.out.println("支出情况");
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
