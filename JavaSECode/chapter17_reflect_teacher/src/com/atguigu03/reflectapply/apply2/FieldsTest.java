package com.atguigu03.reflectapply.apply2;

import com.atguigu03.reflectapply.data.Person;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @author shkstart
 * @create 14:28
 */
public class FieldsTest {
    @Test
    public void test1() {

        Class clazz = Person.class;
        //getFields():获取到运行时类本身及其所有的父类中声明为public权限的属性
//        Field[] fields = clazz.getFields();
//        for (Field f : fields) {
//            System.out.println(f);
//        }

        //getDeclaredFields():获取当前运行时类中声明的所有属性
        Field[] declaredFields = clazz.getDeclaredFields();
        for(Field f : declaredFields){
            System.out.println(f);
        }
    }

    //权限修饰符  变量类型  变量名
    @Test
    public void test2() {
        Class clazz = Person.class;
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field f : declaredFields) {
            //1.权限修饰符
            /*
             * 0x是十六进制
             * PUBLIC           = 0x00000001;  1    1
             * PRIVATE          = 0x00000002;  2	10
             * PROTECTED        = 0x00000004;  4	100
             * STATIC           = 0x00000008;  8	1000
             * FINAL            = 0x00000010;  16	10000
             * ...
             */
            int modifier = f.getModifiers();
            System.out.print(modifier + ":" + Modifier.toString(modifier) + "\t");

            //2.数据类型
            Class type = f.getType();
            System.out.print(type.getName() + "\t");
//
//            //3.变量名
            String fName = f.getName();
            System.out.print(fName);

            System.out.println();
        }
    }
}
