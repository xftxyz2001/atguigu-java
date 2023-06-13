package com.atguigu03.list.interview;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shkstart
 * @create 21:36
 */
public class InterviewTest {
    @Test
    public void testListRemove() {
        List list = new ArrayList();
        list.add(1); //自动装箱
        list.add(2);
        list.add(3);
        updateList(list);
        System.out.println(list);//
    }

    private static void updateList(List list) {
//        list.remove(2);
        list.remove(Integer.valueOf(2));
    }
}
