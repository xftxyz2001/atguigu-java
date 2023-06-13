package com.atguigu07.object.equals.exer2;

/**
 * ClassName: MyDate
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 11:23
 * @Version 1.0
 */
public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate() {
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //手写equals()

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }

        if(obj instanceof MyDate){
            MyDate myDate = (MyDate) obj;

            return this.year == myDate.year && this.month == myDate.month &&
                    this.day == myDate.day;
        }
        return false;

    }
}
