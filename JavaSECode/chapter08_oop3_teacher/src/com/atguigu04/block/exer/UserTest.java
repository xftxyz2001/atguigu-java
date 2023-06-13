package com.atguigu04.block.exer;

/**
 * ClassName: UserTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 10:25
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        User u1 = new User();
        System.out.println(u1.getInfo());

        User u2 =  new User("Tom","654321");
        System.out.println(u2.getInfo());

        System.out.println();
        User1 u3 = new User1();
        System.out.println(u3.getInfo());

    }
}
