package com.atguigu01.string;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

/**
 * ClassName: StringMethodTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 16:49
 * @Version 1.0
 */
public class StringMethodTest {

    /*
    * String构造器的使用
    * */
    @Test
    public void test1(){
        String s1 = new String();
        String s2 = new String("");

        String s3 = new String(new char[]{'a','b','c'});
        System.out.println(s3);

    }

    /*
    * String与常见的其它结构之间的转换
    *
    * 1. String与基本数据类型、包装类之间的转换（复习）
    *
    * 2. String与char[]之间的转换
    *
    * 3. String与byte[]之间的转换（难度）
    * */
    @Test
    public void test2(){
        int num = 10;
        //基本数据类型 ---> String
        //方式1：
        String s1 = num + "";
        //方式2：
        String s2 = String.valueOf(num);

        //String --> 基本数据类型:调用包装类的parseXxx(String str)
        String s3 = "123";
        int i1 = Integer.parseInt(s3);

    }
    //String与char[]之间的转换
    @Test
    public void test3(){
        String str = "hello";
        //String -->char[]:调用String的toCharArray()
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //char[] ---> String:调用String的构造器
        String str1 = new String(arr);
        System.out.println(str1);//hello

    }

    //String与byte[]之间的转换（难度）
    /*
    * 在utf-8字符集中，一个汉字占用3个字节，一个字母占用1个字节。
    * 在gbk字符集中，一个汉字占用2个字节，一个字母占用1个字节。
    *
    * utf-8或gbk都向下兼容了ascii码。
    *
    * 编码与解码：
    *   编码：String ---> 字节或字节数组
    *   解码：字节或字节数组 ----> String
    * 要求：解码时使用的字符集必须与编码时使用的字符集一致！不一致，就会乱码。
    *
    * */
    @Test
    public void test4() throws UnsupportedEncodingException {
        String str = new String("abc中国");

        //String -->byte[]:调用String的getBytes()
        byte[] arr = str.getBytes(); //使用默认的字符集:utf-8
        for (int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
        //getBytes(String charsetName):使用指定的字符集
        byte[] arr1 = str.getBytes("gbk");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        //byte[] ---> String:
        String str1 = new String(arr); //使用默认的字符集：utf-8
        System.out.println(str1);

        String str2 = new String(arr,"utf-8");//显式的指明解码的字符集：utf-8
        System.out.println(str2);

        //乱码
//        String str3 = new String(arr,"gbk");//显式的指明解码的字符集：gbk
//        System.out.println(str3);

        String str4 = new String(arr1,"gbk");
        System.out.println(str4);
    }

}
