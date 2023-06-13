package com.atguigu07._abstract;

/**
 * ClassName: Worker
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 14:53
 * @Version 1.0
 */
public abstract class Worker extends Person{


    @Override
    public void eat() {
        System.out.println("工人很辛苦，多吃");
    }


}
