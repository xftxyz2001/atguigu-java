package com.atguigu04.set.exer2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * ClassName: Exer02
 * Description:
 *      编写一个程序，获取10个1至20的随机数，要求随机数不能重复。并把最终的随机数输出到控制台。
 * @Author 尚硅谷-宋红康
 * @Create 9:31
 * @Version 1.0
 */
public class Exer02 {
    public static void main(String[] args) {

        Set set = new HashSet();

        while(set.size() < 10){
            int random = (int)(Math.random() * (9 - 1 + 1) + 1);
            set.add(random);
        }

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
