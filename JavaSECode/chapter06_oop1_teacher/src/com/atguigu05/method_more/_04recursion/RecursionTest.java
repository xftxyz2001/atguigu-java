package com.atguigu05.method_more._04recursion;

/**
 * @author 尚硅谷-宋红康
 * @create 16:57
 */
public class RecursionTest {

    public static void main(String[] args) {
        RecursionTest test = new RecursionTest();

//        test.method1();

        System.out.println(test.getSum(100));
        System.out.println(test.getSum1(100));

        int n = 5;
        System.out.println(test.getMul(5)); //

        int m = 10;
        System.out.println(test.f(m));
    }


    /*
    * 举例1：计算1-100内自然数的总和
    * */
    public int getSum(int num){
        int sum = 0;
        for(int i = 1;i <= num;i++){
            sum += i;
        }
        return sum;
    }

    public int getSum1(int num){
        if(num == 1){
            return 1;
        }else{
            return getSum1(num - 1) + num;
        }

    }

    /*
    * 举例2：计算n!
    * */
    public int getMul(int n){
        if(n == 1){
            return 1;
        }else{
            return n * getMul(n - 1);
        }
    }

    /*
    * 举例3：快速排序
    * */

    /*
    * 举例4：汉诺塔游戏
    * */

    /*
    * 举例5：斐波那契数列
    * 1  1  2    3   5   8   13  21  34  55  ...
    *
    * f(n) = f(n - 1) + f(n - 2)
    * */
    public int f(int n){
        if(n == 1){
            return 1;
        }else if(n == 2){
            return 1;
        }else{
            return f(n - 1) + f(n - 2);
        }
    }

    /*
    * 举例6：
    *  File类的对象表示一个文件目录。
    * 计算指定的文件目录的大小，遍历指定的文件目录中的所有的文件，删除指定的文件目录。
    * */



    /*
    * 如下递归方法的调用，会导致StackOverflowError。
    * */
//    public void method1(){
//        System.out.println("method1()....");
//        method1();
//    }
}
