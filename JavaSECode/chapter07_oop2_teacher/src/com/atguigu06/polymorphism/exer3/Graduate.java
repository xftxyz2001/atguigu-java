package com.atguigu06.polymorphism.exer3;

/**
 * ClassName: Graduate
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 9:15
 * @Version 1.0
 */
public class Graduate extends Student{
    public String major="IT";
    public String getInfo()
    {
        return  "Name: "+ name + "\nage: "+ age
                + "\nschool: "+ school+"\nmajor:"+major;
    }
}
