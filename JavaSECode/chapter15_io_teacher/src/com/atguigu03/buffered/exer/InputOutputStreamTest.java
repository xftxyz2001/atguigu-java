package com.atguigu03.buffered.exer;

import org.junit.Test;

import java.io.*;

/**
 * @author shkstart
 * @create 14:34
 */
public class InputOutputStreamTest {

    //提供一个使用FileInputStream和FileOutputStream实现非文本文件复制的方法
    public void copyFileWithFile(String srcPath, String destPath) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //1.
            File srcFile = new File(srcPath);
            File destFile = new File(destPath);
            //2.
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);

            //3. 读写过程
            int len;
            byte[] buffer = new byte[100];
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
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


    @Test
    public void testCopyFileWithFile() {
        long start = System.currentTimeMillis();

        String srcPath = "C:\\Users\\songhk\\Desktop\\test-1.mp4";
        String destPath = "C:\\Users\\songhk\\Desktop\\test-2.mp4";

        copyFileWithFile(srcPath, destPath);

        long end = System.currentTimeMillis();

        System.out.println("花费的时间为：" + (end - start));//11302
    }


    //提供一个使用BufferedInputStream和BufferedOutputStream实现非文本文件复制的方法
    public void copyFileWithBuffered(String srcPath, String destPath) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            //1.
            File srcFile = new File(srcPath);
            File destFile = new File(destPath);
            //2.
            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(destFile);

            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            //3. 读写过程
            int len;
            byte[] buffer = new byte[100];
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. 关闭资源(1. 需要先关闭缓冲流，再关闭文件流 2. 默认情况下，关闭外层流时，也会自动关闭内部的流)
            try {
                if(bos != null)
                    bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(bis != null)
                    bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            //可以省略
//        fos.close();
//        fis.close();
        }

    }

    @Test
    public void testCopyFileWithBuffered() {
        long start = System.currentTimeMillis();

        String srcPath = "C:\\Users\\songhk\\Desktop\\test-1.mp4";
        String destPath = "C:\\Users\\songhk\\Desktop\\test-3.mp4";

        copyFileWithBuffered(srcPath, destPath);

        long end = System.currentTimeMillis();

        System.out.println("花费的时间为：" + (end - start));//11302  -- 643
    }


}
