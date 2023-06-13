package com.atguigu07.object.equals;

import java.io.File;
import java.util.Objects;

/**
 * ClassName: UserTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 10:30
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {

        User u1 = new User("Tom",12);
        User u2 = new User("Tom",12);

        System.out.println(u1.equals(u2));//false ---> true
        System.out.println(u1 == u2);


        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println(str1 == str2);//false
        System.out.println(str1.equals(str2));//true

        File file1 = new File("d:\\abc.txt");
        File file2 = new File("d:\\abc.txt");
        System.out.println(file1.equals(file2));//true

        //数组上使用equals()
        int[] arr = new int[10];
        System.out.println(arr.equals(new int[10]));
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

    //重写equals():手动实现
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//
//        if(obj instanceof User){
//            User user = (User)obj;
//            //方式1：
////            if(this.age == user.age && this.name.equals(user.name)){
////                return true;
////            }else{
////                return false;
////            }
//            return this.age == user.age && this.name.equals(user.name);
//        }
//
//        return false;
//    }

    //IDEA自动实现
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

}
