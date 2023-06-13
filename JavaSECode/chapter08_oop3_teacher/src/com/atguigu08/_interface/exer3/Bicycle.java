package com.atguigu08._interface.exer3;

/**
 * ClassName: Bicycle
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 9:13
 * @Version 1.0
 */
public class Bicycle extends Vehicle{

    public Bicycle() {
    }

    public Bicycle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println("自行车通过人力脚蹬行驶");
    }
}
