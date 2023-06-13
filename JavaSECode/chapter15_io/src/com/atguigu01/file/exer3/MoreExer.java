package com.atguigu01.file.exer3;

import org.junit.Test;

import java.io.File;

/**
 * @author 尚硅谷-宋红康
 * @create 16:53
 */
public class MoreExer {
    /*
    * 拓展1：计算指定文件目录占用空间的大小
    * */
    public long getDirectorySize(File file) {
        // file是文件，那么直接返回file.length()
        // file是目录，把它的下一级的所有大小加起来就是它的总大小
        long size = 0;
        if (file.isFile()) {
            size = file.length();
        } else {
            File[] all = file.listFiles();// 获取file的下一级
            // 累加all[i]的大小
            for (File f : all) {
                size += getDirectorySize(f);// f的大小;
            }
        }
        return size;
    }
    @Test
    public void testGetDirectorySize(){
        File dir = new File("D:\\code\\workspace_teach");

        System.out.println("总文件大小为：" + getDirectorySize(dir) + "字节");


    }

    /*
    * 拓展2：删除指定文件目录及其下的所有文件
    * */
    public void deleteDirectory(File file) {
        // 如果file是文件，直接delete
        // 如果file是目录，先把它的下一级干掉，然后删除自己
        if (file.isDirectory()) {
            File[] all = file.listFiles();
            // 循环删除的是file的下一级
            for (File f : all) {// f代表file的每一个下级
                deleteDirectory(f);
            }
        }
        // 删除自己
        file.delete();
    }

    @Test
    public void testDeleteDirectory(){
        File dir = new File("C:\\Users\\shkstart\\Desktop\\workspace_teach");

        deleteDirectory(dir);

        System.out.println("删除完毕");
    }

}
