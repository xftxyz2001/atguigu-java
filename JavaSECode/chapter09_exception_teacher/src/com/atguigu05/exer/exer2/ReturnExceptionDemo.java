package com.atguigu05.exer.exer2;

/**
 * 输出结果：
 * 进入方法A
 * 用A方法的finally
 * 制造异常
 * 进入方法B
 * 调用B方法的finally
 *
 * @author shkstart
 * @create 0:57
 */
public class ReturnExceptionDemo {
    static void methodA() throws Exception{
        try {
            System.out.println("进入方法A");
            throw new Exception("制造异常");
        } finally {
            System.out.println("用A方法的finally");
        }
    }

    static void methodB() {
        try {
            System.out.println("进入方法B");
            return;
        } finally {
            System.out.println("调用B方法的finally");
        }
    }

    public static void main(String[] args) {
        try {
            methodA();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        methodB();
    }
}
