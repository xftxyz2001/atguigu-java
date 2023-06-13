package com.atguigu01.oop;

/**
 * @author 尚硅谷-宋红康
 * @create 16:26
 */
public class Phone {



    //属性
    String name;//品牌
    double price;//价格


    //方法
    public void call(){
        System.out.println("手机能够拨打电话");
    }

    public void sendMessage(String message){
        System.out.println("发送信息：" + message);
    }

    public void playGame(){
        System.out.println("手机可以玩游戏");
    }

}
