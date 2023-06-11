package com.atguigu.array.sort;

/**
 * 冒泡排序 
 * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。 
 * 针对所有的元素重复以上的步骤，除了最后一个。
 * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较
 * 
 * @author shkstart 2018-12-17
 */
public class BubbleSort {
	
	public static void bubbleSort(int[] data) {
		System.out.println("开始排序");
		int arrayLength = data.length;
		for (int i = 0; i < arrayLength - 1; i++) {
			for (int j = 0; j < arrayLength - 1 - i; j++) {
				if (data[j] > data[j + 1]) {
					int temp = data[j + 1];
					data[j + 1] = data[j];
					data[j] = temp;
				}
			}
			System.out.println(java.util.Arrays.toString(data));
		}
	}
	//优化1
	public static void bubbleSort1(int[] data) {
		System.out.println("开始排序");
		int arrayLength = data.length;
		for (int i = 0; i < arrayLength - 1; i++) {
			boolean flag = false;
			for (int j = 0; j < arrayLength - 1 - i; j++) {
				if (data[j] > data[j + 1]) {
					int temp = data[j + 1];
					data[j + 1] = data[j];
					data[j] = temp;
					flag = true;
				}
			}
			System.out.println(java.util.Arrays.toString(data));
			if (!flag)
				break;
		}
	}

	public static void main(String[] args) {
		int[] data = { 9, -16, 21, 23, -30, -49, 21, 30, 30 };
		System.out.println("排序之前：\n" + java.util.Arrays.toString(data));
		bubbleSort(data);
		System.out.println("排序之后：\n" + java.util.Arrays.toString(data));
	}
}
