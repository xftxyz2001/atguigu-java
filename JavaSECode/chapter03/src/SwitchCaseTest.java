/*
分支结构之switch-case的使用

1. 语法格式

switch(表达式){
	
	case 常量1:
		//执行语句1
		//break;
	case 常量2:
		//执行语句2
		//break;
	...
	default:
		//执行语句2
		//break;
}

2.执行过程：
根据表达式中的值，依次匹配case语句。一旦与某一个case中的常量相等，那么就执行此case中的执行语句。
执行完此执行语句之后，
		情况1：遇到break，则执行break后，跳出当前的switch-case结构
		情况2：没有遇到break，则继续执行其后的case中的执行语句。 ---> case 穿透
				...
			   直到遇到break或者执行完所有的case及default中的语句，退出当前的switch-case结构

3. 说明：
① switch中的表达式只能是特定的数据类型。如下：byte \ short \ char \ int \ 枚举(JDK5.0新增) \ String(JDK7.0新增)
② case 后都是跟的常量，使用表达式与这些常量做相等的判断，不能进行范围的判断。
③ 开发中，使用switch-case时，通常case匹配的情况都有限。
④ break:可以使用在switch-case中。一旦执行此break关键字，就跳出当前的switch-case结构
⑤ default：类似于if-else中的else结构。
           default是可选的，而且位置是灵活的。

4. switch-case 与if-else之间的转换
① 开发中凡是可以使用switch-case结构的场景，都可以改写为if-else。反之，不成立
② 开发中，如果一个具体问题既可以使用switch-case，又可以使用if-else的时候，推荐使用switch-case。
  为什么？switch-case相较于if-else效率稍高。

*/
class SwitchCaseTest{
	public static void main(String[] args){
		
		int num = 1;
		switch(num){
			
			case 0:
				System.out.println("zero");
				break; 
			case 1:
				System.out.println("one");
				break; //结束当前的switch-case结构
			case 2:
				System.out.println("two");
				break; 
			case 3:
				System.out.println("three");
				break; 
			default:
				System.out.println("other");
				//break; 
		}

		//另例：
		String season = "summer";
        switch (season) {
            case "spring":
                System.out.println("春暖花开");
                break;
            case "summer":
                System.out.println("夏日炎炎");
                break;
            case "autumn":
                System.out.println("秋高气爽");
                break;
            case "winter":
                System.out.println("冬雪皑皑");
                break;
            /*default:
                System.out.println("季节输入有误");
                break;
			*/
        }

		//错误的例子：编译不通过
		/*
		int number = 20;
		switch(number){
			case number > 0:
				System.out.println("正数");
                break;
			case number < 0:
				System.out.println("负数");
                break;
			default:
				System.out.println("零");
                break;
		}
		*/
	}
}