package com.atguigu04.threadsafemore.lock;

import java.util.concurrent.locks.ReentrantLock;

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

    //1. 创建Lock的实例，需要确保多个线程共用同一个Lock实例!需要考虑将此对象声明为static final
    private static final ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {

        while(true){
            try{
                //2. 执行lock()方法，锁定对共享资源的调用
                lock.lock();

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
            }finally{
                //3. unlock()的调用，释放对共享数据的锁定
                lock.unlock();
            }


        }

    }
}

public class LockTest {
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
