/*
测试字符类型和布尔类型的使用


*/
class VariableTest2 {
	public static void main(String[] args) {
		
		//1.字符类型：char(2字节)

		//表示形式1：使用一对''表示，内部有且仅有一个字符
		char c1 = 'a';
		char c2 = '中';
		char c3 = '1';
		char c4 = '%';
		char c5 = 'γ';
		
		//编译不通过
		//char c6 = '';
		//char c7 = 'ab';

		//表示形式2：直接使用Unicode值来表示字符型常量。
		char c8 = '\u0036';
		System.out.println(c8);

		//表示形式3：使用转义字符
		char c9 = '\n';
		char c10 = '\t';
		System.out.println("hello" + c10 + "world");

		//表示形式4：使用具体字符对应的数值（比如ASCII码）
		char c11 = 97;
		System.out.println(c11);//a

		char c12 = '1';
		char c13 = 1;

		//2. 布尔类型：boolean
		//① 只有两个取值：true 、 false
		boolean bo1 = true;
		boolean bo2 = false;
		
		//编译不通过
		//boolean bo3 = 0;
		//② 常使用在流程控制语句中。比如：条件判断、循环结构等
		boolean isMarried = true;
		if(isMarried){
			System.out.println("很遗憾，不能参加单身派对了");
		}else{
			System.out.println("可以多谈几个女朋友或男朋友");
		}
		//③ 了解：我们不谈boolean类型占用的空间大小。但是，真正在内存中分配的话，使用的是4个字节。
	}
}
