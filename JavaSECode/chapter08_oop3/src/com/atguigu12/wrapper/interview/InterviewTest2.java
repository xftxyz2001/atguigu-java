package com.atguigu12.wrapper.interview;

/**
 * 判断如下程序的执行结果
 *
 * @author 尚硅谷-宋红康
 * @create 12:50
 */
public class InterviewTest2 {
    public static void main(String[] args) {
        //题目1：
        int i = 10;
        double d = 10.2;
//        System.out.println(i == d);//
        //题目2：
        Integer i1 = 10;
        Double d1 = 10.2;
//		System.out.println(i1 == d1);//

        //题目3：
        Integer m = 1000;
        double n = 1000;
        System.out.println(m == n);//

        //题目4：
        Integer x = 1000;
        int y = 1000;
        System.out.println(x == y);//
    }
}
