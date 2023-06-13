package com.atguigu03.reflectapply.data;

/**
 * @author 尚硅谷-宋红康
 * @create 14:07
 */
public class Creature<T> {

    boolean gender;
    public int id;

    public void breath(){
        System.out.println("呼吸");
    }
    private void info(){
        System.out.println("我是一个生物");
    }

}
