package com.atguigu04.grammar._03var;

import org.junit.Test;

import java.util.*;

/**
 * ClassName: VarTest
 * Package: com.atguigu04.grammer._03var
 * Description:
 * 局部变量的类型推断
 *
 * @Author: 尚硅谷-宋红康
 * @Create: 21:24
 * @Version: v1.0
 */
public class VarTest {

    //可以使用的场景
    @Test
    public void test1(){
        //1.局部变量的实例化
        var list = new ArrayList<String>();

        var set = new LinkedHashSet<Integer>();

        //2.增强for循环中的索引
        for (var v : list) {
            System.out.println(v);
        }

        //3.传统for循环中
        for (var i = 0; i < 100; i++) {
            System.out.println(i);
        }

        //4. 返回值类型含复杂泛型结构
        var iterator = set.iterator();

        HashMap<String,Integer> map = new HashMap<>();
        var entrySet = map.entrySet();

    }

    /*
    - 声明一个成员变量
    - 声明一个数组变量，并为数组静态初始化（省略new的情况下）
    - 方法的返回值类型
    - 方法的参数类型
    - 没有初始化的方法内的局部变量声明
    - 作为catch块中异常类型
    - Lambda表达式中函数式接口的类型
    - 方法引用中函数式接口的类型
    * */
//    var i;
//    var j = 0;
    @Test
    public void test2(){
        var arr = new int[]{1,2,3};
//        var arr1 = {1,2,3};
    }

//    public var method(int i,var m){
//        var i = 0;
//    }

    @Test
    public void test3(){
//        try{
//            System.out.println(10 / 0);
//        }  catch (var e){
//            e.printStackTrace();
//        }

//        var com = (s1,s2)-> s1.compareTo(s2);
    }
}

