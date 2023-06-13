package com.atguigu04.example.exer3;

/**
 * ClassName: Circle
 * Description:
 *      利用面向对象的编程方法，设计类Circle计算圆的面积。
 * @Author 尚硅谷-宋红康
 * @Create 14:04
 * @Version 1.0
 */
public class Circle {
    //属性
    double radius;//半径
    //方法
    public void findArea(){
        System.out.println("面积为：" + 3.14 * radius * radius);
    }
    //或
    public double findArea2(){
        return 3.14 * radius * radius;
    }

    //错误的：
//    public void findArea1(double r){
//        System.out.println("面积为：" + 3.14 * r * r);
//    }



}
