package com.atguigu07.object.equals.apply;

/**
 * 说明：判断两个Customer对象是否equals(),除了Customer类需要重写equals()之外，其内部的类类型的属性
 *     所在的类，也需要重写equals()
 *
 * @author shkstart
 * @create 9:45
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer c1 = new Customer("Tom",12,new Account(2000));
        Customer c2 = new Customer("Tom",12,new Account(2000));

        System.out.println(c1.equals(c2));//false -->true
    }
}
