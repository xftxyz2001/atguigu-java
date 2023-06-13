package com.atguigu06.polymorphism.exer3;

/**
 * ClassName: Student
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 9:14
 * @Version 1.0
 */
public class Student extends Person {
    protected String school="pku";
    public String getInfo() {
        return  "Name: "+ name + "\nage: "+ age
                + "\nschool: "+ school;
    }
}
