/*
案例3：使用switch-case实现：对学生成绩大于60分的，输出“合格”。低于60分的，输出“不合格”。

*/
class SwitchCaseTest1 {
	public static void main(String[] args) {
		//定义一个学生成绩的变量
		int score = 78;

		//根据需求，进行分支
		//方式1：
		/*
		switch(score){
			case 0:
				System.out.println("不及格");
				break;
			case 1:
				System.out.println("不及格");
				break;
			//...
			
			case 100:
				System.out.println("及格");
				break;
			default:
				System.out.println("成绩输入有误");
				break;
		
		}
		*/
		//方式2：体会case穿透
		switch(score / 10){
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("不及格");
				break;
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
				System.out.println("及格");
				break;
			default:
				System.out.println("成绩输入有误");
				break;
		}

		//方式3：
		switch(score / 60){
			case 0:
				System.out.println("不及格");
				break;
			case 1:
				System.out.println("及格");
				break;
			default:
				System.out.println("成绩输入有误");
				break;
		}
	}
}
