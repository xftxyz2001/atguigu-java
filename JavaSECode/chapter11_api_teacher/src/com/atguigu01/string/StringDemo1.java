package com.atguigu01.string;

import org.junit.Test;

/**
 * ClassName: StringDemo1
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 16:11
 * @Version 1.0
 */
public class StringDemo1 {
    @Test
    public void test1(){
        String s1 = "hello";
        String s2 = "hello";

        String s3 = new String("hello");
        String s4 = new String("hello");

        System.out.println(s1 == s2);//true
        System.out.println(s1 == s3);//false
        System.out.println(s1 == s4);//false
        System.out.println(s3 == s4);//false

        System.out.println(s1.equals(s2));//true

    }

    /*
    * String s = new String("hello");的内存解析？ 或：
    *
    * String s = new String("hello");在内存中创建了几个对象？
    *
    * */

    @Test
    public void test2(){
        Person p1 = new Person();
        Person p2 = new Person();
        p1.name = "Tom";
        p2.name = "Tom";

        p1.name = "Jerry";

        System.out.println(p2.name);//Tom
    }

    /*
    * 测试String的连接符：+
    * */
    @Test
    public void test3(){
        String s1 = "hello";
        String s2 = "world";

        String s3 = "helloworld";
        String s4 = "hello" + "world";
        String s5 = s1 + "world"; //通过查看字节码文件发现调用了StringBuilder的toString()---> new String()
        String s6 = "hello" + s2;
        String s7 = s1 + s2;

        System.out.println(s3 == s4);//true
        System.out.println(s3 == s5);//false
        System.out.println(s3 == s6);//false
        System.out.println(s3 == s7);//false
        System.out.println(s5 == s6);//false
        System.out.println(s5 == s7);//false
        System.out.println();

        String s8 = s5.intern(); //intern():返回的是字符串常量池中字面量的地址
        System.out.println(s3 == s8);//true

    }

    @Test
    public void test4(){
        final String s1 = "hello";
        final String s2 = "world";

        String s3 = "helloworld";
        String s4 = "hello" + "world";
        String s5 = s1 + "world";
        String s6 = "hello" + s2;
        String s7 = s1 + s2;

        System.out.println(s3 == s5);//true
        System.out.println(s3 == s6);//true
        System.out.println(s3 == s7);//true
    }

    @Test
    public void test5(){
        String s1 = "hello";
        String s2 = "world";

        String s3 = s1.concat(s2);
        String s4 = "hello".concat("world");
        String s5 = s1.concat("world");

        System.out.println(s3 == s4);//false
        System.out.println(s3 == s5);//false
        System.out.println(s4 == s5);//false

    }
}

class Person{
    String name;

}