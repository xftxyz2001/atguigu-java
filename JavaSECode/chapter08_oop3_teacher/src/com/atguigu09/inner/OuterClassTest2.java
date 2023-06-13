package com.atguigu09.inner;

/**
 * ClassName: OuterClassTest2
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 11:28
 * @Version 1.0
 */
public class OuterClassTest2 {
    public static void main(String[] args) {

        SubA a = new SubA();
        a.method();

        //举例1：提供接口匿名实现类的对象
        A a1 = new A(){
            public void method(){
                System.out.println("匿名实现类重写的方法method()");
            }
        };

        a1.method();

        //举例2：提供接口匿名实现类的匿名对象
        new A(){
            public void method(){
                System.out.println("匿名实现类重写的方法method()");
            }
        }.method();

        //举例3：
        SubB s1 = new SubB();
        s1.method1();

        //举例4：提供了继承于抽象类的匿名子类的对象
        B b = new B(){
            public void method1(){
                System.out.println("继承于抽象类的子类调用的方法");
            }
        };

        b.method1();
        System.out.println(b.getClass());
        System.out.println(b.getClass().getSuperclass());

        //举例5：
        new B(){
            public void method1(){
                System.out.println("继承于抽象类的子类调用的方法1");
            }
        }.method1();

        //举例6：
        C c = new C();
        c.method2();

        //举例7：提供了一个继承于C的匿名子类的对象
        C c1 = new C(){};
        c1.method2();
        System.out.println(c1.getClass());
        System.out.println(c1.getClass().getSuperclass());


        C c2 = new C(){
            public void method2(){
                System.out.println("SubC");
            }
        };
        c2.method2();

    }
}

interface A{
    public void method();
}

class SubA implements A{

    @Override
    public void method() {
        System.out.println("SubA");
    }
}

abstract class B{

    public abstract void method1();

}

class SubB extends B{

    @Override
    public void method1() {
        System.out.println("SubB");
    }
}


class C{
    public void method2(){
        System.out.println("C");
    }
}
