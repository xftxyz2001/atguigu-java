package com.atguigu02.trycatchfinally;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author 尚硅谷-宋红康
 * @create 11:50
 */
public class ExceptionHandleTest {

    @Test
    public void test1(){
        try{
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            System.out.println(num);

        }catch(NullPointerException e){
            System.out.println("出现了NullPointerException的异常");
        }catch(InputMismatchException e){
            System.out.println("出现了InputMismatchException的异常");
        }catch(RuntimeException e){
            System.out.println("出现了RuntimeException的异常");
        }

        System.out.println("异常处理结束，代码继续执行...");
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
            //或
//            System.out.println(e.getMessage());
        }

        System.out.println("程序结束");
//        System.out.println(str);

    }

    //******************下面来处理编译时异常***************************
    @Test
    public void test3() {
        try{

            File file = new File("D:\\hello.txt");

            FileInputStream fis = new FileInputStream(file); //可能报FileNotFoundException

            int data = fis.read(); //可能报IOException
            while(data != -1){
                System.out.print((char)data);
                data = fis.read(); //可能报IOException
            }

            fis.close(); //可能报IOException
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }

        System.out.println("读取数据结束....");
    }

}
