package com.atguigu08._interface.jdk8;

/**
 * ClassName: SubClass
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 9:34
 * @Version 1.0
 */
public class SubClass extends SuperClass implements CompareA,CompareB{

    @Override
    public void method2() {
        System.out.println("SubClass:上海");
    }

    public void method3(){
        System.out.println("SubClass:广州");
    }

    public void method4(){
        System.out.println("SubClass:深圳");
    }

    public void method(){
        //知识点5：如何在子类（或实现类）中调用父类或接口中被重写的方法
        method4();//调用自己类中的方法

        super.method4(); //调用父类中的

        method3();//调用自己类中的方法

        CompareA.super.method3(); //调用接口CompareA中的默认方法
        CompareB.super.method3(); //调用接口CompareB中的默认方法
    }
}
