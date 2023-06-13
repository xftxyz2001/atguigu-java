package com.atguigu01._this;

/**
 * ClassName: PersonTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 11:32
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(10);
        System.out.println(p1.age);

        Person p2 = new Person("Tom","tom@126.com");
        System.out.println("name = " + p2.name + ", email = " + p2.email);
    }
}

class Person{
    String name;
    int age;

    String email;

    public Person(){

    }

    public Person(String n){
        name = n;
        eat();
    }

    public Person(String name,String email){
        this.name = name;
        this.email = email;
    }


    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void eat(){
        System.out.println("人吃饭");

        this.sleep();
    }
    public void sleep(){
        System.out.println("人睡觉");
    }
}
