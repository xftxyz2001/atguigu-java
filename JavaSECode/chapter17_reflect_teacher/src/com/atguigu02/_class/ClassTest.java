package com.atguigu02._class;

import org.junit.Test;

import java.lang.annotation.ElementType;

/**
 * ClassName: ClassTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 15:49
 * @Version 1.0
 */
public class ClassTest {
    /*
    * 获取Class实例的几种方式(掌握前三种)
    * */
    @Test
    public void test1() throws ClassNotFoundException {
        //1.调用运行时类的静态属性：class
        Class clazz1 = User.class;
        System.out.println(clazz1);

        //2. 调用运行时类的对象的getClass()
        User u1 = new User();
        Class clazz2 = u1.getClass();

        //3. 调用Class的静态方法forName(String className)
        String className = "com.atguigu02._class.User"; //全类名
        Class clazz3 = Class.forName(className);

        System.out.println(clazz1 == clazz2);//true
        System.out.println(clazz1 == clazz3);//true

        //4. 使用类的加载器的方式 (了解)
        Class clazz4 = ClassLoader.getSystemClassLoader().loadClass("com.atguigu02._class.User");
        System.out.println(clazz1 == clazz4);//true
    }

    @Test
    public void test2(){
        Class c1 = Object.class;
        Class c2 = Comparable.class;
        Class c3 = String[].class;
        Class c4 = int[][].class;
        Class c5 = ElementType.class;
        Class c6 = Override.class;
        Class c7 = int.class;
        Class c8 = void.class;
        Class c9 = Class.class;

        int[] a = new int[10];
        int[] b = new int[100];
        Class c10 = a.getClass();
        Class c11 = b.getClass();
        // 只要元素类型与维度一样，就是同一个Class
        System.out.println(c10 == c11);
    }
}
