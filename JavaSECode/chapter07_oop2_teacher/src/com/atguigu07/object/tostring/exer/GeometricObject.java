package com.atguigu07.object.tostring.exer;

/**
 * ClassName: GeometricObject
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 11:40
 * @Version 1.0
 */
public class GeometricObject {
    protected String color;
    protected double weight;

    public GeometricObject() {
        color = "white";
        weight = 1.0;
    }

    public GeometricObject(String color, double weight) {
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
}
