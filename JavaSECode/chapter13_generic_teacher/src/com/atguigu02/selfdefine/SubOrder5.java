package com.atguigu02.selfdefine;

/**
 * ClassName: SubOrder5
 * Description:
 *      SubOrder5是泛型类
 *
 * @Author 尚硅谷-宋红康
 * @Create 9:19
 * @Version 1.0
 */
public class SubOrder5<T,E> extends Order<T>{

    E e;

    public SubOrder5() {
    }

    public SubOrder5(T t, int orderId, E e) {
        super(t, orderId);
        this.e = e;
    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }
}
