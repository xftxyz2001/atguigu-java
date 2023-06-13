package com.atguigu2.two;

/**
 * 二维数组的基本使用（难点）
 *
 * @author 尚硅谷-宋红康
 * @create 13:08
 */
public class TwoArrayTest {
	public static void main(String[] args) {
		//1. 数组的声明与初始化
		//复习
		int[] arr1 = new int[]{1,2,3};
		//方式1：静态初始化:数组变量的赋值和数组元素的赋值同时进行
		int[][] arr2 = new int[][]{{1,2,3},{4,5},{6,7,8,9}};

		//方式2：动态初始化1:数组变量的赋值和数组元素的赋值分开进行
		String[][] arr3 = new String[3][4];
		//方式2：动态初始化2
		double[][] arr4 = new double[2][];

		//其它正确的写法：
		int arr5[][] = new int[][]{{1,2,3},{4,5},{6,7,8,9}};
		int[] arr6[] = new int[][]{{1,2,3},{4,5},{6,7,8,9}};
		int arr7[][] = {{1,2,3},{4,5},{6,7,8,9}}; //类型推断
		String arr8[][] = new String[3][4];

		//错误的写法
//		int[][] arr9 = new int[3][3]{{1,2,3},{4,5,6},{7,8,9}};
//		int[3][3] arr10 = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
//		int[][] arr11 = new int[][10];


		//2. 数组元素的调用
		//针对于arr2来说，外层元素{1,2,3}、{4,5}、{6,7,8,9} 内层元素：1,2,3,4,5,6,7,8,9
		//调用内层元素
		System.out.println(arr2[0][0]);//1
		System.out.println(arr2[2][1]);//7

		//调用外层元素
		System.out.println(arr2[0]);//[I@776ec8df

		//测试arr3,arr4
		arr3[0][1] = "Tom";
		System.out.println(arr3[0][1]);
		System.out.println(arr3[0]);//[Ljava.lang.String;@4eec7777

		arr4[0] = new double[4];
		arr4[0][0] = 1.0;

		//3. 数组的长度
		System.out.println(arr2.length);//3
		System.out.println(arr2[0].length);//3
		System.out.println(arr2[1].length);//2
		System.out.println(arr2[2].length);//4

		//4. 如何遍历数组
		for (int i = 0; i < arr2.length; i++) {
			for(int j = 0;j < arr2[i].length;j++){
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println();
		}



	}
}
