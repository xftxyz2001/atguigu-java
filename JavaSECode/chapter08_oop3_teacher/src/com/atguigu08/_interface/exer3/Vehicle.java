package com.atguigu08._interface.exer3;

/**
 * ClassName: Vehicle
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 9:12
 * @Version 1.0
 */
public abstract class Vehicle {
    private String brand;//品牌
    private String color;//颜色

    public Vehicle() {
    }

    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void run();
}
