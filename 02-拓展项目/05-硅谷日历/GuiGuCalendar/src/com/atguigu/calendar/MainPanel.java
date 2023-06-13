package com.atguigu.calendar;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

/**
 * @author shk
 * @create 23:28
 */
public class MainPanel extends JPanel {  //面板
    private int year = 2021;
    private int month = 1;
    public MainPanel(){
        this.setBackground(Color.yellow);
    }

    public MainPanel(int year,int month){
        this();
        this.year = year;
        this.month = month;
    }

    //要获取画笔，必须重写如下的方法
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
//        int year = 2021;
//        int month = 1;
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

        //画格子线
        for(int i = 0;i < 8;i++){
            //画横线
            g.drawLine(0,this.getHeight() / 7 * i,this.getWidth(),this.getHeight() / 7 * i);
            //画竖线
            g.drawLine(this.getWidth() / 7 * i,0,this.getWidth() / 7 * i,this.getHeight());
        }


        //打印日历
        String[] weeks = new String[]{"日","一","二","三","四","五","六"};
        for(int i = 0;i < weeks.length;i++){
            g.drawString(weeks[i],this.getWidth() / 7 * i + 16,30);
        }

        int mx = week * this.getWidth() / 7;
        int my = this.getHeight() / 7;
        //打印当月天数
        for(int i = 1;i <= monthDays;i++){
            g.drawString(i + "",mx + 16,my + 30);
            mx += this.getWidth() / 7;
            //换行
            if(sumDays % 7 == 6){
                mx = 0;
                my += this.getHeight() / 7;
            }
            //累加总天数
            sumDays++;
        }
    }

    //判断是否是闰年
    public boolean isRunYear(int year) {
        if (year % 4 == 0 & year % 100 != 0 || year % 400 == 0) {
            return true;
        }
        return false;
    }
}
