package com.atguigu05._super;

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

    int id = 1001;//身份证号

    public Person() {

        System.out.println("Person()....");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    //方法
    public void eat(){
        System.out.println("人吃饭");
    }
    public void sleep(){
        System.out.println("人睡觉");
    }

    public void doSport(){
        System.out.println("人运动");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
