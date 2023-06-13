package com.atguigu03.threadsafe.threadsafe;

/**
 * ClassName: WindowTest1
 * Description:
 *      使用继承Thread类的方式，实现卖票
 *      使用同步代码块的方式解决线程安全问题。
 *
 * @Author 尚硅谷-宋红康
 * @Create 15:24
 * @Version 1.0
 */

class Window extends Thread{
    static int ticket = 100;
    static Object obj = new Object();
    @Override
    public void run() {

        while(true){

//            synchronized (this) { //this:此时表示w1,w2,w2。不能保证锁的唯一性。
//            synchronized (obj) { //obj: 使用static修饰以后，就能保证其唯一性。
            synchronized (Window.class) { // 结构：Class clz = Window.class，是唯一的。
                if(ticket > 0){

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "售票，票号为：" + ticket);
                    ticket--;

                }else{
                    break;
                }
            }
        }

    }
}

public class WindowTest {
    public static void main(String[] args) {

        Window w1 = new Window();
        Window w2 = new Window();
        Window w3 = new Window();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();

    }
}
