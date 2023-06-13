package com.atguigu02.stringmore.interview;

/**
 * 判断如下程序的输出结果
 *
 * @author 尚硅谷-宋红康
 * @create 0:09
 */
public class InterviewTest4 {
    public static void main(String[] args) {
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);

        System.out.println(sb.length());//

        System.out.println(sb);//

        StringBuffer sb1 = new StringBuffer(str);
        System.out.println(sb1);//
    }
}
