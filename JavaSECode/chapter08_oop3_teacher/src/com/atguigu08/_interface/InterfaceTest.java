package com.atguigu08._interface;

/**
 * ClassName: InterfaceTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 16:32
 * @Version 1.0
 */
public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MIN_SPEED);

        System.out.println(Flyable.MAX_SPEED);

//        Flyable.MAX_SPEED = 7800;

        Bullet b1 = new Bullet();
        b1.fly();
        b1.attack();

        //接口的多态性
        Flyable f1 = new Bullet();
        f1.fly();
    }
}

interface Flyable{  //接口
    //全局常量
    public static final int MIN_SPEED = 0;

    //可以省略public static final
    int MAX_SPEED = 7900;

    //方法可以省略public abstract 声明
    void fly();
}

interface Attackable{ //接口

    public abstract void  attack();
}

abstract class Plane implements Flyable{

}

class Bullet implements Flyable,Attackable{

    @Override
    public void fly() {
        System.out.println("让子弹飞一会儿");
    }

    @Override
    public void attack() {
        System.out.println("子弹可以击穿身体");
    }
}

//测试接口的继承关系
interface AA{
    void method1();
}

interface BB{
    void method2();
}

interface CC extends AA,BB{ //接口可以多继承

}

class DD implements CC{

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}

