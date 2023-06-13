package com.atguigu01._static.apply;

/**
 * ClassName: CircleTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 16:40
 * @Version 1.0
 */
public class CircleTest {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        System.out.println(c1);

        Circle c2 = new Circle();
        System.out.println(c2);

        Circle c3 = new Circle();
        System.out.println(c3);

        Circle c4 = new Circle(2.3);
        System.out.println(c4);

        System.out.println(Circle.total);

    }
}

class Circle{

    double radius;//实例变量

    int id;//编号

    static int total;//创建的Circle实例的个数


    public Circle(){
        this.id = init;
        init++;
        total++;
    }

    public Circle(double radius){
        this();
        this.radius = radius;

    }

    private static int init = 1001; //自动给id赋值的基数

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", id=" + id +
                '}';
    }
}
