package com.atguigu02.selfdefine;

import org.junit.Test;

import java.util.ArrayList;

/**
 * ClassName: GenericTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 8:54
 * @Version 1.0
 */
public class GenericTest {

    @Test
    public void test1(){
        Person p1 = new Person();

//        Person<String> p2 = new Person<>();
        ArrayList<String> list = new ArrayList<>();
        list.add("AA");
//        list.add(123);

        ArrayList list1 = new ArrayList(); //向下兼容。jdk5.0之前集合是没有声明为泛型的。
        list1.add(123);
        list1.add("AA");
    }

    //测试自定义的泛型类
    @Test
    public void test2(){
        //实例化时，就可以指明类的泛型参数的类型
        Order order = new Order();  //Order<Object> order3 = new Order<>();
        Object obj = order.getT();

        //泛型参数在指明时，是不可以使用基本数据类型的！但是可以使用包装类替代基本数据类型。
//        Order<int> order1 = new Order<>();
        //在实例化时，可以指明类的泛型参数的具体类型！一旦指明了泛型的类型，则在泛型类中凡是使用泛型
        //参数的位置，都替换为指定的类型。
        Order<Integer> order2 = new Order<Integer>();
        Integer t = order2.getT();


        Order<String> order3 = new Order<>();
        order3.setT("AA");


    }

    //测试Order的子类
    @Test
    public void test3(){
        //实例化SubOrder1
        SubOrder1 sub1 = new SubOrder1();
        Object t = sub1.getT();

//        SubOrder1<Integer> sub2 = new SubOrder1<>();//因为SubOrder1不是泛型类，此处编译错误
    }

    @Test
    public void test4(){
        SubOrder2 sub1 = new SubOrder2();
        Integer t = sub1.getT();


        SubOrder3<String> sub2 = new SubOrder3<>();
        String t1 = sub2.getT();
        sub2.show("AA");

        SubOrder4<String> sub3 = new SubOrder4<>();
        Integer t2 = sub3.getT();
        String e = sub3.getE();

        SubOrder5<String,Integer>  sub4 = new SubOrder5<>();
        String t3 = sub4.getT();
        Integer e1 = sub4.getE();



    }

    //测试泛型方法的使用
    @Test
    public void test5(){
        Order<String> order1 = new Order<>();

        Integer[] arr = new Integer[]{1,2,3,4,5};
        ArrayList<Integer> list = order1.copyFromArrayToList(arr);
        for(Integer i : list){
            System.out.println(i);
        }
    }

}
