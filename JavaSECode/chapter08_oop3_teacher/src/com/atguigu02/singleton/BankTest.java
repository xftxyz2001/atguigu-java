package com.atguigu02.singleton;

/**
 * ClassName: BankTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 9:04
 * @Version 1.0
 */
public class BankTest {
    public static void main(String[] args) {
//        Bank bank1 = new Bank();
//        Bank bank2 = new Bank();

        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();

        System.out.println(bank1 == bank2);

    }
}

//饿汉式
class Bank{

    //1. 类的构造器私有化
    private Bank(){

    }

    //2. 在类的内部创建当前类的实例
    //4. 此属性也必须声明为static的
    private static Bank instance = new Bank();

    //3. 使用getXxx()方法获取当前类的实例，必须声明为static的
    public static Bank getInstance(){
        return instance;
    }

}
