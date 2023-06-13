package com.atguigu04.other.interview;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * ClassName: StringTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 14:56
 * @Version 1.0
 */
public class StringTest {
    /*
    * 针对于核心源码的api，内部的私有的结构在jdk17中就不可以通过反射调用了。
    * */
    @Test
    public void test1() throws Exception {

        Class clazz = Class.forName("java.lang.String");

        String obj = (String) clazz.newInstance();

        //获取value属性，并获取其值
        Field valueField = clazz.getDeclaredField("value");
        valueField.setAccessible(true);
        System.out.println(valueField.get(obj));

    }
}
