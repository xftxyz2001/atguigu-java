package com.atguigu04.grammar._04instanceof;

import org.junit.Test;

/**
 * ClassName: InstanceOfTest
 * Package: com.atguigu04.grammer._04instanceof
 * Description:
 *      instanceof模式匹配
 *
 * @Author: 尚硅谷-宋红康
 * @Create: 22:30
 * @Version: v1.0
 */
public class InstanceOfTest {
    /*
    * 举例1：
    * JDK14之前
    * */
    @Test
    public void test1(){
        Object obj = new String("hello,Java14");

        if(obj instanceof String){
            String str = (String) obj;
            System.out.println(str.contains("Java"));
        }else{
            System.out.println("非String类型");
        }
    }

    /*
     * 举例1：
     * JDK14中
     * */
    @Test
    public void test2(){


    }

}

/*
* 举例2
* */
class Computer{
    private String model; //型号
    private double price;//价格

    //方式1：
//    public boolean equals(Object o){
//        if(o instanceof Computer){
//            Computer other = (Computer) o;
//            if(this.model.equals(other.model) && this.price == other.price){
//                return true;
//            }
//        }
//        throw new RuntimeException("类型不匹配");
//    }

    //方式2：

}
