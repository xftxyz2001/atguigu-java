package com.atguigu07.object.tostring;

import java.io.File;
import java.util.Date;

/**
 * @author 尚硅谷-宋红康
 * @create 1:04
 */
public class ToStringTest {
    public static void main(String[] args) {
        User u1 = new User("Tom",12);
        System.out.println(u1.toString());//com.atguigu07.object.tostring.User@1b6d3586 --> User{ name = Tom, age = 12}
        System.out.println(u1);//com.atguigu07.object.tostring.User@1b6d3586 -> User{ name = Tom, age = 12}

        String s1 = new String("hello");
        System.out.println(s1.toString());

        File file = new File("d:\\abc.txt");
        System.out.println(file);

        Date date = new Date();
        System.out.println(date);
    }
}

class User{

    String name;
    int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //手动实现toString()
//    @Override
//    public String toString() {
//        return "User{ name = " + name + ", age = " + age + "}";
//
//    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
