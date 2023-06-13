package com.atguigu14.review;

/**
 * ClassName: StaticTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 14:55
 * @Version 1.0
 */
public class StaticTest {
    public static void main(String[] args) {
        Person p1 = new Student();
        p1.eat();

        Person p2 = null;
        p2.eat();
    }
}

class Person{
    public static void eat(){
        System.out.println("人吃饭");
    }

    public static void eat(String food){
        System.out.println("人喜欢吃" + food);
    }
}

class Student extends Person{
    public static void eat(){
        System.out.println("学生吃饭");
    }
}
