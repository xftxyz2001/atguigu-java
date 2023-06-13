/*
循环结构之一：for循环

1. Java中规范了3种循环结构：for、while、do-while
2. 凡是循环结构，就一定会有4个要素：
① 初始化条件
② 循环条件 ---> 一定是boolean类型的变量或表达式
③ 循环体
④ 迭代部分

3. for循环的格式

for(①;②;④){
	③
}

执行过程：① - ② - ③ - ④ - ② - ③ - ④ - ... - ②

*/
class ForTest {
	public static void main(String[] args) {
		//需求1：题目：输出5行HelloWorld
		/*
		System.out.println("HelloWorld");
		System.out.println("HelloWorld");
		System.out.println("HelloWorld");
		System.out.println("HelloWorld");
		System.out.println("HelloWorld");
		*/

		for(int i = 1;i <= 50;i++){
			System.out.println("HelloWorld");
		}
		
		//此时编译不通过。因为i已经出了其作用域范围。
		//System.out.println(i);

		//需求2：
		int num = 1;
        for(System.out.print("a");num < 3;System.out.print("c"),num++){
            System.out.print("b");

        }

		//输出结果：abcbc

		System.out.println();//换行

		//需求3：遍历1-100以内的偶数，并获取偶数的个数，获取所有的偶数的和
		int count = 0;//记录偶数的个数

		int sum = 0;//记录所有偶数的和

		for(int i = 1;i <= 100;i++){

			if(i % 2 == 0){
				System.out.println(i);
				count++;
				sum += i; //sum = sum + i;
			}	
		}

		System.out.println("偶数的个数为：" + count);
		System.out.println("偶数的总和为：" + sum);
		
	}
}
