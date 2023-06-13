package com.atguigu02.iterator.interview;

import org.junit.Test;

/**
 * 笔试题：写出如下程序的输出结果
 *
 * @author 尚硅谷-宋红康
 * @create 16:53
 */
public class InterviewTest {
    @Test
    public void testFor() {
        String[] arr1 = new String[]{"AA", "CC", "DD"};

        //赋值操作1
        for(int i = 0;i < arr1.length;i++){
            arr1[i] = "MM";
        }

        //赋值操作2
//        for (String s : arr1) {
//            s = "MM";
//        }


        //遍历
        for (String s : arr1) {
            System.out.println(s);
        }
    }
}
