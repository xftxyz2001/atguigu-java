package com.atguigu01.string.exer3;

import java.util.Scanner;

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
        //1.创建数组，并初始化几个User对象

        User[] arr = new User[3];
        arr[0] = new User("Tom","8888");
        arr[1] = new User("songhk","123");
        arr[2] = new User("Jerry","6666");

        System.out.println("库中的用户有：");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //2. 实例化Scanner，获取输入的用户名和密码
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String userName = scan.next();
        System.out.print("请输入密码：");
        String password = scan.next();

        //3.遍历数组元素，匹配用户名和密码
        boolean isFlag = true;
        for(int i = 0;i < arr.length;i++){
            if(arr[i].getName().equals(userName)){ //存在此用户名
                isFlag = false;
                if(arr[i].getPassword().equals(password)){
                    System.out.println("登录成功," + userName);

                }else{
                    System.out.println("密码有误");
                }
                break;
            }
        }
        if(isFlag){
            System.out.println("没有该用户");
        }

        scan.close();

    }
}
