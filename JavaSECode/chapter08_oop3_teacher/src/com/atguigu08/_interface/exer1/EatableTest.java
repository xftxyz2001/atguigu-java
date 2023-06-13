package com.atguigu08._interface.exer1;

/**
 * ClassName: EatableTest
 * Description:
 *  声明测试类EatableTest，创建Eatable数组，存储各国人对象，并遍历数组，调用eat()方法
 * @Author 尚硅谷-宋红康
 * @Create 8:51
 * @Version 1.0
 */
public class EatableTest {
    public static void main(String[] args) {
        Eatable[] eatables = new Eatable[3];

        eatables[0] = new Chinese(); //多态性
        eatables[1] = new American();
        eatables[2] = new Indian();

        for (int i = 0; i < eatables.length; i++) {
            eatables[i].eat();

        }
    }
}
