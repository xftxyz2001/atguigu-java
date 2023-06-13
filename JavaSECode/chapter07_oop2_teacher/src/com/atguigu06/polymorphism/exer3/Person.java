package com.atguigu06.polymorphism.exer3;

/**
 * ClassName: Person
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 9:14
 * @Version 1.0
 */
public class Person {
    protected String name="person";
    protected int age=50;
    public String getInfo() {
        return "Name: "+ name + "\n" +"age: "+ age;
    }
}
