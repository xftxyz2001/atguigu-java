package com.atguigu04.set;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * ClassName: SetTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 16:44
 * @Version 1.0
 */
public class SetTest {
    @Test
    public void test1(){
        Set set = new HashSet();

        set.add("AA");
        set.add(123);
        set.add("BB");
        set.add(new Person("Tom",12));
        set.add(new Person("Tom",12));

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

//        System.out.println(set.contains(new Person("Tom", 12)));
    }

    @Test
    public void test2(){
        Set set = new LinkedHashSet();

        set.add("AA");
        set.add("AA");
        set.add(new Person("Tom",12));
        set.add(123);
        set.add("BB");

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
