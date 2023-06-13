package com.atguigu02.iterator;

import com.atguigu01.collection.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ClassName: ForTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 14:27
 * @Version 1.0
 */
public class ForTest {
    @Test
    public void test(){
        Collection coll = new ArrayList();

        coll.add("AA");
        coll.add("BB");
        Person p1 = new Person("Tom",12);
        coll.add(p1);
        coll.add(128);//自动装箱
        coll.add(new String("尚硅谷"));


        for(Object obj : coll){
            System.out.println(obj);
        }

    }

    @Test
    public void test2(){
        int[] arr = new int[]{1,2,3,4,5};

        for(int i : arr){
            System.out.println(i);
        }
    }

    @Test
    public void test3(){
        String[] arr = new String[]{"GG","JJ","DD","MM","SS"};

        for(String s : arr){
            System.out.println(s);
        }
    }
}
