package com.atguigu05._super.interview;

/**
 * 判断运行结果
 *
 * @author 尚硅谷-宋红康
 * @create 14:01
 */
public class Interview01 {

    public static void main(String[] args) {
        new A(new B());
    }
}

class A {
    public A() {
        System.out.println("A");
    }

    public A(B b) {
        this();
        System.out.println("AB");
    }
}

class B {
    public B() {
        System.out.println("B");
    }
}

//class B extends A{
//    public B() {
//        System.out.println("B");
//    }
//}