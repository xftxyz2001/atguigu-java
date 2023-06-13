package com.atguigu05.method_more._03valuetransfer.exer1;

/**
 * ClassName: Circle
 * Description:
 *    定义一个Circle类，包含一个double型的radius属性代表圆的半径，一个findArea()方法返回圆的面积。
 * @Author 尚硅谷-宋红康
 * @Create 9:28
 * @Version 1.0
 */
public class Circle {
    double radius;//半径

    public double findArea(){
        return Math.PI * radius * radius;
    }
}
