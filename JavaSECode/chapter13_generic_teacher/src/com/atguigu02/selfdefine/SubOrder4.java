package com.atguigu02.selfdefine;

/**
 * ClassName: SubOrder4
 * Description:
 *      SubOrder4是泛型类
 * @Author 尚硅谷-宋红康
 * @Create 9:16
 * @Version 1.0
 */
public class SubOrder4<E> extends Order<Integer>{

    E e;

    public SubOrder4() {
    }

    public SubOrder4(E e) {
        this.e = e;
    }

    public SubOrder4(Integer integer, int orderId, E e) {
        super(integer, orderId);
        this.e = e;
    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }
}
