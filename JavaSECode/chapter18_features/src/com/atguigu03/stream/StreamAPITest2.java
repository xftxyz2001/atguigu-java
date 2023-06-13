package com.atguigu03.stream;

import org.junit.Test;

/**
 * 测试Stream的终止操作
 *
 * @author 尚硅谷-宋红康
 */
public class StreamAPITest2 {

    //1-匹配与查找
    @Test
    public void test1(){
//        allMatch(Predicate p)——检查是否匹配所有元素。
//          练习：是否所有的员工的年龄都大于18

//        anyMatch(Predicate p)——检查是否至少匹配一个元素。
//         练习：是否存在员工的工资大于 10000

//        findFirst——返回第一个元素

    }

    @Test
    public void test2(){
        // count——返回流中元素的总个数

//        max(Comparator c)——返回流中最大值
//        练习：返回最高的工资：

//        min(Comparator c)——返回流中最小值
//        练习：返回最低工资的员工

//        forEach(Consumer c)——内部迭代

    }

    //2-归约
    @Test
    public void test3(){
//        reduce(T identity, BinaryOperator)——可以将流中元素反复结合起来，得到一个值。返回 T
//        练习1：计算1-10的自然数的和


//        reduce(BinaryOperator) ——可以将流中元素反复结合起来，得到一个值。返回 Optional<T>
//        练习2：计算公司所有员工工资的总和

    }

    //3-收集
    @Test
    public void test4(){
//        collect(Collector c)——将流转换为其他形式。接收一个 Collector接口的实现，用于给Stream中元素做汇总的方法
//        练习1：查找工资大于6000的员工，结果返回为一个List或Set


//        练习2：按照员工的年龄进行排序，返回到一个新的List中
    }
}
