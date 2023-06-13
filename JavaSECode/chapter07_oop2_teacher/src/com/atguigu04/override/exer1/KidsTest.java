package com.atguigu04.override.exer1;

/**
 * ClassName: KidsTest
 * Description:
 *      定义类KidsTest，在类的main方法中实例化Kids的对象someKid，用该对象访问其父类的成员变量及方法。
 * @Author 尚硅谷-宋红康
 * @Create 9:55
 * @Version 1.0
 */
public class KidsTest {
    public static void main(String[] args) {

        Kids kid = new Kids();

        kid.setSex(1);
        kid.setSalary(100);
        kid.setYearsOld(12);

        //来自于父类中声明的方法
        kid.employeed();
        kid.manOrWoman();

        //Kids类自己声明的方法
        kid.printAge();
    }
}
