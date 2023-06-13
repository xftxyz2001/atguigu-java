package com.atguigu04.grammar._07record;

/**
 * ClassName: Person
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 15:02
 * @Version 1.0
 */
public record Person(int id,String name) {

    //- 还可以在record声明的类中定义静态字段、静态方法、构造器或实例方法。
    static String info = "我是一个人";

    public static void show(){
        System.out.println("我是一个人！");
    }

    public Person(){
        this(0,null);
    }

    public void eat(){
        System.out.println("人吃饭");
    }



    //- 不能在record声明的类中定义实例字段；类不能声明为abstract；不能声明显式的父类等。
    //    final int age;
}

//abstract record Dog(int id){}

//record Cat(int id) extends Thread{}

//class Student extends Person{}