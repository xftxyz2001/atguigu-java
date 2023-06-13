package com.atguigu04.example.exer1;

/**
 * ClassName: PersonTest
 * Description:
 *
 *  创建Person类的对象，设置该对象的name、age和gender属性，
 *  调用study方法，输出字符串“studying”;
 *  调用showAge()方法，返回age值;
 *  调用addAge(int addAge)方法给对象的age属性值增加addAge岁。比如：2岁。
 *
 *  创建第二个对象，执行上述操作，体会同一个类的不同对象之间的关系。
 *
 * @Author 尚硅谷-宋红康
 * @Create 11:43
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();

        //调用属性
        p1.name = "Tom";
        p1.age = 12;
        p1.gender = '男';
        //调用方法
        p1.study();

        p1.addAge(2);

        int age = p1.showAge();
        System.out.println("age = " + age);//12 --> 14


        Person p2 = new Person();

        System.out.println(p2.age);//0

        p2.addAge(10);

        System.out.println(p2.showAge());//10

        System.out.println(p1.showAge());//14
    }
}
