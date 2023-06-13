package com.atguigu03.main;

/**
 * ClassName: MainTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 9:35
 * @Version 1.0
 */
public class MainTest {
    public static void main(String[] args) { //程序的入口
        String[] arr = new String[]{"AA","BB","CC"};
        Main.main(arr);
    }
}

class Main{

    public static void main(String[] args) { //看做是普通的静态方法
        System.out.println("Main的main()的调用");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

    }

}
