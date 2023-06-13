/*
题目：输出所有的水仙花数，所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身。
例如： 153 = 1*1*1 + 3*3*3 + 5*5*5
*/
class ForTest1 {
	public static void main(String[] args) {
		
		//遍历所有的3位数
		for(int i = 100;i <= 999;i++){
			
			//针对于每一个三位数i，获取其各个位上数值
			int ge = i % 10;
			int shi = i / 10 % 10;  //或 int shi = i % 100 / 10
			int bai = i / 100;

			//判断是否满足水仙花数的规则
			if(i == ge * ge * ge + shi * shi * shi + bai * bai * bai){
				System.out.println(i);
			}

		}
	}
}
