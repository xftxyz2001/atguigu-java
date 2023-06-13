package com.atguigu14.review;

/**
 * ClassName: BlockTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 15:04
 * @Version 1.0
 */
public class BlockTest {

    static{
        System.out.println("abc");
    }

    {
        System.out.println("hello");
    }

    public BlockTest(){

    }

    public BlockTest(int id){}
}
