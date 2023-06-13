package com.atguigu08.constructor.exer2;

/**
 * ClassName: TriAngleTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 16:52
 * @Version 1.0
 */
public class TriAngleTest {
    public static void main(String[] args) {
        //创建TriAngle的实例1
        TriAngle t1 = new TriAngle();

        t1.setHeight(2.3);
        t1.setBase(3.4);

        System.out.println("面积为：" + t1.findArea());

        //创建TriAngle的实例2
        TriAngle t2 = new TriAngle(2.4,4.5);

        System.out.println("底边长为：" + t2.getBase());
        System.out.println("高为：" + t2.getHeight());
        System.out.println("面积为：" + t2.findArea());
    }
}
