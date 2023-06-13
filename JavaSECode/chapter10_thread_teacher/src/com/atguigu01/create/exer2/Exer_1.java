package com.atguigu01.create.exer2;

/**
 * ClassName: Exer_1
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 12:00
 * @Version 1.0
 */
public class Exer_1 {
    public static void main(String[] args) {
//        BB b = new BB();
//        new Thread(b){
////            @Override
////            public void run() {
////                System.out.println("CC");
////            }
//        }.start();

//        new Thread(){}.start();

    }
}

class AA extends Thread{
    @Override
    public void run() {
        System.out.println("AA");
    }
}

class BB implements Runnable{
    @Override
    public void run() {
        System.out.println("BB");
    }
}
