package com.atguigu2.two;

/*
 * 二维数组的基本使用（难点） （承接TwoArrayTest.java）
 * 
 *  @author 尚硅谷-宋红康
 *  @create 13:18
 * 
 */

public class TwoArrayTest1 {
	public static void main(String[] args) {

		//5. 数组元素的默认初始化值
		//以动态初始化方式1说明：
		int[][] arr1 = new int[3][2];
		//外层元素默认值：
		System.out.println(arr1[0]);//[I@776ec8df
		System.out.println(arr1[1]);//[I@4eec7777
		//内层元素默认值：
		System.out.println(arr1[0][0]); //0


		boolean[][] arr2 = new boolean[3][4];
		//外层元素默认值：
		System.out.println(arr2[0]);//[Z@3b07d329
		//内层元素默认值：
		System.out.println(arr2[0][1]);//false

		String[][] arr3 = new String[4][2];
		//外层元素默认值：
		System.out.println(arr3[0]); //[Ljava.lang.String;@41629346
		//内层元素默认值：
		System.out.println(arr3[0][1]);//null

		//********************************
		//以动态初始化方式2说明：
		int[][] arr4 = new int[4][];
		//外层元素默认值：
		System.out.println(arr4[0]);//null
		//内层元素默认值：
		System.out.println(arr4[0][0]);//报错


//		String[][] arr5 = new String[5][];
//		//外层元素默认值：
//		System.out.println(arr5[0]);//null
//		//内层元素默认值：
//		System.out.println(arr5[0][0]);//报错

		//6. 数组的内存解析


	}
}
