package com.atguigu06.collections.exer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * ClassName: PokerTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 15:30
 * @Version 1.0
 */
public class PokerTest {
    public static void main(String[] args) {

        //1. 组成一副扑克牌
        String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] color = {"方片♦","梅花♣","红桃♥","黑桃♠"};
        ArrayList poker = new ArrayList();

        for(int i = 0;i < color.length;i++){
            for(int j = 0;j < num.length;j++){
                poker.add(color[i] + " " +num[j]);
            }
        }

        //添加大小王
        poker.add("小王");
        poker.add("大王");

        //2. 洗牌
        Collections.shuffle(poker);


        //3. 发牌
        //3.1 创建3个角色和1个底牌对应的4个ArrayList
        ArrayList tom = new ArrayList();
        ArrayList jerry = new ArrayList();
        ArrayList me = new ArrayList();
        ArrayList lastCards = new ArrayList();

        for(int i = 0;i < poker.size();i++){
            if(i >= poker.size() - 3){
                lastCards.add(poker.get(i));
            }else if(i % 3 == 0){
                tom.add(poker.get(i));
            }else if(i % 3 == 1){
                jerry.add(poker.get(i));
            }else if(i % 3 == 2){
                me.add(poker.get(i));
            }

        }

        //3.2 遍历显示4个ArrayList
        System.out.println("Tom:");
        System.out.println(tom);

        System.out.println("Jerry:");
        System.out.println(jerry);

        System.out.println("Me:");
        System.out.println(me);

        System.out.println("底牌:");
        System.out.println(lastCards);


    }
}
