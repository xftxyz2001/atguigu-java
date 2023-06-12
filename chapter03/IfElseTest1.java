/*
岳小鹏参加Java考试，他和父亲岳不群达成承诺：
如果：
成绩为100分时，奖励一辆跑车；
成绩为(80，99]时，奖励一辆山地自行车；
当成绩为[60,80]时，奖励环球影城一日游；
其它时，胖揍一顿。

说明：默认成绩是在[0,100]范围内

结论：
1. 如果多个条件表达式之间没有交集（理解是互斥关系），则哪个条件表达式声明在上面，哪个声明在下面都可以。
   如果多个条件表达式之间是包含关系，则需要将范围小的条件表达式声明在范围大的条件表达式的上面。否则，范围小的条件表达式不可能被执行。


*/
class IfElseTest1 {
	public static void main(String[] args) {
		
		int score = 61;

		//方式1：
		/*
		if(score == 100){
			System.out.println("奖励一辆跑车");
		}else if(score > 80 && score <= 99){
			System.out.println("奖励一辆山地自行车");
		}else if(score >= 60 && score <= 80){
			System.out.println("奖励环球影城一日游");
		}else{
			System.out.println("胖揍一顿");
		}
		*/
		
		//方式2：
		score = 88;

		if(score == 100){
			System.out.println("奖励一辆跑车");
		}else if(score > 80){
			System.out.println("奖励一辆山地自行车");
		}else if(score >= 60){
			System.out.println("奖励环球影城一日游");
		}else{
			System.out.println("胖揍一顿");
		}

		//特别的：
		if(score == 100){
			System.out.println("奖励一辆跑车");
		}else if(score > 80){
			System.out.println("奖励一辆山地自行车");
		}else if(score >= 60){
			System.out.println("奖励环球影城一日游");
		}
		/*else{
			System.out.println("胖揍一顿");
		}
		*/
		
	}
}
