package com.atguigu11.annotation;

import java.util.Date;

/**
 * ClassName: AnnotationTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 16:05
 * @Version 1.0
 */
public class AnnotationTest {
    public static void main(String[] args) {
        Person p1 = new Student();
        p1.walk();

        Date date = new Date();
        System.out.println(date);

        Date date1 = new Date(2022,11,29);
        System.out.println(date1);

        Person p2 = new Person();
        @SuppressWarnings({"RedundantExplicitVariableType"}) Person p3 = new Person("Tom");
        System.out.println(p3);


        @SuppressWarnings("unused") int num = 10;

    }
}

@MyAnnotation(value="class")
class Person{
    String name;
    int age;

    @MyAnnotation()
    public Person(){}

    @Deprecated
    public Person(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println("人吃饭");
    }

    public void walk(){
        System.out.println("人走路");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Student extends Person{

    @Override
    public void eat(){
        System.out.println("学生吃饭");
    }
    @Override
    public void walk(){
        System.out.println("学生走路");
    }
}
