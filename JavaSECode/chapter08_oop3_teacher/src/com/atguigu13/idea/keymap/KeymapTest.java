package com.atguigu13.idea.keymap;

import java.util.Date;

/**
 * ClassName: KeymapTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 10:50
 * @Version 1.0
 */
public class KeymapTest {
    final int NUM = 10;
    String s = new String();

    public static void main(String[] args) {

        System.out.println("hello");

        String str123 = null;
        for (int i = 1; i <= 10; i++) {

            str123 = new String("hello");
            str123 += "123";
            System.out.println(str123.toString());


        }

        method1(str123);
        /*HashMap map1 = new HashMap();
        map1.put("Tom", 89);

        Integer i = new Integer(10);*/


    }

    private static void method1(String str123) {
        try {
            Object obj = str123;
            String str1 = (String) obj;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Date date = new Date();
    }
}

class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat() {
    }

    public void sleep() {
    }

}

interface AA {
    void method1();
}

interface BB {
    void method2();
}

class Student extends Person implements AA, BB {

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}
