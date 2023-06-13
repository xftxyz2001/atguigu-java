package com.atguigu2.two.exer1;

/**
 * ClassName: ArrayExer01
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 15:42
 * @Version 1.0
 */
public class ArrayExer01 {
    public static void main(String[] args) {
        //初始化数组：静态初始化
        int[][] arr = new int[][]{{3,5,8},{12,9},{7,0,6,4}};

        /*
        * 不建议使用动态初始化
        * int[][] arr = new int[3][];
        * arr[0] = new int[3];
        * arr[0][0] = 3;
        * ...
        *
        * */

        int sum = 0;//记录元素的总和
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }

        System.out.println("总和为：" + sum);

    }
}
