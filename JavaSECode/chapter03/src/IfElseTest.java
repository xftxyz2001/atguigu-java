/*
分支结构1：if-else条件判断结构

1. 格式
格式1：
if(条件表达式)｛
  	语句块;
｝

格式2："二选一"
if(条件表达式) { 
  	语句块1;
}else{
  	语句块2;
}

格式3："多选一"
if (条件表达式1) {
  	语句块1;
} else if (条件表达式2) {
  	语句块2;
}
...
}else if (条件表达式n) {
 	语句块n;
} else {
  	语句块n+1;
}


*/
class IfElseTest {
	public static void main(String[] args) {
		
		/*
		案例1：成年人心率的正常范围是每分钟60-100次。体检时，
		如果心率不在此范围内，则提示需要做进一步的检查。
		*/
		int heartBeats = 89;
		//错误的写法：if(60 <= heartBeats <= 100){

		if(heartBeats < 60 || heartBeats > 100){
			System.out.println("你需要做进一步的检查");
		}

		System.out.println("体检结束");

		//**********************************
		/*
		案例2：定义一个整数，判定是偶数还是奇数    
		*/
		int num = 13;
		if(num % 2 == 0){
			System.out.println(num + "是偶数");
		}else{
			System.out.println(num + "是奇数");
		}
	}
}
