package com.atguigu05.method_more._01overload;

/**
 * ClassName: OverloadTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 16:13
 * @Version 1.0
 */
public class OverloadTest {

    public static void main(String[] args) {

        OverloadTest test = new OverloadTest();

        test.add(1,2,3);

        test.add(10,20);

        test.add(10,20.0);

    }


    public void add(int i,int j){
        System.out.println("1111");
    }

    public void add(double d1,double d2){
        System.out.println("3333");
    }

    public void add(int i,int j,int k){

    }

    public void add(String s1,String s2){

    }

    public void add(int i,String s){

    }

    public void add(String s,int i){

    }

//    public void add(int m ,int n){
//        System.out.println("2222");
//    }

//    public int add(int m,int n){
//        return m + n;
//    }

}
