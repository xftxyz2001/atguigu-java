package com.atguigu07._abstract;

/**
 * ClassName: Student
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 14:32
 * @Version 1.0
 */
public class Student extends Person{
    String school;

    public Student() {
    }

    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    public void eat(){
        System.out.println("学生多吃有营养的食物");
    }

    public void sleep(){
        System.out.println("学生要保证充足的睡眠");
    }

    @Override
    public void breath() {
        System.out.println("学生应该多呼吸新鲜空气");
    }
}
