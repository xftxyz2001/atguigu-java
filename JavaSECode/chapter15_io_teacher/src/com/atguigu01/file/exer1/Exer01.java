package com.atguigu01.file.exer1;

import java.io.File;

/**
 * ClassName: Exero1
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 15:58
 * @Version 1.0
 */
public class Exer01 {
    public static void main(String[] args) {
        //创建一个与hello.txt文件在相同文件目录下的另一个名为abc.txt文件
        File file1 = new File("hello.txt");

        System.out.println(file1.getAbsolutePath());
        //获取file1的绝对路径，获取此路径的上层文件目录。
//        System.out.println(file1.getAbsoluteFile().getParent());

        File file2 = new File(file1.getAbsoluteFile().getParent(),"abc.txt");

        System.out.println(file2.getAbsolutePath());
    }
}
