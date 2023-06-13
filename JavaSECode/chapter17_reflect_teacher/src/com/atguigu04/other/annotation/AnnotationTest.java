package com.atguigu04.other.annotation;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * ClassName: AnnotationTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 10:48
 * @Version 1.0
 */
public class AnnotationTest {
    //获取类声明上的注解
    @Test
    public void test1(){
        Class clazz = Customer.class;

        Table annotation = (Table) clazz.getDeclaredAnnotation(Table.class);

        System.out.println(annotation.value());
    }

    //获取属性声明的注解
    @Test
    public void test2() throws Exception {
        Class clazz = Customer.class;

        Field nameField = clazz.getDeclaredField("name");

        //获取属性声明上的注解
        Column nameColumn = nameField.getDeclaredAnnotation(Column.class);
        System.out.println(nameColumn.columnName());//cust_name
        System.out.println(nameColumn.columnType()); //varchar(15)
    }
}
