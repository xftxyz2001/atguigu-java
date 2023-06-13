package com.atguigu05.method_more._02args.exer;

/**
 * ClassName: StringConCatTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 16:56
 * @Version 1.0
 */
public class StringConCatTest {

    public static void main(String[] args) {

        StringConCatTest test = new StringConCatTest();
        String info = test.concat("-","hello","world");
        System.out.println(info);//hello-world

        System.out.println(test.concat("/", "hello"));

        System.out.println(test.concat("-"));

    }

    //n个字符串进行拼接，每一个字符串之间使用某字符进行分割，如果没有传入字符串，那么返回空字符串""

    public String concat(String operator,String ... strs){
        String result = "";

        for (int i = 0;i < strs.length;i++){
            if(i == 0){
                result += strs[i];
            }else{
                result += (operator + strs[i]);
            }
        }

        return result;
    }
}
