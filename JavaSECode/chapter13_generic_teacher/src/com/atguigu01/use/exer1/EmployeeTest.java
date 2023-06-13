package com.atguigu01.use.exer1;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * ClassName: EmployeeTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 17:06
 * @Version 1.0
 */
public class EmployeeTest {
    //需求1：使Employee 实现 Comparable 接口，并按 name 排序
    @Test
    public void test1(){

        TreeSet<Employee> set = new TreeSet<>();

        Employee e1 = new Employee("HanMeimei",18,new MyDate(1998,12,21));
        Employee e2 = new Employee("LiLei",20,new MyDate(1996,11,21));
        Employee e3 = new Employee("LiHua",21,new MyDate(2000,9,12));
        Employee e4 = new Employee("ZhangLei",19,new MyDate(1997,5,31));
        Employee e5 = new Employee("ZhangYi",23,new MyDate(2001,11,2));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        //遍历
        Iterator<Employee> iterator = set.iterator();
        while(iterator.hasNext()){
            Employee employee = iterator.next();
            System.out.println(employee);
        }

    }

    //需求2：创建 TreeSet 时传入 Comparator对象，按生日日期的先后排序。
    @Test
    public void test2(){

        Comparator<Employee> comparator = new Comparator<Employee>(){
            @Override
            public int compare(Employee o1, Employee o2) {
                //错误的写法：
//                return o1.getBirthday().toString().compareTo(o2.getBirthday().toString());

                //正确的写法1：
//                int yearDistince = o1.getBirthday().getYear() - o2.getBirthday().getYear();
//                if(yearDistince != 0){
//                    return yearDistince;
//                }
//
//                int monthDistince = o1.getBirthday().getMonth() - o2.getBirthday().getMonth();
//                if(monthDistince != 0){
//                    return monthDistince;
//                }
//
//                return o1.getBirthday().getDay() - o2.getBirthday().getDay();
                //正确的写法2：
                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        };

        TreeSet<Employee> set = new TreeSet<>(comparator);

        Employee e1 = new Employee("HanMeimei",18,new MyDate(1998,12,21));
        Employee e2 = new Employee("LiLei",20,new MyDate(1996,11,21));
        Employee e3 = new Employee("LiHua",21,new MyDate(2000,9,12));
        Employee e4 = new Employee("ZhangLei",19,new MyDate(1996,5,31));
        Employee e5 = new Employee("ZhangYi",23,new MyDate(2000,9,2));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        //遍历
        Iterator<Employee> iterator = set.iterator();
        while(iterator.hasNext()){
            Employee employee = iterator.next();
            System.out.println(employee);
        }
    }
}
