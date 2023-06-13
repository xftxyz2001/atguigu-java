package com.atguigu02.trycatchfinally;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ClassName: FinallyTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 8:52
 * @Version 1.0
 */
public class FinallyTest {
    @Test
    public void test1(){
        try{
            String str = "123";
            str = "abc";
            int i = Integer.parseInt(str);
            System.out.println(i);
        }catch(NumberFormatException e){
            e.printStackTrace();

            System.out.println(10 / 0); //在catch存在异常
        }

        System.out.println("程序结束");
    }

    @Test
    public void test2(){
        try{
            String str = "123";
            str = "abc";
            int i = Integer.parseInt(str);
            System.out.println(i);
        }catch(NumberFormatException e){
            e.printStackTrace();

            System.out.println(10 / 0); //在catch存在异常

        }finally{
            System.out.println("程序结束");
        }
    }

    @Test
    public void test3(){
        try{
            String str = "123";
            str = "abc";
            int i = Integer.parseInt(str);
            System.out.println(i);
        }finally{
            System.out.println("程序结束");
        }
    }

    //实际开发中，finally的使用
    @Test
    public void test4() {
        FileInputStream fis = null;
        try{
            File file = new File("D:\\hello.txt");

            fis = new FileInputStream(file); //可能报FileNotFoundException


            int data = fis.read(); //可能报IOException
            while(data != -1){
                System.out.print((char)data);
                data = fis.read(); //可能报IOException
            }


        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            //重点：将流资源的关闭操作声明在finally中
            try {
                if(fis != null)
                    fis.close(); //可能报IOException
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
