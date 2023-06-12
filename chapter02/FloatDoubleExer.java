/*
案例1：定义圆周率并赋值为3.14，现有3个圆的半径分别为1.2、2.5、6，求它们的面积。

*/
class FloatDoubleExer {
	public static void main(String[] args) {

		//定义圆周率变量
		double pi = 3.14;

		//定义三个圆的半径
		double radius1 = 1.2;
		double radius2 = 2.5;
		int radius3 = 6;

		//计算面积
		double area1 = pi * radius1 * radius1;
		double area2 = pi * radius2 * radius2;
		double area3 = pi * radius3 * radius3;

		//输出
		System.out.println("圆1的半径为：" + radius1 + ",面积为：" + area1);
		System.out.println("圆2的半径为：" + radius2 + ",面积为：" + area2);
		System.out.println("圆3的半径为：" + radius3 + ",面积为：" + area3);
	}
}
