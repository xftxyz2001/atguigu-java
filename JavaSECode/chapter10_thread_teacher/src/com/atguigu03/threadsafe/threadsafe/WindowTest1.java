package com.atguigu03.threadsafe.threadsafe;

/**
 * ClassName: WindowTest1
 * Description:
 *      使用同步方法解决继承Thread类中的线程安全问题。
 * @Author 尚硅谷-宋红康
 * @Create 16:24
 * @Version 1.0
 */
class Window1 extends Thread {
    static int ticket = 100;
    static Object obj = new Object();
    static boolean isFlag = true;

    @Override
    public void run() {

        while (isFlag) {

            show();
        }

    }
//    public synchronized void show(){ //此时同步监视器：this。此题目中this:w1,w2,w3，仍然是线程不安全的。
    public static synchronized void show(){ //此时同步监视器：当前类本身，即为Window1.class，是唯一的。
        if (ticket > 0) {

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "售票，票号为：" + ticket);
            ticket--;

        } else {
            isFlag = false;
        }
    }
}

public class WindowTest1 {
    public static void main(String[] args) {

        Window1 w1 = new Window1();
        Window1 w2 = new Window1();
        Window1 w3 = new Window1();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();

    }
}
