package com.atguigu04.example.exer3;

/**
 * ClassName: CircleTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 14:07
 * @Version 1.0
 */
public class CircleTest {
    public static void main(String[] args) {

        Circle c1 = new Circle();

        c1.radius = 2.3;
        c1.findArea();

        System.out.println("面积为：" + c1.findArea2());

    }
}
