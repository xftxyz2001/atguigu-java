package com.atguigu06.polymorphism.exer3;

/**
 * ClassName: InstanceTest
 * Description:
 *      建立InstanceTest 类，在类中定义方法method(Person e);
 *      在method中:
 *      (1)根据e的类型调用相应类的getInfo()方法。
 *      (2)根据e的类型执行：
 *      如果e为Person类的对象，输出：
 *      “a person”;
 *      如果e为Student类的对象，输出：
 *      “a student”
 *      “a person ”
 *      如果e为Graduate类的对象，输出：
 *      “a graduated student”
 *      “a student”
 *      “a person”
 * @Author 尚硅谷-宋红康
 * @Create 9:13
 * @Version 1.0
 */
public class InstanceTest {

    public static void main(String[] args) {

        InstanceTest test = new InstanceTest();

        test.method(new Student());

    }

    public void method(Person e){

        System.out.println(e.getInfo());

        //方式1：
//        if(e instanceof Graduate){
//            System.out.println("a graduated student");
//            System.out.println("a student");
//            System.out.println("a person");
//        }else if(e instanceof Student){
//            System.out.println("a student");
//            System.out.println("a person");
//        }else{
//            System.out.println("a person");
//        }
        //方式2
        if(e instanceof Graduate){
            System.out.println("a graduated student");
        }

        if(e instanceof Student){
            System.out.println("a student");
        }

        if(e instanceof Person){
            System.out.println("a person");
        }
    }
}



