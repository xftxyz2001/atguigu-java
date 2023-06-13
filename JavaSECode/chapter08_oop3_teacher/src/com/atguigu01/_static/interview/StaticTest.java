package com.atguigu01._static.interview;

/**
 * 判断如下程序运行时是否会报错？
 *
 * @author 尚硅谷-宋红康
 * @create 19:16
 */
public class StaticTest {
    public static void main(String[] args) {
        Order order = null;
        order.hello();
        System.out.println(order.count);
    }
}

class Order {
    public static int count = 1;

    public static void hello() {
        System.out.println("hello!");
    }
}
