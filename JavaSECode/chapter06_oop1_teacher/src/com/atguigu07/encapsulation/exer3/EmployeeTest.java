package com.atguigu07.encapsulation.exer3;

import java.util.Scanner;

/**
 * ClassName: EmployeeTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 15:49
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //创建Employee[]
        Employee[] emps = new Employee[2];

        for (int i = 0; i < emps.length; i++) {

            emps[i] = new Employee();

            System.out.println("----------添加第" + (i + 1) + "个员工----------");
            System.out.print("姓名：");
            String name = scan.next();
            System.out.print("性别：");
            char gender = scan.next().charAt(0);
            System.out.print("年龄：");
            int age = scan.nextInt();
            System.out.print("电话：");
            String phoneNumber = scan.next();

            //给指定的employee对象的各属性赋值
            emps[i].setName(name);
            emps[i].setGender(gender);
            emps[i].setAge(age);
            emps[i].setPhoneNumber(phoneNumber);
        }

        //遍历员工列表
        System.out.println("---------------员工列表------------------");
        System.out.println("编号\t姓名\t性别\t年龄\t电话");
        for (int i = 0; i < emps.length; i++) {
            System.out.println((i + 1) + "\t" + emps[i].getInfo());
        }
        System.out.println("---------------员工列表完成------------------");
    }
}
