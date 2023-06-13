package com.atguigu07.object.tostring.exer;

/**
 * ClassName: CircleTest
 * Description:
 *      写一个测试类，创建两个Circle对象，判断其颜色是否相等；利用equals方法判断其半径是否相等；
 *      利用toString()方法输出其半径。
 * @Author 尚硅谷-宋红康
 * @Create 11:47
 * @Version 1.0
 */
public class CircleTest {
    public static void main(String[] args) {

        Circle c1 = new Circle(2.3);

        Circle c2 = new Circle("red",2.0,3.4);

        System.out.println("颜色是否相等？" + c1.getColor().equals(c2.getColor()));

        System.out.println("半径是否相等？" + c1.equals(c2));

        System.out.println(c1);
        System.out.println(c1.toString());
    }
}
