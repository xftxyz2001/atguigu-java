package com.atguigu06.polymorphism.exer1;

/**
 * ClassName: GeometricObject
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 8:47
 * @Version 1.0
 */
public class GeometricObject {
    protected String color;
    protected double weight;

    protected GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double findArea(){
        return 0.0;
    }
}
