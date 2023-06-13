package com.atguigu4.search_sort.exer3;

/**
 * 快速排序
 * 通过一趟排序将待排序记录分割成独立的两部分，其中一部分记录的关键字均比另一部分关键字小，
 * 则分别对这两部分继续进行排序，直到整个序列有序。
 *
 * @author 尚硅谷-宋红康
 * @create 13:18
 *
 */
public class QuickSort {
	public static void main(String[] args) {
		int[] data = {9, -16, 30, 23, -30, -49, 25, 21, 30};
		System.out.println("排序之前：");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+" ");
		}

		quickSort(data);//调用实现快排的方法

		System.out.println("\n排序之后：");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]+" ");
		}
	}

	public static void quickSort(int[] data) {
		subSort(data, 0, data.length - 1);
	}

	private static void subSort(int[] data, int start, int end) {
		if (start < end) {
			int base = data[start];
			int low = start;
			int high = end + 1;
			while (true) {
				while (low < end && data[++low] - base <= 0)
					;
				while (high > start && data[--high] - base >= 0)
					;
				if (low < high) {
					//交换data数组[low]与[high]位置的元素
					swap(data, low, high);
				} else {
					break;
				}
			}
			//交换data数组[start]与[high]位置的元素
			swap(data, start, high);

			//经过代码[start, high)部分的元素 比[high, end]都小

			//通过递归调用，对data数组[start, high-1]部分的元素重复刚才的过程
			subSort(data, start, high - 1);
			//通过递归调用，对data数组[high+1,end]部分的元素重复刚才的过程
			subSort(data, high + 1, end);
		}
	}

	private static void swap(int[] data, int i, int j) {
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
}

