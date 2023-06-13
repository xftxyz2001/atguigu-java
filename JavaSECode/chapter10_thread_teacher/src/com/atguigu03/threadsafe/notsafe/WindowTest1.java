package com.atguigu03.threadsafe.notsafe;

/**
 * ClassName: WindowTest1
 * Description:
 *      使用继承Thread类的方式，实现卖票
 * @Author 尚硅谷-宋红康
 * @Create 15:24
 * @Version 1.0
 */

class Window extends Thread{
    static int ticket = 100;
    @Override
    public void run() {

        while(true){

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

public class WindowTest1 {
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
