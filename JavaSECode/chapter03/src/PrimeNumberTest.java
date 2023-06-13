/*
题目：找出100以内所有的素数（质数）？100000以内的呢？

质数：只能被1和它本身整除的自然数。比如：2,3,5,7,11,13,17,19,23,....
   
   ---> 换句话说，从2开始到这个自然数-1为止，不存在此自然数的约数。


*/
class PrimeNumberTest {
	public static void main(String[] args) {
		
		/*
		方式1：
		for(int i = 2;i <= 100;i++){ //遍历100以内的自然数

			int number = 0; //记录i的约数的个数（从2开始，到i-1为止）
			
			//判定i是否是质数
			for(int j = 2;j < i;j++){
				
				if(i % j == 0){
					number++;
				}
			
			}

			if(number == 0){
				System.out.println(i);
			}
		
		
		}
		*/

		//方式2：
		boolean isFlag = true;

		for(int i = 2;i <= 100;i++){ //遍历100以内的自然数
			
			
			//判定i是否是质数
			for(int j = 2;j < i;j++){
				
				if(i % j == 0){
					isFlag = false;
				}
			
			}

			if(isFlag){//if(isFlag == true){
				System.out.println(i);
			}
			
			//重置isFlag
			isFlag = true;
		}

	}
}
