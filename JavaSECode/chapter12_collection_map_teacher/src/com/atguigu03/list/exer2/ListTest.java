package com.atguigu03.list.exer2;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ClassName: ListTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 16:24
 * @Version 1.0
 */
public class ListTest {
    public static void main(String[] args) {

        //需求1：随机生成30个字符，存放在ArrayList中
        ArrayList list = new ArrayList();

        for (int i = 0; i < 30; i++) {
            //'a' - 'z'  [97,122]
            list.add((char)(Math.random() * (122 - 97 + 1) + 97) + "");
        }

        System.out.println(list);


        //
        int aCount = listTest(list, "a");
        int bCount = listTest(list, "b");
        int cCount = listTest(list, "c");
        int xCount = listTest(list, "x");

        System.out.println("a:" + aCount);
        System.out.println("b:" + bCount);
        System.out.println("c:" + cCount);
        System.out.println("x:" + xCount);


    }
    //需求2：遍历ArrayList，查找指定的元素出现的次数
    public static int listTest(Collection list, String s){
        int count = 0;
        for(Object obj : list){
            if(s.equals(obj)){
                count++;
            }
        }
        return count;
    }
}
