package com.atguigu07._abstract;

/**
 * ClassName: Person
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 14:32
 * @Version 1.0
 */
public abstract class Person extends Creature{ //抽象类
    String name;
    int age;

    public Person(){}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void eat(); //抽象方法

    public abstract void sleep(); //抽象方法
}
