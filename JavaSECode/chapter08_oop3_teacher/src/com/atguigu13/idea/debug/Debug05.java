package com.atguigu13.idea.debug;

/**
 * ClassName: Debug07
 * Package: com.atguigu.debug
 * Description: 演示5：强制结束
 *
 * @Author: 尚硅谷-宋红康
 * @Create: 23:15
 * @Version 1.0
 */
public class Debug05 {
    public static void main(String[] args) {
        System.out.println("获取请求的数据");
        System.out.println("调用写入数据库的方法");
        insert();
        System.out.println("程序结束");
    }

    private static void insert() {
        System.out.println("进入insert()方法");
        System.out.println("获取数据库连接");
        System.out.println("将数据写入数据表中");
        System.out.println("写出操作完成");
        System.out.println("断开连接");
    }
}
