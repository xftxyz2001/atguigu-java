package com.atguigu12.wrapper;

import org.junit.Test;

/**
 * ClassName: WrapperTest1
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 9:32
 * @Version 1.0
 */
public class WrapperTest1 {
    /*
    基本数据类型、包装类 ---> String类型：① 调用String的重载的静态方法valueOf(xxx xx) ; ② 基本数据类型的变量 + ""

    String类型 ---> 基本数据类型、包装类: 调用包装类的静态方法：parseXxx()
     */
    @Test
    public void test2(){
        String s1 = "123";
        int i1 = Integer.parseInt(s1);
        System.out.println(i1 + 10);


        String s2 = "true";
        boolean b1 = Boolean.parseBoolean(s2);


        //特别的
//        String s3 = "123a";
//        int i2 = Integer.parseInt(s3); //报错：NumberFormatException

    }
    @Test
    public void test1(){
        //方式1：调用String的重载的静态方法valueOf(xxx xx)
        int i1 = 10;
        String str1 = String.valueOf(i1);
        System.out.println(str1);//"10"

        boolean b1 = true;
        Boolean b2 = b1;
        String str2 = String.valueOf(b1);
        String str3 = String.valueOf(b2);

        //方式2：基本数据类型的变量 + ""
        String str4 = i1 + "";
        String str5 = b1 + "";
    }
}
