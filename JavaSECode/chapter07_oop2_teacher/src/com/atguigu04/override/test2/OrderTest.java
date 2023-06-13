package com.atguigu04.override.test2;

import com.atguigu04.override.test1.Order;

/**
 * ClassName: OrderTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 10:17
 * @Version 1.0
 */
public class OrderTest {

    public void method(){

        Order order = new Order();

        order.orderPublic = 1;
        order.methodPublic();


        //不能访问
//        order.orderPrivate = 1;
//        order.orderDefault = 1;
//        order.orderProtected = 1;
//
//        order.methodPrivate();
//        order.methodDefault();
//        order.methodProtected();


    }

}
