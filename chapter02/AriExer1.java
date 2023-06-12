/*

案例2：为抵抗洪水，战士连续作战89小时，编程计算共多少天零多少小时？
*/
class AriExer1 {
	public static void main(String[] args) {

		int hours = 89;

		int day = hours / 24;
		int hour = hours % 24;

		System.out.println("共奋战了" + day + "天零" + hour + "小时");


		//额外的练习1：
		System.out.println("5+5=" + 5 + 5);
		System.out.println("5+5=" + (5 + 5));

		//额外的练习2：
		byte bb1 = 127;
		bb1++;
		System.out.println("bb1 = " + bb1);

		//额外的练习3：
		//int i = 1;
		//int j = i++ + ++i * i++;

		//System.out.println("j = " + j);//10

		//额外的练习4：
		int i = 2;
		int j = i++;
		System.out.println(j); //2


		int k = 2;
		int z = ++k;
		System.out.println(z);//3

		int m = 2;
		m = m++;
		System.out.println(m); //2

	}
}
