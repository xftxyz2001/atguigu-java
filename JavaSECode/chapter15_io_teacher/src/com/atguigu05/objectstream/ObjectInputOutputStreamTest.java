package com.atguigu05.objectstream;

import org.junit.Test;

import java.io.*;

/**
 * ClassName: ObjectInputOutputStreamTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 14:28
 * @Version 1.0
 */
public class ObjectInputOutputStreamTest {
    /*
    * 序列化过程：使用ObjectOutputStream流实现。将内存中的Java对象保存在文件中或通过网络传输出去
    * */
    @Test
    public void test1() throws IOException {
        //1.
        File file = new File("object.txt");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));

        //2.写出数据即为序列化的过程
        oos.writeUTF("江山如此多娇，引无数英雄竞折腰");
        oos.flush();

        oos.writeObject("轻轻的我走了，正如我轻轻的来");
        oos.flush();


        oos.close();
    }

    /*
    * 反序列化过程：使用ObjectInputSteam流实现。将文件中的数据或网络传输过来的数据还原为内存中的Java对象
    * */
    @Test
    public void test2() throws IOException, ClassNotFoundException {
        //1.
        File file = new File("object.txt");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));


        //2. 读取文件中的对象（或反序列化的过程）
        String str1 = ois.readUTF();
        System.out.println(str1);

        String str2 = (String) ois.readObject();
        System.out.println(str2);

        //3.
        ois.close();
    }

    //演示自定义类的对象的序列化和反序列化过程
    //序列化过程：
    @Test
    public void test3() throws IOException {
        //1.
        File file = new File("object1.dat");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));

        //2.写出数据即为序列化的过程
        Person p1 = new Person("Tom",12);
        oos.writeObject(p1);
        oos.flush();

        Person p2 = new Person("Jerry",23,1001,new Account(2000));
        oos.writeObject(p2);
        oos.flush();

        //3.
        oos.close();
    }

    //反序列化过程：
    @Test
    public void test4() throws IOException, ClassNotFoundException {
        //1.
        File file = new File("object1.dat");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));


        //2. 读取文件中的对象（或反序列化的过程）
        Person person = (Person) ois.readObject();
        System.out.println(person);


       Person person1 = (Person) ois.readObject();
        System.out.println(person1);

        //3.
        ois.close();
    }

}
