package com.atguigu04.set.exer1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * ClassName: Exer01
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 9:22
 * @Version 1.0
 */
public class Exer01 {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add(34);
        list.add(34);
        list.add(34);
        list.add(22);
        list.add(22);
        list.add(22);
        list.add(45);
        list.add(45);
        list.add(45);

        List newList = duplicateList(list);
        System.out.println(newList);

    }

    public static List duplicateList(List list){
        //方式1：
//        HashSet set = new HashSet();
//        for(Object obj:list){
//            set.add(obj);
//        }
//
//        List list1 = new ArrayList();
//        for(Object obj : set){
//            list1.add(obj);
//        }
//        return list1;
        //方式2：
        HashSet set = new HashSet(list);
        List list1 = new ArrayList(set);
        return list1;
    }

}
