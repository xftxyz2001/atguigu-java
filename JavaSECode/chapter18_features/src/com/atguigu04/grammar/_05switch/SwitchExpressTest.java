package com.atguigu04.grammar._05switch;

import org.junit.Test;

/**
 * ClassName: SwitchExpressTest
 * Package: com.atguigu04.grammer._04switch
 * Description:
 * switch表达式
 *
 * @Author: 尚硅谷-宋红康
 * @Create: 21:28
 * @Version: v1.0
 */
enum Week {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}

public class SwitchExpressTest {
    /*
     * 举例1：
     * JDK12之前的写法
     * */
    @Test
    public void test1() {
        Week day = Week.FRIDAY;
        switch (day) {
            case MONDAY:
                System.out.println(1);
                break;
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println(2);
                break;
            case FRIDAY:
                System.out.println(3);
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println(4);
                break;
            default:
                throw new RuntimeException("What day is today?" + day);
        }
    }

    /*
     * 举例1：
     * JDK12中的写法：switch表达式，省去了break语句，避免了因少写break而出现case穿透
     * */
    @Test
    public void test2() {


    }

    /*
     * 举例1：
     * JDK12中的写法：还可以使用变量接收switch表达式的结果。
     * */
    @Test
    public void test3() {



    }

    /*
     * 举例1：(在default中返回值5)
     * JDK13中的写法：引入了yield关键字，用于返回指定的数据，结束switch结构。
     * 这意味着，switch表达式(返回值)应该使用yield，switch语句(不返回值)应该使用break。
     *
     * 和return的区别在于：return会直接跳出当前方法，而yield只会跳出当前switch块。
     * */
    @Test
    public void test4() {



    }

    /*
     * 举例2：
     * */
    @Test
    public void test5() {
        String x = "3";
        int num = switch (x) {
            case "1":
                yield 1;
            case "2":
                yield 2;
            case "3":
                yield 3;
            default:
                yield 4;
        };
        System.out.println(num);
    }
}

