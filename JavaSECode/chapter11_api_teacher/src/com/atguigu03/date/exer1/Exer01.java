package com.atguigu03.date.exer1;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName: Exer01
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 14:42
 * @Version 1.0
 */
public class Exer01 {
    /*
    * 练习：
    如何将一个java.util.Date的实例转换为java.sql.Date的实例
    * */
    @Test
    public void test1(){
        Date date1 = new Date();
        //错误的：
//        java.sql.Date date2 = (java.sql.Date) date1;
//        System.out.println(date2);

        //正确的：
        java.sql.Date date2 = new java.sql.Date(date1.getTime());
        System.out.println(date2);
    }

    /*
    * 拓展：
        将控制台获取的年月日（比如：2022-12-13）的字符串数据，保存在数据库中。
        （简化为得到java.sql.Date的对象，此对象对应的时间为2022-12-13）。
        *
        * 字符串 ---> java.util.Date ---> java.sql.Date
    * */
    @Test
    public void test2() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String pattern = "2022-12-13";
        //得到java.util.Date
        Date date1 = sdf.parse(pattern);
        //转换为java.sql.Date
        java.sql.Date date2 = new java.sql.Date(date1.getTime());
        System.out.println(date2);
    }
}
