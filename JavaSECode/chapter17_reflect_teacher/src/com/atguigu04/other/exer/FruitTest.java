package com.atguigu04.other.exer;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

/**
 * ClassName: FruitTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 11:51
 * @Version 1.0
 */
public class FruitTest {
    @Test
    public void test1() throws Exception {
        //1. 读取配置文件中的信息，获取全类名
        Properties pros = new Properties();

        File file = new File("src/config.properties");
        FileInputStream fis = new FileInputStream(file);

        pros.load(fis);

        String fruitName = pros.getProperty("fruitName");

        //2. 通过反射，创建指定全类名对应的类的实例
        Class clazz = Class.forName(fruitName);
        Constructor con = clazz.getDeclaredConstructor();
        con.setAccessible(true);

        Fruit fruit = (Fruit) con.newInstance();

        //3. 通过榨汁机的对象调用run()
        Juicer juicer = new Juicer();
        juicer.run(fruit);


    }
}
