package com.atguigu01.throwable;

import org.junit.Test;

import java.util.Date;
import java.util.Scanner;

/**
 * @author 尚硅谷-宋红康
 * @create 10:39
 */
public class ExceptionTest {

    /*
    * ArrayIndexOutOfBoundsException
    * */
    @Test
    public void test1(){
        int[] arr = new int[10];
        System.out.println(arr[10]);
    }

    /*
    * NullPointerException
    * */
    @Test
    public void test2(){
//        String str = "hello";
//        str = null;
//        System.out.println(str.toString());

//        int[] arr = new int[10];
//        arr = null;
//        System.out.println(arr[0]);

        int[][] arr1 = new int[10][];
        System.out.println(arr1[0][0]);
    }

    /*
    * ClassCastException
    * */
    @Test
    public void test3(){
        Object obj = new String();
//        String str = (String) obj;

        Date date = (Date) obj;
    }

    /*
    * NumberFormatException
    * */
    @Test
    public void test4(){
        String str = "123";
        str = "abc";
        int i = Integer.parseInt(str);
        System.out.println(i);
    }

    /*
    * InputMismatchException
    * */
    @Test
    public void test5(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num);
    }

    /*
    * ArithmeticException
    * */
    @Test
    public void test6(){
        int num = 10;
        System.out.println(num / 0);
    }

    //******************以上是运行时异常，以下是编译时异常*****************************

    /*
    * ClassNotFoundException
    * */
    @Test
    public void test7(){
//        Class clz = Class.forName("java.lang.String");
    }

    @Test
    public void test8() {
//        File file = new File("D:\\hello.txt");
//
//        FileInputStream fis = new FileInputStream(file); //可能报FileNotFoundException
//
//        int data = fis.read(); //可能报IOException
//        while(data != -1){
//            System.out.print((char)data);
//            data = fis.read(); //可能报IOException
//        }
//
//        fis.close(); //可能报IOException

    }
}
