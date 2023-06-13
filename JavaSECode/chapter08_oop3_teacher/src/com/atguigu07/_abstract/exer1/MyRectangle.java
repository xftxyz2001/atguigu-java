package com.atguigu07._abstract.exer1;

/**
 * ClassName: MyRectangle
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 8:53
 * @Version 1.0
 */
public class MyRectangle extends GeometricObject {

    private double width;//宽
    private double height;//高

    public MyRectangle(String color, double weight, double width, double height) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double findArea() {

        return width * height;
    }
}
