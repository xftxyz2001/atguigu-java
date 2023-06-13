package com.atguigu05.communication;

/**
 * ClassName: PrintNumberTest
 * Description:
 *      案例：使用两个线程打印 1-100。线程1, 线程2 交替打印
 * @Author 尚硅谷-宋红康
 * @Create 10:07
 * @Version 1.0
 */

class PrintNumber implements Runnable{

    private int number = 1;
    Object obj = new Object();
    @Override
    public void run() {

        while(true){

//            synchronized (this) {
            synchronized (obj) {

                obj.notify();

                if(number <= 100){

                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number++;

                    try {
                        obj.wait(); //线程一旦执行此方法，就进入等待状态。同时，会释放对同步监视器的调用
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    break;
                }
            }
        }

    }
}

public class PrintNumberTest {
    public static void main(String[] args) {

        PrintNumber p = new PrintNumber();

        Thread t1 = new Thread(p,"线程1");
        Thread t2 = new Thread(p,"线程2");


        t1.start();
        t2.start();

    }
}
