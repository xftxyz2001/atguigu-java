package com.atguigu01.file.exer3;

import org.junit.Test;

import java.io.File;

/**
 * ClassName: Exer03
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 16:08
 * @Version 1.0
 */
public class Exer03 {
    //public void printFileName(File file)  //file可能是文件，也可能是文件目录
    @Test
    public void test1(){
        File file = new File("D:\\teach\\01_JavaSE\\Java从入门到精通-JDK17版\\01_课件与电子教材\\尚硅谷_第15章_File类与IO流");
        printFileName(file);
    }

    public void printFileName(File file){
        if(file.isFile()){
            System.out.println(file.getName());
        }else if(file.isDirectory()){
            File[] files = file.listFiles();
            for(File f : files){
                printFileName(f);
            }
        }
    }
}
