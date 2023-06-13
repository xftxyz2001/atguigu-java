package com.atguigu01.create.thread;

/**
 * ClassName: EvenNumberTest
 * Description:
 *      例题：创建一个分线程1，用于遍历100以内的偶数
 * @Author 尚硅谷-宋红康
 * @Create 10:31
 * @Version 1.0
 */


//① 创建一个继承于Thread类的子类
class PrintNumber extends Thread{
//    private double money = 1000;
    //② 重写Thread类的run() --->将此线程要执行的操作，声明在此方法体中
    @Override
    public void run() {

        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() +":" + i);
            }
        }

    }
}
public class EvenNumberTest {

    public static void main(String[] args) {

        //③ 创建当前Thread的子类的对象
        PrintNumber t1 = new PrintNumber();

        //④ 通过对象调用start()
        t1.start();

        /*
        * 问题1：能否使用t1.run()替换t1.start()的调用，实现分线程的创建和调用? 不能！
        * */
//        t1.run();

        /*
        * 问题2：再提供一个分线程，用于100以内偶数的遍历。
        *
        * 注意：不能让已经start()的线程，再次执行start(),否则报异常IllegalThreadStateException
        * */
//        t1.start();
        PrintNumber t2 = new PrintNumber();
        t2.start();



        //main()所在的线程执行的操作：
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() +":" + i + "*************");
            }
        }
    }


}