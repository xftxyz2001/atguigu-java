package com.atguigu05._super;

/**
 * ClassName: Student
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 9:08
 * @Version 1.0
 */
public class Student extends Person {
    //属性
    String school;

    int id = 1002;//学号

    public void setSchool(String school){
        this.school = school;
    }

    //方法
    public void study(){
        System.out.println("学生学习");
    }

    public void eat(){
        System.out.println("学生多吃有营养的食物");
    }
    public void sleep(){
        System.out.println("学生保证每天不低于10个小时的睡眠");
    }

    //测试super调用方法、属性
    public void show(){
        eat(); //省略了this
        this.eat();

        super.eat();
    }

    public void show1(){
        doSport();
        this.doSport();
        super.doSport();
    }

    public void show2(){
        System.out.println(id);//1002
        System.out.println(this.id); //1002

        System.out.println(super.id); //1001
    }

    public void show3(){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }

    //测试super调用父类的构造器
    public Student(){
        super();
//        this("Tom",12);
        System.out.println("Student()...");
    }
    public Student(String name,int age){
//        setAge(age);
//        super.name = name;
        super(name,age);
    }

}
