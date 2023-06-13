package com.atguigu04.override;

/**
 * ClassName: Student
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 9:08
 * @Version 1.0
 */
public class Student extends Person {

    String school;


    public void study(){
        System.out.println("学生学习");
    }

    public void eat(){
        System.out.println("学生应该多吃有营养的食物");
    }

    public void show1(){
        System.out.println("age : " + getAge());

    }
    //重写的针对于返回值的测试
    public int info(){
        return 1;
    }

    public Student info1(){
        return null;
    }

//    public void sleep(){
//        System.out.println("学生应该多睡，养大脑");
//    }


    @Override
    public void sleep() {
        System.out.println("学生应该多睡，养大脑");

    }
}
