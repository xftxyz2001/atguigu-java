package com.atguigu03.buffered;

import org.junit.Test;

import java.io.*;

/**
 * ClassName: CopyFileTest
 * Description:
 * 测试FileInputStream + FileOutputStream 复制文件
 * BufferedInputStream + BufferedOutputStream 复制文件
 * <p>
 * 测试二者的效率。
 *
 * @Author 尚硅谷-宋红康
 * @Create 9:41
 * @Version 1.0
 */
public class CopyFileTest {

    @Test
    public void testSpendTime(){
        long start = System.currentTimeMillis();

        String src = "C:\\Users\\shkstart\\Desktop\\01-视频.mp4";
        String dest = "C:\\Users\\shkstart\\Desktop\\03-视频.mp4";
//        copyFileWithFileStream(src,dest); //11189

        copyFileWithBufferedStream(src,dest);//412

        long end = System.currentTimeMillis();

        System.out.println("花费的时间为：" + (end - start));
    }

    /*
     * 使用BufferedInputStream + BufferedOutputStream 复制文件
     * */
    public void copyFileWithBufferedStream(String src, String dest) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            //1. 创建相关的File类的对象
            File srcFile = new File(src);
            File destFile = new File(dest);

            //2. 创建相关的字节流、缓冲流
            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(destFile);

            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            //3. 数据的读入和写出
            byte[] buffer = new byte[50];
            int len;//记录每次读入到buffer中字节的个数
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
            System.out.println("复制成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. 关闭资源
            try {
                if (bos != null)
                    bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bis != null)
                    bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    /*
     * 使用FileInputStream + FileOutputStream 复制文件
     * */
    public void copyFileWithFileStream(String src, String dest) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            //1. 创建相关的File类的对象
            File srcFile = new File(src);
            File destFile = new File(dest);

            //2. 创建相关的字节流
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);

            //3. 数据的读入和写出
            byte[] buffer = new byte[50];
            int len;//记录每次读入到buffer中字节的个数
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
            System.out.println("复制成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. 关闭资源
            try {
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
