package com.atguigu.calendar;

import java.util.Scanner;

/**
 * @author shk
 * @create 22:29
 */
public class TestCalendar {
    public static void main(String[] args) {
        //日历
        //日    一   二   三   四   五   六
        //必须要计算从1900年1月1日到用户输入的year的month的1号的总天数
        //总天数除7的余数就是星期数
        //1900年1月1日到year年month月day日的总天数？
        //第1步：得到年的累计天数

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入year：");
        int year = scanner.nextInt();
        System.out.print("请输入month：");
        int month = scanner.nextInt();
        //定义一个sumDays来存储累计天数
        int sumDays = 0;
        for (int i = 1900; i < year; i++) {
            //考虑闰年
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                sumDays = sumDays + 366;
            } else {
                sumDays += 365;
            }
        }

        //第2步：得到月的累计天数
        for (int i = 1; i < month; i++) {
            //2月
            if (i == 2) {
                if (isRunYear(i)) {
                    sumDays += 29;
                } else {
                    sumDays += 28;
                }
            } else if (i == 4 || i == 6 || i == 9 || i == 11) {//小月
                sumDays += 30;
            } else {
                sumDays += 31;
            }
        }
        //第3步：累计1号那天
        sumDays++;
        //第4步：获取星期几
        int week = sumDays % 7;


        //第5步：获取当月天数
        int monthDays;
        switch (month) {
            case 2:
                if (isRunYear(year)) {
                    monthDays = 29;
                } else {
                    monthDays = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                monthDays = 30;
                break;
            default:
                monthDays = 31;
                break;
        }

        System.out.println(week);

        //打印日历
        System.out.println("********"+year+"年"+month+"月***********");
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        //打印空格数（星期几）
        for (int i = 0;i < week;i++){
            System.out.print("\t");
        }
        //打印当月天数
        for(int i = 1;i <= monthDays;i++){
            System.out.print(i + "\t");
            //换行
            if(sumDays % 7 == 6){
                System.out.println();
            }
            //累加总天数
            sumDays++;
        }


    }

    //判断是否是闰年
    public static boolean isRunYear(int year) {
        if (year % 4 == 0 & year % 100 != 0 || year % 400 == 0) {
            return true;
        }
        return false;
    }
}
