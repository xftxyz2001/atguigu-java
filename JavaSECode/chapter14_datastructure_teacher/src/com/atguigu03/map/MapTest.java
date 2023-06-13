package com.atguigu03.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * ClassName: MapTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 10:26
 * @Version 1.0
 */
public class MapTest {
    @Test
    public void test1(){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("AA",123);
    }

    @Test
    public void test2(){
        HashMap<String,Integer> map = new LinkedHashMap<>();
        map.put("AA",123);
    }
}
