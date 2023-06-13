package com.atguigu13.idea.debug;

/**
 * ClassName: Debug01
 * Package: com.atguigu.debug
 * Description: 演示1：行断点  &  测试debug各个常见操作按钮
 *
 * @Author: 尚硅谷-宋红康
 * @Create: 18:44
 * @Version 1.0
 */
public class Debug01 {
    public static void main(String[] args) {
        //1.
        int m = 10;
        int n = 20;
        System.out.println("m = " + m + ",n = " + n);
        swap(m, n);
        System.out.println("hello");
        System.out.println("m = " + m + ",n = " + n);

        //2.
        int[] arr = new int[] {1,2,3,4,5};
        System.out.println(arr);//地址值

        char[] arr1 = new char[] {'a','b','c'};
        System.out.println(arr1);//abc
    }

    public static void swap(int m,int n){
        int temp = m;
        m = n;
        n = temp;
    }

}
