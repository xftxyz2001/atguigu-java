package com.atguigu02.selfdefine;

/**
 * ClassName: SubOrder3
 * Description:
 *      SubOrder3是泛型类
 * @Author 尚硅谷-宋红康
 * @Create 9:14
 * @Version 1.0
 */
public class SubOrder3<T> extends Order<T>{

    public void show(T t){
        System.out.println(t);
    }
}
