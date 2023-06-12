/*
测试运算符的使用6：条件运算符

1. (条件表达式)? 表达式1 : 表达式2

2. 说明：
① 条件表达式的结果是boolean类型。
② 如果条件表达式的结果是true，则执行表达式1。否则，执行表达式2。
③ 表达式1 和 表达式2 需要是相同的类型或能兼容的类型。

④ 开发中，凡是可以使用条件运算符的位置，都可以改写为if-else。
          反之，能使用if-else结构，不一定能改写为条件运算符。
  
  建议，在二者都能使用的情况下，推荐使用条件运算符。因为执行效率稍高。

*/
class ConditionTest {
	public static void main(String[] args) {
		
		String info = (2 > 10)? "表达式1" : "表达式2";
		System.out.println(info);

		double result = (2 > 1)? 1 : 2.0;
		System.out.println(result);

		//练习1：获取两个整数的较大值
		int m = 10;
		int n = 20;

		int max = (m > n)? m : n;
		System.out.println("较大值为：" + max);

		//练习2：获取三个整数的最大值
		int i = 20;
		int j = 30;
		int k = 23;

		int tempMax = (i > j)? i : j;
		int finalMax = (tempMax > k)? tempMax : k;
		System.out.println(finalMax);

		//合并以后的写法：不推荐
		int finalMax1 = (((i > j)? i : j) > k)? ((i > j)? i : j) : k;
		System.out.println(finalMax1);
	}
}
