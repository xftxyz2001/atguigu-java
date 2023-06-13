package com.atguigu03.more;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: GenericTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 10:57
 * @Version 1.0
 */
public class GenericTest {
    @Test
    public void test1(){
        //1.
        Object obj = null;
        String str = "AA";

        obj = str;  //基于继承性的多态的使用

        //2.
        Object[] arr = null;
        String[] arr1 = null;

        arr = arr1;//基于继承性的多态的使用
    }

    /*
    * 类SuperA是类A的父类，则G<SuperA> 与 G<A>的关系：G<SuperA> 和 G<A>是并列的两个类，没有任何子父类的关系。
    * */
    @Test
    public void test2(){
        ArrayList<Object> list1 = null;
        ArrayList<String> list2 = new ArrayList<>();

//        list1 = list2;
        /*
        * 反证法：
        * 假设list1 = list2是可以的。
        * list2.add("AA");
        *
        * list1.add(123);
        *
        * String str = list2.get(1); //相当于取出的123赋值给了str，错误的。
        *
        * */

        method(list1);
//        method(list2);//错误的
    }

    @Test
    public void test3(){
        Person<Object> per = null;
        Person<String> per1 = null;
//        per = per1;
    }

    public void method(ArrayList<Object> list){

    }

    /*
    * 类SuperA是类A的父类或接口，SuperA<G> 与 A<G>的关系：SuperA<G> 与A<G> 有继承或实现的关系。
        即A<G>的实例可以赋值给SuperA<G>类型的引用（或变量）
    * */
    @Test
    public void test4(){
        List<String> list1 = null;
        ArrayList<String> list2 = new ArrayList<>();

        list1 = list2;

        list1.add("AA");

        method(list2);
    }

    public void method(List<String> list){

    }
}
