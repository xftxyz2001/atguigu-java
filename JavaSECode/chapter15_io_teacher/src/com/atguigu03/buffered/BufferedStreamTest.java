package com.atguigu03.buffered;

import org.junit.Test;

import java.io.*;

/**
 * ClassName: BufferedStreamTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 9:34
 * @Version 1.0
 */
public class BufferedStreamTest {
    /*
     * 需求：使用BufferedInputStream \ BufferedOutputStream复制一个图片
     *
     * 注意：如下的操作应该使用try-catch-finally处理异常。
     * */
    @Test
    public void test1() throws Exception{

        //1. 创建相关的File类的对象
        File srcFile = new File("playgirl.jpg");
        File destFile = new File("playgirl_copy1.jpg");

        //2. 创建相关的字节流、缓冲流
        FileInputStream fis = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(destFile);

        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        //3. 数据的读入和写出
        byte[] buffer = new byte[1024]; //1kb
        int len;//记录每次读入到buffer中字节的个数
        while ((len = bis.read(buffer)) != -1) {
            bos.write(buffer, 0, len);
        }
        System.out.println("复制成功");

        //4. 关闭资源
        //外层的流的关闭
        //由于外层流的关闭也会自动的对内层的流进行关闭操作。所以可以省略内层流的关闭。
        bos.close();
        bis.close();
        //内层的流的关闭
//        fos.close();
//        fis.close();

    }
}
