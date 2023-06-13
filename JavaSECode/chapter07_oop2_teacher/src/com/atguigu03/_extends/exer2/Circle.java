package com.atguigu03._extends.exer2;

/**
 * ClassName: Circle
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 10:00
 * @Version 1.0
 */
public class Circle {
    private double radius;//半径

    public Circle(){
        this.radius = 1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    //求圆的面积
    public double findArea(){
        return 3.14 * radius * radius;
    }
}
