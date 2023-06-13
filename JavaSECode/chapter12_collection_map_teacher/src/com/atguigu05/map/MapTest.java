package com.atguigu05.map;

import org.junit.Test;

import java.util.*;

/**
 * ClassName: MapTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 10:03
 * @Version 1.0
 */
public class MapTest {

    /*
    * 测试Map中的实现类
    * */
    @Test
    public void test1(){
        Map map = new HashMap();

        map.put(null,null);
        map.put("Tom",23);
        map.put("CC",new Date());
        map.put(34,"AA");

        System.out.println(map);
    }

    @Test
    public void test2(){
        Map map = new Hashtable();

//        map.put(null,123);
//        map.put("AA",null);

        System.out.println(map);
    }

    @Test
    public void test3(){
        LinkedHashMap map = new LinkedHashMap();
        map.put("Tom",23);
        map.put("CC",new Date());
        map.put(34,"AA");

        System.out.println(map);
    }

    /*
    * 测试Map中的常用方法
    *
    *     增：
            put(Object key,Object value)
            putAll(Map m)
        删：
            Object remove(Object key)
        改：
            put(Object key,Object value)
            putAll(Map m)
        查：
            Object get(Object key)
        长度：
            size()
        遍历：
           遍历key集：Set keySet()
           遍历value集：Collection values()
           遍历entry集：Set entrySet()
    *
    * */
    @Test
    public void test4(){
        HashMap map = new HashMap();

        //添加：put(Object key,Object value)
        map.put("AA",56);
        map.put(67,"Tom");
        map.put("BB",78);
        map.put(new Person("Jerry",12),56);

        System.out.println(map);
        //size()
        System.out.println(map.size());

        //Object remove(Object key)
        Object value = map.remove("AA");
        System.out.println(value);
        System.out.println(map);

        //修改：put(Object key,Object value)
        Object oldValue = map.put("BB",99);
        System.out.println(oldValue); //78
        System.out.println(map);

        //get(Object key)
        Object value1 = map.get(67);
        System.out.println(value1);
    }
    //map的遍历操作
    @Test
    public void test5(){
        HashMap map = new HashMap();

        map.put("AA",56);
        map.put(67,"Tom");
        map.put("BB",78);
        map.put(new Person("Jerry",12),56);

        //遍历key集：Set keySet()
        Set keySet = map.keySet();
        //使用迭代器
        Iterator iterator = keySet.iterator();
        while(iterator.hasNext()){
            Object key = iterator.next();
            System.out.println(key);
        }

        //遍历value集：Collection values()
        //方式1：推荐
//        Collection values = map.values();
//        //使用增强for
//        for(Object obj : values){
//            System.out.println(obj);
//        }
        //方式2：
//        Set keySet1 = map.keySet();
//        for (Object key : keySet1){
//            Object value = map.get(key);
//            System.out.println(value);
//        }



    }

    @Test
    public void test6(){

        HashMap map = new HashMap();

        map.put("AA",56);
        map.put(67,"Tom");
        map.put("BB",78);
        map.put(new Person("Jerry",12),56);

        //方式1：遍历entry集：Set entrySet()
        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while(iterator.hasNext()){
            //方法1：
//            System.out.println(iterator.next());
            //方法2：
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey() + "--->" + entry.getValue());

        }

        //方式2：遍历entry集：keySet() 、get(key)
//        Set keySet = map.keySet();
//        for (Object key : keySet){
//            System.out.println(key + "---->" + map.get(key));
//        }
    }
}
