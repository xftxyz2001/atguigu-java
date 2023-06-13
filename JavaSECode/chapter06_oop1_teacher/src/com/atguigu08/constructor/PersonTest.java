package com.atguigu08.constructor;

import java.util.Scanner;

/**
 * ClassName: PersonTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 16:21
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {

        Person p1 = new Person();

        p1.eat();

        Person p2 = new Person(1);
        System.out.println(p2.age); //1


        Scanner scan = new Scanner(System.in);

    }
}
