package com.atguigu03.buffered;

import org.junit.Test;

import java.io.*;

/**
 * ClassName: BufferedReaderWriterTest
 * Description:
 *      测试BufferedReader和BufferedWriter的使用
 *
 * @Author 尚硅谷-宋红康
 * @Create 10:13
 * @Version 1.0
 */
public class BufferedReaderWriterTest {
    /*
    * 使用BufferedReader将dbcp_utf-8.txt中的内容显式在控制台上。
    * */
    @Test
    public void test1() throws IOException {
        //
        File file = new File("dbcp_utf-8.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        //读取的过程
        //方式1：read(char[] cBuffer)
//        char[] cBuffer = new char[1024];
//        int len;//记录每次读入到cBuffer中的字符的个数
//        while((len = br.read(cBuffer)) != -1){
//           //方法1：
////            for(int i = 0;i < len;i++){
////                System.out.print(cBuffer[i]);
////            }
//            //方法2：
//            String str = new String(cBuffer,0,len);
//            System.out.print(str);
//
//        }

        //方式2：readLine():每次读取一行文本中的数据。返回的字符串是不包含换行符的。
        String data;
        while((data = br.readLine()) != null){
            System.out.print(data + "\n");
        }

        //
        br.close();
    }

    /*
    * 使用BufferedReader和BufferedWriter实现文本文件的复制
    *
    * 注意：开发中，还是需要使用try-catch-finally来处理流的异常。
    * */
    @Test
    public void test2() throws IOException {
        //1.造文件、造流
        File file1 = new File("dbcp_utf-8.txt");
        File file2 = new File("dbcp_utf-8_copy1.txt");

        BufferedReader br = new BufferedReader(new FileReader(file1));
        BufferedWriter bw = new BufferedWriter(new FileWriter(file2));

        //2.文件的读写操作
        String data ;
        while((data = br.readLine()) != null){
            bw.write(data);
            bw.newLine(); //表示换行操作
            bw.flush();//刷新的方法。每当调用此方法时，就会主动的将内存中的数据写出到磁盘文件中。
        }
        System.out.println("复制成功");

        //3.关闭资源
        bw.close();
        br.close();
    }
}
