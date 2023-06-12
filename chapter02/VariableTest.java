/*
测试变量的基本使用

1. 变量的理解：内存中的一个存储区域，该区域的数据可以在同一类型范围内不断变化

2. 变量的构成包含三个要素：数据类型、变量名、存储的值

3. Java中变量声明的格式：数据类型 变量名 = 变量值

4. Java中的变量按照数据类型来分类：
	基本数据类型（8种）:
		整型：byte \ short \ int \ long 
		浮点型：float \ double 
		字符型：char
		布尔型：boolean

	引用数据类型：
		类(class)
		数组(array)
		接口(interface)

		枚举(enum)
		注解(annotation)
		记录(record)

5. 定义变量时，变量名要遵循标识符命名的规则和规范。

6. 说明：
① 变量都有其作用域。变量只在作用域内是有效的，出了作用域就失效了。
② 在同一个作用域内，不能声明两个同名的变量
③ 定义好变量以后，就可以通过变量名的方式对变量进行调用和运算。
④ 变量值在赋值时，必须满足变量的数据类型，并且在数据类型有效的范围内变化。

*/
class VariableTest {
	public static void main(String[] args) {
		
		
		//定义变量的方式1：
		char gender; //过程1：变量的声明
		gender = '男'; //过程2：变量的赋值（或初始化）

		gender = '女';
		
		//定义变量的方式2：声明与初始化合并
		int age = 10;


		System.out.println(age);
		System.out.println("age = " + age);
		System.out.println("gender = " + gender);

		//在同一个作用域内，不能声明两个同名的变量
		//char gender = '女';

		gender = '男';
		
		//由于number前没有声明类型，即当前number变量没有提前定义。所以编译不通过。
		//number = 10;

		byte b1 = 127;
		//b1超出了byte的范围，编译不通过。
		//b1 = 128;

	}

	public static void main123(String[] args) {
		//System.out.println("gender = " + gender);

		char gender = '女';
		
	}
}
