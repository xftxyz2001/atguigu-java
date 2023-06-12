/*
测试运算符的使用3：比较运算符

1.  ==  !=  >   <   >=   <=  instanceof

2. 说明
① instanceof 在面向对象的多态性的位置讲解。
② ==  !=  >   <   >=   <= 适用于基本数据类型。(细节：>   <   >=   <=不适用于boolean类型)
  运算的结果为boolean类型。
③ 了解： ==  !=  可以适用于引用数据类型
④ 区分：== 与 = 

*/
class CompareTest {
	public static void main(String[] args) {
		int m1 = 10;
		int m2 = 20;
		boolean compare1 = m1 > m2;
		System.out.println(compare1);

		int n1 = 10;
		int n2 = 20;
		System.out.println(n1 == n2);//false
		System.out.println(n1 = n2);//20

		boolean b1 = false;
		boolean b2 = true;
		System.out.println(b1 == b2);//false
		System.out.println(b1 = b2);//true

	}
}
