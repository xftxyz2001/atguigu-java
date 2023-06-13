package com.atguigu10._enum.exer1;

/**
 * ClassName: BankTest1
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 15:05
 * @Version 1.0
 */
public class BankTest1 {
    public static void main(String[] args) {
//        Bank1.instance = null;

        System.out.println(GirlFriend.XIAO_LI);
    }
}

//jdk5.0之前的使用枚举类定义单例模式
class Bank1{

    private Bank1(){}

    public static final Bank1 instance = new Bank1();


}
//jdk5.0使用enum关键字定义枚举类的方式定义单例模式
enum Bank2{
    CPB;
}

enum GirlFriend{

    XIAO_LI(20);

    private final int age;

    private GirlFriend(int age){
        this.age = age;
    }

}
