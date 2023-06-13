package com.atguigu3.common_algorithm.exer4;

/**
 * ClassName: ArrayExer04_1
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 8:53
 * @Version 1.0
 */
public class ArrayExer04_1 {
    public static void main(String[] args) {
        //(1)创建一个名为ArrayExer04的类，在main()方法中声明array1和array2两个变量，他们是int[]类型的数组。
        int[] array1,array2;
        //(2)使用大括号{}，把array1初始化为8个素数：2,3,5,7,11,13,17,19。
        array1 = new int[]{2,3,5,7,11,13,17,19};
        //(3)显示array1的内容。
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }
        //(4)复制array1数组给array2，修改array2中的偶索引元素，使其等于索引值(如array[0]=0,array[2]=2)。
        array2 = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }

        System.out.println();
        System.out.println(array1);
        System.out.println(array2);

        for (int i = 0; i < array2.length; i++) {
            if(i % 2 == 0){
                array2[i] = i;
            }
        }

        System.out.println();//换行
        //(5)打印出array1。
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }
    }
}
