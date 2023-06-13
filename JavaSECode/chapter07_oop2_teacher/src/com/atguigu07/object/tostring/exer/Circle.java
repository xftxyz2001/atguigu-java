package com.atguigu07.object.tostring.exer;

/**
 * ClassName: Circle
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 11:41
 * @Version 1.0
 */
public class Circle extends GeometricObject{
    private double radius;

    public Circle() {
//        color = "white";
//        weight = 1.0;
        radius = 1.0;
    }

    public Circle(double radius) {
//        color = "white";
//        weight = 1.0;
        this.radius = radius;
    }

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
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

    //重写equals()
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj instanceof Circle){
            Circle c = (Circle) obj;
            return this.radius == c.radius;
        }
        return false;
    }

    //重写toString()

    @Override
    public String toString() {
        return "Circle[radius = " + radius + "]";
    }
}
