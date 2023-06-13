package com.atguigu05.field.interview;

/**
 * 阅读代码，分析运行结果
 *
 * @author 尚硅谷-宋红康
 * @create 16:02
 */
public class Test02 {
    static int x, y, z;

    static {
        int x = 5;
        x--;
    }

    static {
        x--;
    }

    public static void method() {
        y = z++ + ++z;
    }

    public static void main(String[] args) {
        System.out.println("x=" + x);
        z--;
        method();
        System.out.println("result:" + (z + y + ++z));
    }


}
