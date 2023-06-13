package com.atguigu04.grammar._02trycatch;

import org.junit.Test;

import java.io.*;

/**
 * ClassName: TryCatchTest
 * Package: com.atguigu04.grammer.trycatch
 * Description:
 *      try-catch的新特性
 *
 * @Author: 尚硅谷-宋红康
 * @Create: 0:24
 * @Version: v1.0
 */
public class TryCatchTest {
    /*
     * 举例1：
     * JDK7之前的写法
     * */
    @Test
    public void test01() {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter("test.txt");
            bw = new BufferedWriter(fw);

            bw.write("hello,大硅谷");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /*
     * 举例1：
     * JDK7中的写法
     * */
    @Test
    public void test02() {

    }

    /*
     * 举例2：从test.txt(utf-8)文件中，读取内容，写出到abc.txt(gbk)文件中
     * JDK7之前的写法
     * */
    @Test
    public void test03() {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            FileInputStream fis = new FileInputStream("test.txt");
            InputStreamReader isr = new InputStreamReader(fis, "utf-8");
            br = new BufferedReader(isr);

            FileOutputStream fos = new FileOutputStream("abc.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos, "gbk");
            bw = new BufferedWriter(osw);

            String str;
            while ((str = br.readLine()) != null) {
                bw.write(str);
                bw.newLine();
                bw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /*
     * 举例2：从test.txt(utf-8)文件中，读取内容，写出到abc.txt(gbk)文件中
     * JDK7中的写法
     * */
    @Test
    public void test04() {



    }


    //jdk9中举例：
    @Test
    public void test05() {
        InputStreamReader reader = new InputStreamReader(System.in);
        OutputStreamWriter writer = new OutputStreamWriter(System.out);
        try (reader; writer) {
            //reader、writer是final的，不可再被赋值



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
