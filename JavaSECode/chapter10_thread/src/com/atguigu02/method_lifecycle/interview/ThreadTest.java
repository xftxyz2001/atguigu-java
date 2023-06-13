package com.atguigu02.method_lifecycle.interview;

/*
关于Thread.sleep()方法的一个面试题：如下的代码中sleep()执行后，到底是哪个线程进入阻塞状态了呢？
 */
public class ThreadTest {
    public static void main(String[] args) {
        // 创建线程对象
        MyThread t = new MyThread();
        t.setName("线程1");
        t.start();

        // 调用sleep方法
        try {
            t.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 5秒之后这里才会执行。
        System.out.println("hello World!");
    }
}

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }
    }
}
