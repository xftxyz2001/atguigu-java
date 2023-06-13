package com.atguigu03._extends;

/**
 * ClassName: Student
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 9:08
 * @Version 1.0
 */
public class Student extends Person{
    //属性
//    String name;
//    int age;

    String school;

    //方法
//    public void eat(){
//        System.out.println("人吃饭");
//    }
//    public void sleep(){
//        System.out.println("人睡觉");
//    }

    public void study(){
        System.out.println("学生学习");
    }

    public void show1(){
//        System.out.println("age : " + age);
        System.out.println("age : " + getAge());

    }
}
