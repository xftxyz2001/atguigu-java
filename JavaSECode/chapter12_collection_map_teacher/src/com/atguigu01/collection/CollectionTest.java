package com.atguigu01.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * ClassName: CollectionTest
 * Description:
 *      测试Collection中方法的使用
 *
 * @Author 尚硅谷-宋红康
 * @Create 11:23
 * @Version 1.0
 */
public class CollectionTest {
    /*
    *   （1）add(Object obj)：添加元素对象到当前集合中
        （2）addAll(Collection other)：添加other集合中的所有元素对象到当前集合中，即this = this ∪ other
    * */
    @Test
    public void test(){
        Collection coll = new ArrayList();

        //add()
        coll.add("AA");
        coll.add(123);//自动装箱
        coll.add("尚硅谷");
        coll.add(new Object());
        coll.add(new Person("Tom",12));

        System.out.println(coll);

        //addAll(Collection other)
        Collection coll1 = new ArrayList();
        coll1.add("BB");
        coll1.add(456);


        System.out.println(coll.size());//5

        coll.addAll(coll1);
//        coll.add(coll1);

        System.out.println(coll);

        //size():
        System.out.println(coll.size());//7


    }

    /*
    *  （3）int size()：获取当前集合中实际存储的元素个数
        （4）boolean isEmpty()：判断当前集合是否为空集合
        （5）boolean contains(Object obj)：判断当前集合中是否存在一个与obj对象equals返回true的元素
        （6）boolean containsAll(Collection coll)：判断coll集合中的元素是否在当前集合中都存在。即coll集合是否是当前集合的“子集”
        （7）boolean equals(Object obj)：判断当前集合与obj是否相等
    * */

    @Test
    public void test2(){
        Collection coll = new ArrayList();

        //add()
        coll.add("AA");
        Person p1 = new Person("Tom",12);
        coll.add(p1);
        coll.add(128);//自动装箱
        coll.add(new String("尚硅谷"));

        //isEmpty()
        System.out.println(coll.isEmpty());

        //contains(Object obj)
        System.out.println(coll.contains("AA"));//true
        System.out.println(coll.contains(128));//true
        System.out.println(coll.contains(new String("尚硅谷")));//true
        System.out.println(coll.contains(new Person("Tom",12)));//false-->true

        //containsAll(Collection coll)
        Collection coll1 = new ArrayList();

        //add()
        coll1.add("AA");
        coll1.add(128);
//        coll1.add("BB");

        System.out.println(coll.containsAll(coll1));
    }

    /*
    *   （8）void clear()：清空集合元素
        （9） boolean remove(Object obj) ：从当前集合中删除第一个找到的与obj对象equals返回true的元素。
        （10）boolean removeAll(Collection coll)：从当前集合中删除所有与coll集合中相同的元素。即this = this - this ∩ coll
        （11）boolean retainAll(Collection coll)：从当前集合中删除两个集合中不同的元素，使得当前集合仅保留与coll集合中的元素相同的元素，即当前集合中仅保留两个集合的交集，即this  = this ∩ coll；
    *
    * */
    @Test
    public void test3(){
        Collection coll = new ArrayList();

        coll.add("AA");
        coll.add("AA");
        Person p1 = new Person("Tom",12);
        coll.add(p1);
        coll.add(128);//自动装箱
        coll.add(new String("尚硅谷"));
        System.out.println(coll);
//        coll.clear();
//        System.out.println(coll);
//        System.out.println(coll.size());//0

        //remove(Object obj)
        coll.remove(new Person("Tom",12));

        coll.remove("AA");
        System.out.println(coll);

    }

    /*
    *  （12）Object[] toArray()：返回包含当前集合中所有元素的数组
        （13）hashCode()：获取集合对象的哈希值
        （14）iterator()：返回迭代器对象，用于集合遍历
    * */
    @Test
    public void test4(){
        Collection coll = new ArrayList();

        coll.add("AA");
        coll.add("AA");
        Person p1 = new Person("Tom",12);
        coll.add(p1);
        coll.add(128);//自动装箱
        coll.add(new String("尚硅谷"));

        //集合 ---> 数组
        Object[] arr = coll.toArray();
        System.out.println(Arrays.toString(arr));

        //hashCode():
        System.out.println(coll.hashCode());

    }

    @Test
    public void test5(){
        String[] arr = new String[]{"AA","BB","CC"};
        Collection list = Arrays.asList(arr);
        System.out.println(list);

        List list1 = Arrays.asList("AA", "BB", "CC", "DD");
        System.out.println(list1);
    }

    @Test
    public void test6(){
        Integer[] arr = new Integer[]{1,2,3};
        List list = Arrays.asList(arr);
        System.out.println(list.size());//3
        System.out.println(list);


        int[] arr1 = new int[]{1,2,3};
        List list1 = Arrays.asList(arr1);
        System.out.println(list1.size());//1
        System.out.println(list1);

    }
}
