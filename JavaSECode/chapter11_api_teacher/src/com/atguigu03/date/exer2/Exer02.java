package com.atguigu03.date.exer2;

import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 * ClassName: Exer02
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 16:09
 * @Version 1.0
 */
public class Exer02 {
    /*
    * 使用Calendar获取当前时间, 把这个时间设置为你的生日, 再获取你的百天(出生后100天)日期。
    * */
    @Test
    public void test1(){
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        System.out.println("你的生日为：" + date);

        calendar.add(Calendar.DAY_OF_YEAR,100);
        Date newDate = calendar.getTime();
        System.out.println("100天以后是：" + newDate);

    }
    /*
    * 使用LocalDateTime获取当前时间, 把这个时间设置为你的生日, 再获取你的百天(出生后100天)日期。
    * */
    @Test
    public void test2(){
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("你的生日为：" + localDateTime);

        LocalDateTime localDateTime1 = localDateTime.plusDays(100);
        System.out.println("100天以后是：" + localDateTime1);
    }
}
