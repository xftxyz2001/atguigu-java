package com.atguigu02.selfdefine.apply;

import java.util.List;

/**
 * ClassName: DAO
 * Description:
 *    DAO:data(base) access object。内部封装了操作数据库相关表的增删改查操作。(CRUD)
 *
 * @Author 尚硅谷-宋红康
 * @Create 10:01
 * @Version 1.0
 */
public class DAO<T> {

    //增
    public void insert(T bean){
        //通过相应的sql语句，将bean对象的属性值写入到数据表中。
    }

    //删
    public T deleteById(int id){
        //略
        return null;
    }

    //改
    public void update(int id,T bean){
        //略
    }

    //查
    //查询一条记录
    public T queryForInstance(int id){
        //略
        return null;

    }
    //查询多条记录构成的集合
    public List<T> queryForList(int id){
        return null;
    }

    //定义泛型方法
    //比如：查询表中的记录数。（E：Long类型）
    //比如：查询表中最大的生日。（E:Date类型）
    public <E> E getValue(String sql){

        return null;
    }

}
