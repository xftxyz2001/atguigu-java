package com.atguigu06.polymorphism.exer4;

/**
 * ClassName: Man
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 9:25
 * @Version 1.0
 */
public class Man extends Person{

    public void eat(){
        System.out.println("男人大口的吃饭");
    }

    public void toilet(){
        System.out.println("男人去男厕所");
    }

    public void smoke(){
        System.out.println("厕后一支烟");
    }
}
