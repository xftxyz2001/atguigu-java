package com.atguigu03.map.exer;

import java.util.HashMap;

/**
 * 分析此map的内存结构
 *
 * @author 尚硅谷-宋红康
 * @create 12:13
 */
public class MapExer {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(31, "张三");
        map.put(31, "李四");
        map.put(47, "王五");
        map.put(45, "赵六");
    }

}
