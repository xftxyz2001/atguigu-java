package com.atguigu09.bean_uml;

/**
 * ClassName: Customer
 * Description:
 *
 *  所谓JavaBean，是指符合如下标准的Java类：
 *
 * - 类是公共的
 * - 有一个无参的公共的构造器
 * - 有属性，且有对应的get、set方法
 *
 * @Author 尚硅谷-宋红康
 * @Create 9:43
 * @Version 1.0
 */
public class Customer {

    public Customer(){

    }

    private int id;
    private String name;

    public void setId(int i){
        id = i;
    }

    public int getId(){
        return id;
    }

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }


}
