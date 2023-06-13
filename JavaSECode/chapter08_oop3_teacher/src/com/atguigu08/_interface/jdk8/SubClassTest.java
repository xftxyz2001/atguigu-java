package com.atguigu08._interface.jdk8;

/**
 * ClassName: SubClassTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 9:34
 * @Version 1.0
 */
public class SubClassTest {
    public static void main(String[] args) {
        //知识点1：接口中声明的静态方法只能被接口来调用，不能使用其实现类进行调用。
        CompareA.method1();
//        SubClass.method1();

        //知识点2：接口中声明的默认方法可以被实现类继承，实现类在没有重写此方法的情况下，默认调用接口中声明的
        //默认方法。如果实现类重写了此方法，则调用的是自己重写的方法。
        SubClass s1 = new SubClass();
        s1.method2();

        //知识点3：类实现了两个接口，而两个接口中定义了同名同参数的默认方法。则实现类在没有重写此两个接口
        //默认方法的情况下，会报错。 ---->接口冲突
        //要求:此时实现类必须要重写接口中定义的同名同参数的方法。
        s1.method3();

        //知识点4：子类（或实现类）继承了父类并实现了接口。父类和接口中声明了同名同参数的方法。（其中，接口中的方法
        //是默认方法）。默认情况下，子类（或实现类）在没有重写此方法的情况下，调用的是父类中的方法。--->类优先原则
        s1.method4();

    }
}
