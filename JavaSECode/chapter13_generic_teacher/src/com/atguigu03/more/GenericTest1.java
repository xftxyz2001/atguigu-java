package com.atguigu03.more;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: GenericTest1
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 11:14
 * @Version 1.0
 */
public class GenericTest1 {
    /*
    * 测试：通配符?的使用
    * */
    @Test
    public void test1(){

        List<?> list = null;
        List<Object> list1 = null;
        List<String> list2 = null;

        list = list1;
        list = list2;


        method(list1);
        method(list2);


    }

    public void method(List<?> list){
        for(Object obj : list){
            System.out.println(obj);
        }

//        list.add("AA");//错误的
    }

    @Test
    public void test2(){
        List<?> list = null;

        List<String> list1 = new ArrayList<>();
        list1.add("AA");

        list = list1;

        //读取数据（以集合为例说明）
        Object obj = list.get(0);
        System.out.println(obj);

        //写入数据（以集合为例说明）
        //写入数据，操作失败。
//        list.add("BB");
        //特例：可以将null写入集合中。
        list.add(null);

    }

    //测试：有限制条件的通配符的使用
    /*
    *
    * ? super A:
    *
    * */
    @Test
    public void test3(){
        List<? extends Father> list = null;

        List<Object> list1 = null;
        List<Father> list2 = null;
        List<Son> list3 = null;

//        list = list1;
        list = list2;
        list = list3;
    }

    /*
    * 针对于? extends A的读写
    * */
    @Test
    public void test3_1(){
        List<? extends Father> list = null;

        List<Father> list1 = new ArrayList<>();
        list1.add(new Father());
        list = list1;

        //读取数据：可以的
        Father father = list.get(0);

        //写入数据：不可以的。例外：null
        list.add(null);
//        list.add(new Father());
//        list.add(new Son());
    }

    @Test
    public void test4(){
        List<? super Father> list = null;

        List<Object> list1 = null;
        List<Father> list2 = null;
        List<Son> list3 = null;

        list = list1;
        list = list2;
//        list = list3;
    }

    @Test
    public void test4_1(){
        List<? super Father> list = null;
        List<Father> list1 = new ArrayList<>();
        list1.add(new Father());

        list = list1;
        //读取数据：可以的
        Object obj = list.get(0);

        //写入数据：可以将Father及其子类的对象添加进来
        list.add(null);
//        list.add(new Object());
        list.add(new Father());
        list.add(new Son());
    }

}
