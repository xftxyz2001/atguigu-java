package com.atguigu07.encapsulation.exer3;

/**
 * ClassName: Employee
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 15:44
 * @Version 1.0
 */
public class Employee {
    //属性
    private String name;
    private char gender;
    private int age;
    private String phoneNumber;

    //提供属性的get和set方法
    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setGender(char g) {
        gender = g;
    }

    public char getGender() {
        return gender;
    }

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    public void setPhoneNumber(String pn) {
        phoneNumber = pn;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getInfo(){
//        return name + "\t" + gender + "\t" + age + "\t" + phoneNumber;
        return getName() + "\t" + getGender() + "\t" + getAge() + "\t" + getPhoneNumber();
    }

}
