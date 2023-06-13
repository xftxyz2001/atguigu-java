package com.atguigu06.polymorphism;

/**
 * ClassName: PersonTest1
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 17:03
 * @Version 1.0
 */
public class PersonTest1 {
    public static void main(String[] args) {
        Person p1 = new Man();
        //不能直接调用子类特有的结构
//        p1.earnMoney();
//        System.out.println(p1.isSmoking);
//

        //向下转型：使用强转符。
        Man m1 = (Man)p1;
        m1.earnMoney();
        System.out.println(m1.isSmoking);

        System.out.println(p1 == m1);//true,p1和m1指向堆空间中的同一个对象。

        /*
        * 向下转型可能会出现：类型转换异常（ClassCastException）
        * */
        Person p2 = new Woman();
//        Man m2 = (Man)p2;
//        m2.earnMoney();

        /*
        * 1. 建议在向下转型之前，使用instanceof进行判断，避免出现类型转换异常
        * 2. 格式： a instanceOf A : 判断对象a是否是类A的实例。
        * 3. 如果a instanceOf A 返回true，则：
        *       a instanceOf superA 返回也是true。其中，A 是superA的子类。
        * */
        if(p2 instanceof Man){
            Man m2 = (Man)p2;
            m2.earnMoney();
        }

        if(p2 instanceof Woman){
            System.out.println("Woman");
        }

        if(p2 instanceof Person){
            System.out.println("Person");
        }
        if(p2 instanceof Object){
            System.out.println("Object");
        }

    }
}
