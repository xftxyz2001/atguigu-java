/*
随意给出一个三位的整数，打印显示它的个位数，十位数，百位数的值。
格式如下：
数字xxx的情况如下：
个位数：
十位数：
百位数：

例如：
数字153的情况如下：
个位数：3
十位数：5
百位数：1

*/
class AriExer {
	public static void main(String[] args) {
		
		int num = 153;
		int ge = num % 10; //个位
		int shi = num / 10 % 10; //十位.   或者 int shi = num % 100 / 10
		int bai = num / 100;

		System.out.println("个位是：" + ge);
		System.out.println("十位是：" + shi);
		System.out.println("百位是：" + bai);

	}
}
