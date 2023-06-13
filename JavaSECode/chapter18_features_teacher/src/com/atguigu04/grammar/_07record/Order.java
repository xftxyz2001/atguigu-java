package com.atguigu04.grammar._07record;

import java.util.Objects;

/**
 * ClassName: Order
 * Description:
 *          没有record结构前的写法
 *
 * @Author 尚硅谷-宋红康
 * @Create 16:55
 * @Version 1.0
 */
public class Order {
    //属性：private final修饰
    private final int orderId;
    private final String orderName;

    //构造器中初始化属性
    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    //提供属性的getter方法
    public int orderId() {
        return orderId;
    }

    public String orderName() {
        return orderName;
    }

    //equals()和hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderId == order.orderId && Objects.equals(orderName, order.orderName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, orderName);
    }

    //toString()
    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderName='" + orderName + '\'' +
                '}';
    }
}
