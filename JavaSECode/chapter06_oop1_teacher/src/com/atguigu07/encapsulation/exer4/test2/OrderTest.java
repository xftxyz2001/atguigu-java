package com.atguigu07.encapsulation.exer4.test2;


import com.atguigu07.encapsulation.exer4.test1.Order;

/**
 * ClassName: OrderTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 16:03
 * @Version 1.0
 */
public class OrderTest {
    public static void main(String[] args) {

        Order order = new Order();

        //调用属性
        order.orderPublic = 1;

        //调用方法
        order.methodPublic();


        //不能调用
//        order.orderPrivate = 1;
//        order.orderDefault = 2;

//        order.methodPrivate();
//        order.methodDefault();
    }
}
