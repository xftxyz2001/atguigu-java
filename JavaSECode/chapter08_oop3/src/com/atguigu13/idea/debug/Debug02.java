package com.atguigu13.idea.debug;

import java.util.HashMap;

/**
 * ClassName: Debug02
 * Package: com.atguigu.debug
 * Description: 演示2： 方法断点
 *
 * @Author: 尚硅谷-宋红康
 * @Create: 21:15
 * @Version 1.0
 */
public class Debug02 {
    public static void main(String[] args) {

        //1.
//        Son instance = new Son();
//        instance.test();
//        //2.类的多态性
        Father instance1 = new Son();
        instance1.test();
//
//        //3.接口的多态性
        Consumer con = new ConsumerImpl();
        con.accept("atguigu");
//
//        //4.
        HashMap map = new HashMap();
        map.put("Tom",12);
        map.put("Jerry",11);
        map.put("Tony",20);
    }
}

class Father{
    public void test(){
        System.out.println("Father : test1");
        System.out.println("Father : test2");
    }
}

class Son extends Father{
    @Override
    public void test(){
        System.out.println("Son : test1");
        System.out.println("Son : test2");
    }
}

interface Consumer{
    void accept(String str);
}

class ConsumerImpl implements Consumer{

    @Override
    public void accept(String str) {
        System.out.println("ConsumerImple:" + str);
    }
}

