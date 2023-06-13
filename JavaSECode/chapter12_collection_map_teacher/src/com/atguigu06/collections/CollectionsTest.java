package com.atguigu06.collections;

import org.junit.Test;

import java.util.*;

/**
 * ClassName: CollectionsTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 15:04
 * @Version 1.0
 */
public class CollectionsTest {
    /*
    * 排序操作：
        - reverse(List)：反转 List 中元素的顺序
        - shuffle(List)：对 List 集合元素进行随机排序
        - sort(List)：根据元素的自然顺序对指定 List 集合元素按升序排序
        - sort(List，Comparator)：根据指定的 Comparator 产生的顺序对 List 集合元素进行排序
        - swap(List，int， int)：将指定 list 集合中的 i 处元素和 j 处元素进行交换
    * */
    @Test
    public void test1(){
        List list = Arrays.asList(45, 43, 65, 6, 43, 2, 32, 45, 56, 34, 23);
        System.out.println(list);
        //reverse(List)：反转 List 中元素的顺序
//        Collections.reverse(list);

        //shuffle(List)：对 List 集合元素进行随机排序
//        Collections.shuffle(list);

        //sort(List)：根据元素的自然顺序对指定 List 集合元素按升序排序
//        Collections.sort(list);

        //sort(List，Comparator)：根据指定的 Comparator 产生的顺序对 List 集合元素进行排序
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Integer && o2 instanceof Integer){
                    Integer i1 = (Integer) o1;
                    Integer i2 = (Integer) o2;

//                    return i1 - i2;
                    return -(i1.intValue() - i2.intValue());
                }
                throw new RuntimeException("类型不匹配");
            }
        });


        System.out.println(list);
    }

    /*
    * 查找
    - Object max(Collection)：根据元素的自然顺序，返回给定集合中的最大元素
    - Object max(Collection，Comparator)：根据 Comparator 指定的顺序，返回给定集合中的最大元素
    - Object min(Collection)：根据元素的自然顺序，返回给定集合中的最小元素
    - Object min(Collection，Comparator)：根据 Comparator 指定的顺序，返回给定集合中的最小元素
    - int binarySearch(List list,T key)在List集合中查找某个元素的下标，但是List的元素必须是T或T的子类对象，而且必须是可比较大小的，即支持自然排序的。而且集合也事先必须是有序的，否则结果不确定。
    - int binarySearch(List list,T key,Comparator c)在List集合中查找某个元素的下标，但是List的元素必须是T或T的子类对象，而且集合也事先必须是按照c比较器规则进行排序过的，否则结果不确定。
    - int frequency(Collection c，Object o)：返回指定集合中指定元素的出现次数
    *
    * */

    @Test
    public void test2(){
        List list = Arrays.asList(45, 43, 65, 6, 43, 2, 32, 45, 56, 34, 23);
        System.out.println(list);

        Object max = Collections.max(list);


        Object max1 = Collections.max(list,new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Integer && o2 instanceof Integer){
                    Integer i1 = (Integer) o1;
                    Integer i2 = (Integer) o2;

//                    return i1 - i2;
                    return -(i1.intValue() - i2.intValue());
                }
                throw new RuntimeException("类型不匹配");
            }
        });

        System.out.println(max);
        System.out.println(max1);

        int count = Collections.frequency(list, 45);
        System.out.println("45出现了" + count + "次");
    }

    @Test
    public void test3(){
        List src = Arrays.asList(45, 43, 65, 6, 43, 2, 32, 45, 56, 34, 23);
        //void copy(List dest,List src)：将src中的内容复制到dest中
        //错误的写法：
//        List dest = new ArrayList();
        //正确的写法：
        List dest = Arrays.asList(new Object[src.size()]);


        Collections.copy(dest,src);

        System.out.println(dest);
    }

    @Test
    public void test4(){
        //提供了多个unmodifiableXxx()方法，该方法返回指定 Xxx的不可修改的视图。

        List list1 = new ArrayList();
        //list1可以写入数据
        list1.add(34);
        list1.add(12);
        list1.add(45);

        List list2 = Collections.unmodifiableList(list1);
        //此时的list2只能读，不能写
        list2.add("AA");//不能写
        System.out.println(list2.get(0));//34
    }

    @Test
    public void test5(){
        //Collections 类中提供了多个 synchronizedXxx() 方法
        List list1 = new ArrayList();
        //返回的list2就是线程安全的
        List list2 = Collections.synchronizedList(list1);
        list2.add(123);

        HashMap map1 = new HashMap();
        //返回的map2就是线程安全的
        Map map2 = Collections.synchronizedMap(map1);

    }
}
