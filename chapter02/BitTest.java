/*
测试运算符的使用5：位运算符

1. <<   >>   >>>   &  |  ^  ~

2. 说明：

① <<   >>   >>>   &  |  ^  ~ ：针对数值类型的变量或常量进行运算，运算的结果也是数值
② 
<< : 在一定范围内，每向左移动一位，结果就在原有的基础上 * 2。（对于正数、负数都适用）
>> : 在一定范围内，每向右移动一位，结果就在原有的基础上 / 2。（对于正数、负数都适用）

3. 面试题：高效的方式计算2 * 8 ？ 

2 << 3 或 8 << 1

*/
class BitTest {
	public static void main(String[] args) {
		int num1 = 7;
		System.out.println("num1 << 1 : " + (num1 << 1));
		System.out.println("num1 << 2 : " + (num1 << 2));
		System.out.println("num1 << 3 : " + (num1 << 3));
		System.out.println("num1 << 28 : " + (num1 << 28));
		System.out.println("num1 << 29 : " + (num1 << 29));//过犹不及

		int num2 = -7;
		System.out.println("num2 << 1 : " + (num2 << 1));
		System.out.println("num2 << 2 : " + (num2 << 2));
		System.out.println("num2 << 3 : " + (num2 << 3));

		System.out.println(~9);
		System.out.println(~-10);

		
		

	}
}
