/*
测试运算符的使用4：逻辑运算符

1.  & &&  |  ||  ! ^
2. 说明：
① 逻辑运算符针对的都是boolean类型的变量进行的操作
② 逻辑运算符运算的结果也是boolean类型。
③ 逻辑运算符常使用条件判断结构、循环结构中


*/
class LogicTest {
	public static void main(String[] args) {
				
		/*
		区分：& 和 &&
		
		1、相同点：两个符号表达的都是"且"的关系。只有当符号左右两边的类型值均为true时，结果才为true。

		2、执行过程：
			1）如果符号左边是true，则& 、&& 都会执行符号右边的操作
			2）如果符号左边是false，则 & 会继续执行符号右边的操作
			                           && 不会执行符号右边的操作
		3、开发中，我们推荐使用&& 
		*/
		boolean b1 = true;
		b1 = false;

		int num1 = 10;

		if(b1 & (num1++ > 0)){
			System.out.println("床前明月光");
		}else{
			System.out.println("我叫郭德纲");
		}
		
		System.out.println("num1 = " + num1);

		//

		boolean b2 = true;
		b2 = false;

		int num2 = 10;

		if(b2 && (num2++ > 0)){
			System.out.println("床前明月光");
		}else{
			System.out.println("我叫郭德纲");
		}
		
		System.out.println("num2 = " + num2);

		//********************************************
		/*
		区分：| 和 ||
		
		1、相同点：两个符号表达的都是"或"的关系。只要符号两边存在true的情况，结果就为true.

		2、执行过程：
			1）如果符号左边是false，则| 、|| 都会执行符号右边的操作
			2）如果符号左边是true，则 | 会继续执行符号右边的操作
			                          || 不会执行符号右边的操作
		3、开发中，我们推荐使用||
		*/
		boolean b3 = false;
		b3 = true;

		int num3 = 10;

		if(b3 | (num3++ > 0)){
			System.out.println("床前明月光");
		}else{
			System.out.println("我叫郭德纲");
		}
		
		System.out.println("num3 = " + num3);

		//

		boolean b4 = false;
		b4 = true;

		int num4 = 10;

		if(b4 || (num4++ > 0)){
			System.out.println("床前明月光");
		}else{
			System.out.println("我叫郭德纲");
		}
		
		System.out.println("num4 = " + num4);
	}
}
