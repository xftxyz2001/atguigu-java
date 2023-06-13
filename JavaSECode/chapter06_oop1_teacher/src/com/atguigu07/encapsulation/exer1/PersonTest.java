package com.atguigu07.encapsulation.exer1;

/**
 * ClassName: PersonTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 15:32
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        //创建Person实例1
        Person p1 = new Person();
//        p1.age = 10; //编译不通过
//        System.out.println(p1.age);

        p1.setAge(20);
        System.out.println(p1.getAge());



    }
}
