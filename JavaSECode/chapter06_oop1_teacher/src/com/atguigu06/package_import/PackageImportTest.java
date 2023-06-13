package com.atguigu06.package_import;

//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Scanner;

import com.atguigu05.method_more._04recursion.RecursionTest;
import com.atguigu05.method_more._04recursion.exer2.RabbitExer;

import java.lang.reflect.Field;
import java.util.*;

import static java.lang.System.out;
import static java.lang.Math.PI;

/**
 * ClassName: PackageImportTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 11:13
 * @Version 1.0
 */
public class PackageImportTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList list = new ArrayList();

        HashMap map = new HashMap();

        HashSet set = new HashSet();

        String str = "hello";
        System.out.println(str);

        Person p = new Person();

        Field field = null;

        RecursionTest test = null;

        RabbitExer exer = null;

        //Date可以使用import的方式指明
        Date date = new Date();

        //使用全类名的方式
        java.sql.Date date1 = new java.sql.Date(121231231L);

        out.println("hello");

        out.println(PI);

    }
}
