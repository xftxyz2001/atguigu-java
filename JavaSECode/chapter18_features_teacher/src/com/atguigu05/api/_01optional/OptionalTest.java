package com.atguigu05.api._01optional;

import org.junit.Test;

import java.util.Optional;

/**
 * ClassName: OptionalTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 15:36
 * @Version 1.0
 */
public class OptionalTest {
    @Test
    public void test(){

        String star = "迪丽热巴";
        star = null;

        //使用Optional避免空指针的问题
        //1. 实例化：
        //ofNullable(T value)`：用来创建一个Optional实例，value可能是空，也可能非空
        Optional<String> optional = Optional.ofNullable(star);

        //orElse(T other):如果Optional实例内部的value属性不为null，则返回value。如果value为null，
        //则返回other。
        String otherStar = "杨幂";
        String finalStar = optional.orElse(otherStar);

        System.out.println(finalStar.toString());


    }

    @Test
    public void test2(){
        String star = "迪丽热巴";
        Optional<String> optional = Optional.ofNullable(star);
        //get():取出内部的value值。
        System.out.println(optional.get());
    }

}
