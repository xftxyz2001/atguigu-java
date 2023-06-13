package com.atguigu02.selfdefine.apply;

import java.sql.Date;

/**
 * ClassName: Customer
 * Description:
 *
 *  ORM思想(object relational mapping)
 *  数据库中的一个表 与 Java中的一个类对应
 *  表中的一条记录  与 Java类的一个对象对应
 *  表中的一个字段（或列） 与 Java类的一个属性（或字段）对应
 *
 * @Author 尚硅谷-宋红康
 * @Create 10:04
 * @Version 1.0
 */
public class Customer {
    int id;
    String name;
    String email;
    Date birth;
}
