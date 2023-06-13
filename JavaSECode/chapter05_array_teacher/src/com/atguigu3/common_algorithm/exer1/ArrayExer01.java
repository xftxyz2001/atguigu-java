package com.atguigu3.common_algorithm.exer1;

/**
 * ClassName: ArrayExer01
 * Description:
 *      案例：定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，然后求出所有元素的最大值，最小值，总和，平均值，
 *           并输出出来。
 * @Author 尚硅谷-宋红康
 * @Create 16:22
 * @Version 1.0
 */
public class ArrayExer01 {
    public static void main(String[] args) {
        //1. 动态初始化方式创建数组
        int[] arr = new int[10];
        //2. 通过循环给数组元素赋值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * (99 - 10 + 1)) + 10;
            System.out.print(arr[i] + "\t");
        }

        System.out.println();

        //3.1 求最大值
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("最大值为：" + max);

        //3.2 求最小值
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("最小值为：" + min);


        //3.3 求总和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("总和为：" + sum);

        //3.4 求平均值
        int avgValue = sum / arr.length;
        System.out.println("平均值为：" + avgValue);


    }
}
