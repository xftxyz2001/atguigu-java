package com.atguigu04.override;

/**
 * ClassName: Person
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 9:08
 * @Version 1.0
 */
public class Person {
    //属性
    String name;
    private int age;

    //方法
    public void eat(){
        System.out.println("人吃饭");
    }
    public void sleep(){
        System.out.println("人睡觉");
    }

    public void show(){
        System.out.println("age : " + age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int info(){
        return 1;
    }

    public Person info1(){
        return null;
    }
}
