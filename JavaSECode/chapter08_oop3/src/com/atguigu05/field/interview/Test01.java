package com.atguigu05.field.interview;

/**
 * @author 尚硅谷-宋红康
 * @create 16:03
 */
class HelloA {
    public HelloA() {
        System.out.println("HelloA");
    }

    {
        System.out.println("I'm A Class");
    }

    static {
        System.out.println("static A");
    }
}

class HelloB extends HelloA {
    public HelloB() {
        System.out.println("HelloB");
    }

    {
        System.out.println("I'm B Class");
    }

    static {
        System.out.println("static B");
    }


}

public class Test01 {
    public static void main(String[] args) {
        new HelloB();
    }
}
