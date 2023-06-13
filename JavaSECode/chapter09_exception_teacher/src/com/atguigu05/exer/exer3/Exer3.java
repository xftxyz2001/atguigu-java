package com.atguigu05.exer.exer3;

/**
 * ClassName: Exer3
 * Description:
 *      ① 使用满参构造方法创建Person对象，生命值传入一个负数
 *
 *      由于一旦遇到异常,后面的代码的将不在执行,所以需要注释掉上面的代码
 *
 *      ② 使用空参构造创建Person对象
 *
 *      调用setLifeValue(int lifeValue)方法,传入一个正数,运行程序
 *
 *      调用setLifeValue(int lifeValue)方法,传入一个负数,运行程序
 *
 *      ③ 分别对①和②处理异常和不处理异常进行运行看效果
 * @Author 尚硅谷-宋红康
 * @Create 11:23
 * @Version 1.0
 */
public class Exer3 {
    public static void main(String[] args) {

        //1. 使用有参的构造器
        try {
//        Person p1 = new Person("Tom",10);
            Person p1 = new Person("Tom", -10);
            System.out.println(p1);
        }catch (NoLifeValueException e){
            System.out.println(e.getMessage());
        }

        //2. 使用空参的构造器
        Person p2 = new Person();
        p2.setName("Jerry");
        p2.setLifeValue(10);
//        p2.setLifeValue(-10);

        System.out.println(p2);

    }
}
