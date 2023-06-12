/*
遍历100000以内的所有的质数。体会不同的算法实现，其性能的差别

此PrimeNumberTest1.java是实现方式1
*/
class PrimeNumberTest1 {
	public static void main(String[] args) {

		//获取系统当前的时间：
		long start = System.currentTimeMillis();
		
		boolean isFlag = true;

		int count = 0;//记录质数的个数

		for(int i = 2;i <= 100000;i++){ //遍历100000以内的自然数
			
			
			//判定i是否是质数
			for(int j = 2;j < i;j++){
				
				if(i % j == 0){
					isFlag = false;
				}
			
			}

			if(isFlag){
				count++;
			}
			
			//重置isFlag
			isFlag = true;
		}

		//获取系统当前的时间：
		long end = System.currentTimeMillis();

		System.out.println("质数的总个数为：" + count); //9592
		System.out.println("花费的时间为：" + (end - start)); //7209

	}
}
