package com.atguigu03.reflectapply.apply1;

import com.atguigu03.reflectapply.data.Person;
import org.junit.Test;

/**
 * ClassName: NewInstanceTest
 * Description:
 *      反射的应用一：创建运行时类的对象
 * @Author 尚硅谷-宋红康
 * @Create 8:55
 * @Version 1.0
 */
public class NewInstanceTest {
    @Test
    public void test1() throws InstantiationException, IllegalAccessException {

        Class clazz = Person.class;

        //创建Person类的实例
        Person per = (Person) clazz.newInstance();

        System.out.println(per);

    }
}
