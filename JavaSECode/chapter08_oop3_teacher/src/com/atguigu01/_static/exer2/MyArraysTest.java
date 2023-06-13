package com.atguigu01._static.exer2;

/**
 * ClassName: MyArraysTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 14:16
 * @Version 1.0
 */
public class MyArraysTest {
    public static void main(String[] args) {

        int[] arr = new int[]{34,56,223,2,56,24,56,67,778,45};

        //求最大值
        System.out.println("最大值为：" + MyArrays.getMax(arr));
        //求平均值
        System.out.println("平均值为：" + MyArrays.getAvg(arr));

        //遍历
        MyArrays.print(arr);

        //查找
        int index = MyArrays.linearSearch(arr,24);
        if(index >= 0){
            System.out.println("找到了，位置为：" + index);
        }else{
            System.out.println("未找到");
        }

        //排序
        MyArrays.sort(arr);
        //遍历
        MyArrays.print(arr);

    }
}
