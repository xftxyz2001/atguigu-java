package com.atguigu02.method_lifecycle.exer;

/**
 * ClassName: HappyNewYear
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 16:37
 * @Version 1.0
 */
public class HappyNewYear {
    public static void main(String[] args) {

        for (int i = 10; i >= 0; i--) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if(i > 0){
                System.out.println(i);
            }else{
                System.out.println("Happy New Year!");
            }
        }


    }
}
