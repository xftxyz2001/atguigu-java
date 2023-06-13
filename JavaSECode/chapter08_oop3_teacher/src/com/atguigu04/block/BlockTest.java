package com.atguigu04.block;

/**
 * ClassName: BlockTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 10:01
 * @Version 1.0
 */
public class BlockTest {
    public static void main(String[] args) {
        System.out.println(Person.info);
        System.out.println(Person.info);


        Person p1 = new Person();
        Person p2 = new Person();
        System.out.println(p1.age);//1
//        p1.eat();
    }
}

class Person{

    String name;
    int age;

    static String info = "我是一个人";

    public void eat(){
        System.out.println("人吃饭");
    }

    public Person(){}

    //非静态代码块
    {
        System.out.println("非静态代码块2");
    }
    {
        System.out.println("非静态代码块1");
        age = 1;
        System.out.println("info = " + info);
    }


    //静态代码块
    static{
        System.out.println("静态代码块2");
    }
    static{
        System.out.println("静态代码块1");
        System.out.println("info = " + info);
//        System.out.println("age = " + age);
//        eat();
    }



}
