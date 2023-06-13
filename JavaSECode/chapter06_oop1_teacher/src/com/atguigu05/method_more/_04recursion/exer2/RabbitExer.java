package com.atguigu05.method_more._04recursion.exer2;

/**
 * ClassName: RabbitExer
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 10:48
 * @Version 1.0
 */
public class RabbitExer {
    public static void main(String[] args) {
        RabbitExer exer = new RabbitExer();
        int month = 24;
        System.out.println("兔子的对数为：" + exer.getRabbitNumber(month));

    }

    public int getRabbitNumber(int month){
        if(month == 1){
            return 1;
        }else if(month == 2){
            return 1;
        }else{
            return getRabbitNumber(month - 1) + getRabbitNumber(month - 2);
        }
    }
}
