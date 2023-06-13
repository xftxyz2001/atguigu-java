package com.atguigu02.stringmore;

import org.junit.Test;

/**
 * ClassName: StringBufferBuilderTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 11:16
 * @Version 1.0
 */
public class StringBufferBuilderTest {
    /*
    *   （1）StringBuffer append(xx)：提供了很多的append()方法，用于进行字符串追加的方式拼接
        （2）StringBuffer delete(int start, int end)：删除[start,end)之间字符
        （3）StringBuffer deleteCharAt(int index)：删除[index]位置字符
        （4）StringBuffer replace(int start, int end, String str)：替换[start,end)范围的字符序列为str
        （5）void setCharAt(int index, char c)：替换[index]位置字符
        （6）char charAt(int index)：查找指定index位置上的字符
        （7）StringBuffer insert(int index, xx)：在[index]位置插入xx
        （8）int length()：返回存储的字符数据的长度
        （9）StringBuffer reverse()：反转
    * */
    @Test
    public void test1(){
        StringBuilder  sBuilder = new StringBuilder();
        sBuilder.append("abc").append("123").append("def"); //方法链的调用
        System.out.println(sBuilder);
    }

    @Test
    public void test2(){
        StringBuilder  sBuilder = new StringBuilder("hello");
        sBuilder.insert(2,1);
        sBuilder.insert(2,"abc");
        System.out.println(sBuilder);

        StringBuilder sBuilder1 = sBuilder.reverse();

        System.out.println(sBuilder);
        System.out.println(sBuilder1);

        System.out.println(sBuilder == sBuilder1);

        System.out.println(sBuilder.length()); //实际存储的字符的个数
    }

    @Test
    public void test3(){
        StringBuilder  sBuilder = new StringBuilder("hello");
        sBuilder.setLength(2);

        System.out.println(sBuilder);

        sBuilder.append("c");
        System.out.println(sBuilder);

        sBuilder.setLength(10);
        System.out.println(sBuilder);
        System.out.println(sBuilder.charAt(6) == 0); //true
    }
    /*
    * 测试String、StringBuffer、StringBuilder在操作数据方面的效率
    * */
    @Test
    public void test4(){
        //初始设置
        long startTime = 0L;
        long endTime = 0L;


        String text = "";
        StringBuffer buffer = new StringBuffer("");
        StringBuilder builder = new StringBuilder("");

        //开始对比
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            buffer.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer的执行时间：" + (endTime - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            builder.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder的执行时间：" + (endTime - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            text = text + i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("String的执行时间：" + (endTime - startTime));
    }

}
