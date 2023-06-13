package com.atguigu06.polymorphism.interview;

/**
 * @author shkstart
 * @create 10:31
 */
class Base {
    int count = 10;
    public void display() {
        System.out.println(this.count);
    }
}

class Sub extends Base {
    int count = 20;
    public void display() {
        System.out.println(this.count);
    }
}

public class FieldMethodTest {
    public static void main(String[] args){
        Sub s = new Sub();
        System.out.println(s.count);//20
        s.display();//20
        Base b = s;
        System.out.println(b == s); //true
        System.out.println(b.count);//10
        b.display();//20

        Base b1 = new Base();
        System.out.println(b1.count); //10
        b1.display();//10
    }
}
