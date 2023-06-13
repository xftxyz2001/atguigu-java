package com.atguigu03.stream;

import com.atguigu02.reference.data.Employee;
import com.atguigu02.reference.data.EmployeeData;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
        List<Employee> list = EmployeeData.getEmployees();
        System.out.println(list.stream().allMatch(emp -> emp.getAge() > 18));

//        anyMatch(Predicate p)——检查是否至少匹配一个元素。
        //练习：是否存在年龄大于18岁的员工
        System.out.println(list.stream().anyMatch(emp -> emp.getAge() > 18));
//         练习：是否存在员工的工资大于 10000
        System.out.println(list.stream().anyMatch(emp -> emp.getSalary() > 10000));

//        findFirst——返回第一个元素
        System.out.println(list.stream().findFirst().get());



    }

    @Test
    public void test2(){
        // count——返回流中元素的总个数
        List<Employee> list = EmployeeData.getEmployees();
        System.out.println(list.stream().filter(emp -> emp.getSalary() > 7000).count());

//        max(Comparator c)——返回流中最大值
        //练习：返回最高工资的员工
        System.out.println(list.stream().max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())));

//        练习：返回最高的工资：
        //方式1：
        System.out.println(list.stream().max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())).get().getSalary());
        //方式2：
        System.out.println(list.stream().map(emp -> emp.getSalary()).max((salary1, salary2) -> Double.compare(salary1, salary2)).get());
        System.out.println(list.stream().map(emp -> emp.getSalary()).max(Double::compare).get());

//        min(Comparator c)——返回流中最小值
//        练习：返回最低工资的员工
        System.out.println(list.stream().min((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())));


//        forEach(Consumer c)——内部迭代
        list.stream().forEach(System.out::println);


        //针对于集合，jdk8中增加了一个遍历的方法
        list.forEach(System.out::println);
        //针对于List来说，遍历的方式：① 使用Iterator ② 增强for ③ 一般for ④ forEach()
    }

    //2-归约
    @Test
    public void test3(){
//        reduce(T identity, BinaryOperator)——可以将流中元素反复结合起来，得到一个值。返回 T
//        练习1：计算1-10的自然数的和
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(list.stream().reduce(0, (x1, x2) -> x1 + x2));
        System.out.println(list.stream().reduce(0, (x1, x2) -> Integer.sum(x1,x2)));
        System.out.println(list.stream().reduce(0, Integer::sum));



        System.out.println(list.stream().reduce(10, (x1, x2) -> x1 + x2));


//        reduce(BinaryOperator) ——可以将流中元素反复结合起来，得到一个值。返回 Optional<T>
//        练习2：计算公司所有员工工资的总和
        List<Employee> employeeList = EmployeeData.getEmployees();
        System.out.println(employeeList.stream().map(emp -> emp.getSalary()).reduce((salary1, salary2) -> Double.sum(salary1, salary2)));
        System.out.println(employeeList.stream().map(emp -> emp.getSalary()).reduce(Double::sum));


    }

    //3-收集
    @Test
    public void test4(){
        List<Employee> list = EmployeeData.getEmployees();
//        collect(Collector c)——将流转换为其他形式。接收一个 Collector接口的实现，用于给Stream中元素做汇总的方法
//        练习1：查找工资大于6000的员工，结果返回为一个List或Set
        List<Employee> list1 = list.stream().filter(emp -> emp.getSalary() > 6000).collect(Collectors.toList());
        list1.forEach(System.out::println);
        System.out.println();
        list.forEach(System.out::println);

        System.out.println();
//        练习2：按照员工的年龄进行排序，返回到一个新的List中
        List<Employee> list2 = list.stream().sorted((e1, e2) -> e1.getAge() - e2.getAge()).collect(Collectors.toList());
        list2.forEach(System.out::println);
    }
}
