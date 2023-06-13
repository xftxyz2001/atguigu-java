package com.atguigu04.other.dynamic;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * ClassName: ReflectTest
 * Description:
 *      体会反射的动态性
 * @Author 尚硅谷-宋红康
 * @Create 11:31
 * @Version 1.0
 */
public class ReflectTest {

    //体会：静态性
    public Person getInstance(){
        return new Person();
    }

    //体会：反射的动态性
    //举例1：
    public <T> T getInstance(String className) throws Exception {

        Class clazz = Class.forName(className);

        Constructor con = clazz.getDeclaredConstructor();
        con.setAccessible(true);

        return (T) con.newInstance();

    }

    @Test
    public void test1() throws Exception {
        Person p1 = getInstance();
        System.out.println(p1);

        String className = "com.atguigu04.other.dynamic.Person";
        Person per1 = getInstance(className);
        System.out.println(per1);

        String className1 = "java.util.Date";
        Date date1 = getInstance(className1);
        System.out.println(date1);
    }

    //体会：反射的动态性
    //举例2：
    public Object invoke(String className,String methodName) throws Exception {
        //1. 创建全类名对应的运行时类的对象
        Class clazz = Class.forName(className);

        Constructor con = clazz.getDeclaredConstructor();
        con.setAccessible(true);

        Object obj = con.newInstance();

        //2. 获取运行时类中指定的方法，并调用
        Method method = clazz.getDeclaredMethod(methodName);
        method.setAccessible(true);
        return method.invoke(obj);
    }

    @Test
    public void test2() throws Exception {
        String className = "com.atguigu04.other.dynamic.Person";
        String methodName = "show";

        Object returnValue = invoke(className,methodName);
        System.out.println(returnValue);
    }

}














