package com.atguigu06.polymorphism;

/**
 * ClassName: Man
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 16:21
 * @Version 1.0
 */
public class Man extends Person{

    boolean isSmoking;

    int id = 1002;

    public void eat(){
        System.out.println("男人多吃肉，长肌肉");
    }

    public void walk(){
        System.out.println("男人笔挺的走路");
    }

    public void earnMoney(){
        System.out.println("男人挣钱养家");
    }

}
