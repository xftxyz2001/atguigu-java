package com.atguigu07.encapsulation.exer4.test1;

/**
 * ClassName: Order
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 15:57
 * @Version 1.0
 */
public class Order {
    //声明不同权限的属性
    private int orderPrivate;
    int orderDefault;
    public int orderPublic;

    //声明不同权限的方法
    private void methodPrivate(){

    }
    void methodDefault(){

    }
    public void methodPublic(){

    }

    public void test(){
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;

        methodPrivate();
        methodDefault();
        methodPublic();
    }

}
