package com.atguigu09.bean_uml;

/**
 * ClassName: UserTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 9:18
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        User u1 = new User();

        System.out.println(u1.age);


        User u2 = new User(2);
        System.out.println(u2.age);
        u2.age = 3;
        u2.age = 4;
    }
}

class User{
    //属性(或实例变量)
    String name;
    int age = 10;

    public User(){
//        age = 20;
    }

    public User(int a){
        age = a;
    }

}
