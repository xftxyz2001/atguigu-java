package com.atguigu03.reflectapply.apply3;

import com.atguigu03.reflectapply.data.Person;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * ClassName: ReflectTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 10:04
 * @Version 1.0
 */
public class ReflectTest {
    //********************如下是调用指定的属性************************
    /*
    * 反射的应用3-1：调用指定的属性
    *
    * */
    //public int age = 1;
    @Test
    public void test1() throws Exception {
         Class clazz = Person.class;

         //
        Person per = (Person) clazz.newInstance();

        //1. 获取运行时类指定名的属性
        Field ageField = clazz.getField("age");

        //2. 获取或设置此属性的值
        ageField.set(per,2);
        System.out.println(ageField.get(per));
    }

    //private String name;
    @Test
    public void test2() throws Exception {
        Class clazz = Person.class;

        //
        Person per = (Person) clazz.newInstance();

        //1.通过Class实例调用getDeclaredField(String fieldName)，获取运行时类指定名的属性
        Field nameField = clazz.getDeclaredField("name");

        //2. setAccessible(true)：确保此属性是可以访问的
        nameField.setAccessible(true);

        //3. 通过Filed类的实例调用get(Object obj) （获取的操作）
        // 或 set(Object obj,Object value) （设置的操作）进行操作。
        nameField.set(per,"Tom");
        System.out.println(nameField.get(per));
    }

    //private static String info;
    @Test
    public void test3() throws Exception {
        Class clazz = Person.class;

        //1.通过Class实例调用getDeclaredField(String fieldName)，获取运行时类指定名的属性
        Field infoField = clazz.getDeclaredField("info");

        //2. setAccessible(true)：确保此属性是可以访问的
        infoField.setAccessible(true);

        //3. 通过Filed类的实例调用get(Object obj) （获取的操作）
        // 或 set(Object obj,Object value) （设置的操作）进行操作。
//        infoField.set(Person.class,"我是一个人");
//        System.out.println(infoField.get(Person.class));
        //或 （仅限于类变量可以如下的方式调用）
        infoField.set(null,"我是一个人");
        System.out.println(infoField.get(null));
    }

    //********************如下是调用指定的方法************************
    /*
     * 反射的应用3-2：调用指定的方法
     *
     * */
    //private String showNation(String nation,int age)
    @Test
    public void test4() throws Exception {
        Class clazz = Person.class;

        Person per = (Person) clazz.newInstance();

        //1.通过Class的实例调用getDeclaredMethod(String methodName,Class ... args),获取指定的方法
        Method showNationMethod = clazz.getDeclaredMethod("showNation",String.class,int.class);

        //2. setAccessible(true)：确保此方法是可访问的
        showNationMethod.setAccessible(true);

        //3.通过Method实例调用invoke(Object obj,Object ... objs),即为对Method对应的方法的调用。
        //invoke()的返回值即为Method对应的方法的返回值
        //特别的：如果Method对应的方法的返回值类型为void，则invoke()返回值为null
        Object returnValue = showNationMethod.invoke(per,"CHN",10);
        System.out.println(returnValue);
    }

    //public static void showInfo()
    @Test
    public void test5() throws Exception {
        Class clazz = Person.class;

        //1.通过Class的实例调用getDeclaredMethod(String methodName,Class ... args),获取指定的方法
        Method showInfoMethod = clazz.getDeclaredMethod("showInfo");

        //2. setAccessible(true)：确保此方法是可访问的
        showInfoMethod.setAccessible(true);

        //3.通过Method实例调用invoke(Object obj,Object ... objs),即为对Method对应的方法的调用。
        //invoke()的返回值即为Method对应的方法的返回值
        //特别的：如果Method对应的方法的返回值类型为void，则invoke()返回值为null
        Object returnValue = showInfoMethod.invoke(null);
        System.out.println(returnValue);
    }

    //********************如下是调用指定的构造器************************
    /*
     * 反射的应用3-3：调用指定的构造器
     *
     * */
    //private Person(String name, int age)
    @Test
    public void test6() throws Exception {

        Class clazz = Person.class;

        //1.通过Class的实例调用getDeclaredConstructor(Class ... args)，获取指定参数类型的构造器
        Constructor constructor = clazz.getDeclaredConstructor(String.class, int.class);

        //2.setAccessible(true)：确保此构造器是可以访问的
        constructor.setAccessible(true);

        //3.通过Constructor实例调用newInstance(Object ... objs),返回一个运行时类的实例。
        Person per = (Person) constructor.newInstance("Tom", 12);

        System.out.println(per);

    }
    //使用Constructor替换原有的使用Class调用newInstance()的方式创建对象
    @Test
    public void test7() throws Exception {
        Class clazz = Person.class;

        //1.通过Class的实例调用getDeclaredConstructor(Class ... args)，获取指定参数类型的构造器
        Constructor constructor = clazz.getDeclaredConstructor();

        //2.setAccessible(true)：确保此构造器是可以访问的
        constructor.setAccessible(true);

        //3.通过Constructor实例调用newInstance(Object ... objs),返回一个运行时类的实例。
        Person per = (Person) constructor.newInstance();

        System.out.println(per);
    }
}
