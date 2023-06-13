package com.atguigu02.filestream;

import org.junit.Test;

import java.io.*;

/**
 * ClassName: FileReaderWriterTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 16:37
 * @Version 1.0
 */
public class FileReaderWriterTest {
    /*
     * 需求：读取hello.txt中的内容，显示在控制台上。
     *
     * 异常使用throws的方式处理，不太合适。见 test2()
     * */
    @Test
    public void test1() throws IOException {
        //1.创建File类的对象，对应着hello.txt文件
        File file = new File("hello.txt");

        //2.创建输入型的字符流，用于读取数据
        FileReader fr = new FileReader(file);

        //3.读取数据，并显示在控制台上
        //方式1：
//        int data = fr.read();
//        while(data != -1){
//            System.out.print((char)data);
//            data = fr.read();
//        }

        //方式2：
        int data;
        while ((data = fr.read()) != -1) {
            System.out.print((char) data);
        }
        //4. 流资源的关闭操作（必须要关闭，否则会内存泄漏）
        fr.close();
    }

    /*
     * 需求：读取hello.txt中的内容，显示在控制台上。
     * 使用try-catch-finally的方式处理异常。确保流一定可以关闭，避免内存泄漏
     * */
    @Test
    public void test2() {
        FileReader fr = null;
        try {
            //1.创建File类的对象，对应着hello.txt文件
            File file = new File("hello.txt");

            //2.创建输入型的字符流，用于读取数据
            fr = new FileReader(file);

            //3.读取数据，并显示在控制台上
            int data;
            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. 流资源的关闭操作（必须要关闭，否则会内存泄漏）
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /*
     * 需求：读取hello.txt中的内容，显示在控制台上。
     *
     * 对test2()进行优化，每次读取多个字符存放到字符数组中，减少了与磁盘交互的次数，提升效率。
     *
     * */
    @Test
    public void test3() {
        FileReader fr = null;
        try {
            //1.创建File类的对象，对应着hello.txt文件
            File file = new File("hello.txt");

            //2.创建输入型的字符流，用于读取数据
            fr = new FileReader(file);

            //3.读取数据，并显示在控制台上
            char[] cbuffer = new char[5];
            int len;
            while ((len = fr.read(cbuffer)) != -1) {
                //遍历数组:错误的写法
//                for (int i = 0; i < cbuffer.length; i++) {
//                    System.out.print(cbuffer[i]);
//                }

                //遍历数组:错误的写法
                for (int i = 0; i < len; i++) {
                    System.out.print(cbuffer[i]);
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. 流资源的关闭操作（必须要关闭，否则会内存泄漏）
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /*
     * 需求：将内存中的数据写出到指定的文件中
     * */
    @Test
    public void test4() {
        FileWriter fw = null;
        try {
            //1. 创建File类的对象，指明要写出的文件的名称
            File file = new File("info.txt");

            //2. 创建输出流
            //覆盖文件，使用的构造器：
            fw = new FileWriter(file);
//            fw = new FileWriter(file,false);
            //在现有的文件基础上，追加内容使用的构造器：
//            fw = new FileWriter(file,true);

            //3. 写出的具体过程
            //输出的方法：write(String str) / write(char[] cdata)
            fw.write("I love U!\n");
            fw.write("You love him!\n");
            fw.write("太惨了...");

            System.out.println("输出成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. 关闭资源
            try {
                if (fw != null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /*
     * 需求：复制一份hello.txt文件，命名为hello_copy.txt
     * */
    @Test
    public void test5() {
        FileReader fr = null;
        FileWriter fw = null;

        try {
            //1. 创建File类的对象
            File srcFile = new File("hello.txt");
            File destFile = new File("hello_copy.txt");

            //2. 创建输入流、输出流
            fr = new FileReader(srcFile);
            fw = new FileWriter(destFile);

            //3. 数据的读入和写出的过程
            char[] cbuffer = new char[5];
            int len;//记录每次读入到cbuffer中的字符的个数
            while ((len = fr.read(cbuffer)) != -1) {
                //write(char[] cbuffer,int fromIndex,int len)
                fw.write(cbuffer, 0, len); //正确的
//                fw.write(cbuffer); //错误的
            }

            System.out.println("复制成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. 关闭流资源
            //方式1：
//            try {
                //if (fw != null)
//                  fw.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }finally {
//
//                try {
                    //if (fr != null)
//                    fr.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
            //方式2：
            try {
                if (fw != null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    /*
     * 需求：复制一份playgirl.jpg文件，命名为playgirl_copy.jpg
     *
     * 复制失败！因为字符流不适合用来处理非文本文件。
     * */
    @Test
    public void test6() {
        FileReader fr = null;
        FileWriter fw = null;

        try {
            //1. 创建File类的对象
            File srcFile = new File("playgirl.jpg");
            File destFile = new File("playgirl_copy.jpg");

            //2. 创建输入流、输出流
            fr = new FileReader(srcFile);
            fw = new FileWriter(destFile);

            //3. 数据的读入和写出的过程
            char[] cbuffer = new char[5];
            int len;//记录每次读入到cbuffer中的字符的个数
            while ((len = fr.read(cbuffer)) != -1) {
                //write(char[] cbuffer,int fromIndex,int len)
                fw.write(cbuffer, 0, len); //正确的
//                fw.write(cbuffer); //错误的
            }

            System.out.println("复制成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. 关闭流资源
            try {
                if (fw != null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
