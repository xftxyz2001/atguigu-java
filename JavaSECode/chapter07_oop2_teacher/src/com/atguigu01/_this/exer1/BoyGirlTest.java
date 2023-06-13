package com.atguigu01._this.exer1;

/**
 * ClassName: BoyGirlTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 14:16
 * @Version 1.0
 */
public class BoyGirlTest {
    public static void main(String[] args) {

        Boy boy1 = new Boy("杰克",24);
        Girl girl1 = new Girl("朱丽叶",20);

        girl1.marry(boy1);

        boy1.shout();

        Girl girl2 = new Girl("肉丝",18);
        int compare = girl1.compare(girl2);
        if(compare > 0){
            System.out.println(girl1.getName() + "大");
        }else if(compare < 0){
            System.out.println(girl2.getName() + "大");
        }else{
            System.out.println("一样大");
        }


    }
}
