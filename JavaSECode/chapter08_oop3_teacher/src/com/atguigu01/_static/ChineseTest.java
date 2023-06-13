package com.atguigu01._static;

/**
 * ClassName: ChineseTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 15:47
 * @Version 1.0
 */
public class ChineseTest {
    public static void main(String[] args) {

        System.out.println(Chinese.nation);
        Chinese.show();


        Chinese c1 = new Chinese();
        c1.name = "姚明";
        c1.age = 40;
        c1.nation = "China";

        Chinese c2 = new Chinese();
        c2.name = "刘翔";
        c2.age = 39;

        System.out.println(c1);
        System.out.println(c2);

        System.out.println(c1.nation);//China
        System.out.println(c2.nation);//China

        c2.nation = "CHN";

        System.out.println(c1.nation);//CHN
        System.out.println(c2.nation);//CHN

        c1.show();

        ChineseTest.test();
    }

    public static void test(){
        System.out.println("我是static的测试方法");
    }
}

class Chinese{ //中国人类
    //非静态变量、实例变量
    String name;
    int age;

    //静态变量、类变量
    static String nation = "中国";

    @Override
    public String toString() {
        return "Chinese{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void eat(String food){
        System.out.println("我喜欢吃" + food);
    }

    public static void show(){
        System.out.println("我是一个中国人");

        //调用静态的结构
        System.out.println("nation = " + Chinese.nation);
        method1();

        //调用非静态的结构
//        System.out.println("name = " + this.name);
//        this.eat("饺子");
    }

    public static void method1(){
        System.out.println("我是静态的测试方法");
    }

    public void method2(){
        System.out.println("我是非静态的测试方法");
        //调用非静态的结构
        System.out.println("name = " + this.name);
        this.eat("饺子");

        //调用静态的结构
        System.out.println("nation = " + nation);
        method1();
    }

    public static String getNation() {
        return nation;
    }

    public static void setNation(String nation) {
        Chinese.nation = nation;
    }
}
