package com.atguigu01._this;

/**
 * ClassName: UserTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 11:48
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {

        //只创建了User类的1个对象。
        User u1 = new User("Tom",12);


    }
}

class User{

    String name;
    int age;

    public User(){
        //模拟对象创建时，需要初始化50行代码。
    }

    public User(String name){
        this();
        this.name = name;

    }

    public User(String name,int age){
        this(name);
//        this.name = name;
        this.age = age;
    }

//    private void init(){
//        //模拟对象创建时，需要初始化50行代码。
//    }

}
