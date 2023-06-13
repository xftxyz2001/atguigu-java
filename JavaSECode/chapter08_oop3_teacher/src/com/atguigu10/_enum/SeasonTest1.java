package com.atguigu10._enum;

/**
 * ClassName: SeasonTest1
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 14:24
 * @Version 1.0
 */
public class SeasonTest1 {
    public static void main(String[] args) {
//        System.out.println(Season1.SPRING.getClass());
//        System.out.println(Season1.SPRING.getClass().getSuperclass());
//        System.out.println(Season1.SPRING.getClass().getSuperclass().getSuperclass());

        //测试方法
        //1. toString()
        System.out.println(Season1.SPRING);
        System.out.println(Season1.AUTUMN);

        //2. name()
        System.out.println(Season1.SPRING.name());

        //3. vlaues()
        Season1[] values = Season1.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

        //4. valueOf(String objName):返回当前枚举类中名称为objName的枚举类对象。
        //如果枚举类中不存在objName名称的对象，则报错。
        String objName = "WINTER";
//        objName = "WINTER1";
        Season1 season1 = Season1.valueOf(objName);
        System.out.println(season1);

        //5.ordinal()
        System.out.println(Season1.AUTUMN.ordinal());

        //通过枚举类的对象调用重写接口中的方法
        Season1.SUMMER.show();
    }
}

interface Info{
    void show();
}

//jdk5.0中使用enum关键字定义枚举类
enum Season1 implements Info{
    //1. 必须在枚举类的开头声明多个对象。对象之间使用,隔开
    SPRING("春天","春暖花开"),
    SUMMER("夏天","夏日炎炎"),
    AUTUMN("秋天","秋高气爽"),
    WINTER("冬天","白雪皑皑");

    //2. 声明当前类的对象的实例变量,使用private final修饰
    private final String seasonName;//季节的名称
    private final String seasonDesc;//季节的描述

    //3. 私有化类的构造器
    private Season1(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //4. 提供实例变量的get方法
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public String toString() {
        return "Season1{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }

    @Override
    public void show() {
        System.out.println("这是一个季节");
    }
}
