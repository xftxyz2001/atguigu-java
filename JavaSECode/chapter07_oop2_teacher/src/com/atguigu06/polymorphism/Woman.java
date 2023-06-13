package com.atguigu06.polymorphism;

/**
 * ClassName: Woman
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 16:22
 * @Version 1.0
 */
public class Woman extends Person{

    boolean isBeauty;

    public void eat(){
        System.out.println("女人应该少吃，减肥");
    }

    public void walk(){
        System.out.println("女人窈窕的走路");
    }

    public void goShopping(){
        System.out.println("女人喜欢逛街...");
    }

}
