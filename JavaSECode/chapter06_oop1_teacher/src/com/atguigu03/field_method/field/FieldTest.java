package com.atguigu03.field_method.field;

/**
 * @author 尚硅谷-宋红康
 * @create 20:07
 */
public class FieldTest {
    public static void main(String[] args) {

        Person p1 = new Person();

        System.out.println(p1.name + "," + p1.age);


        p1.sleep(8);

        p1.eat();

    }
}

class Person{
    //属性(或成员变量）
    String name;
    int age;
    char gender;


    //方法
    public void eat(){
        String food = "宫保鸡丁"; //局部变量
        System.out.println("我喜欢吃" + food);
    }

    public void sleep(int hour){ //形参：属于局部变量
        System.out.println("人不能少于" + hour + "小时的睡眠");

        //编译不通过，因为超出了food变量的作用域
//        System.out.println("我喜欢吃" + food);

        //编译通过。
        System.out.println("name = " + name);
    }

}

