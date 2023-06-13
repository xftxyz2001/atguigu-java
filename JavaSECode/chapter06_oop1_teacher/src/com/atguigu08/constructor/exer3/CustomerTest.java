package com.atguigu08.constructor.exer3;

/**
 * ClassName: CustomerTest
 * Description:
 *      （1）创建一个Customer ，名字叫 Jane Smith, 他有一个账号为1000，余额为2000元，年利率为 1.23％ 的账户。
 *      （2）对Jane Smith操作。
 *          存入 100 元，再取出960元。再取出2000元。
 *          打印出Jane Smith 的基本信息：
 * @Author 尚硅谷-宋红康
 * @Create 9:04
 * @Version 1.0
 */
public class CustomerTest {
    public static void main(String[] args) {
        //创建Customer实例
        Customer customer = new Customer("Jane","Smith");

//        Account account = new Account(1000,2000,0.0123);
//        customer.setAccount(account);
        //或
        customer.setAccount(new Account(1000,2000,0.0123));



        //针对于客户的账户进行取钱、存钱的操作
        customer.getAccount().deposit(100);
        customer.getAccount().withdraw(960);
        customer.getAccount().withdraw(2000);

        //输出客户信息
        //Customer [Smith, Jane] has a account: id is 1000,
        // annualInterestRate is 1.23％, balance is 1140.0
        System.out.println("Customer [" + customer.getLastName() + "," + customer.getFirstName() +
                "] has a account:id is " + customer.getAccount().getId() + ",annualInterestRate is " +
                customer.getAccount().getAnnualInterestRate()*100 + "%,balance is " +
                customer.getAccount().getBalance());


        /*
         * 关于匿名对象
         *
         * 1. 匿名对象往往只能被调用一次
         * 2. 匿名对象常常作为实参传递给方法的形参。
         * */
        new Account(1001,2000,0.0123).withdraw(1000);
        System.out.println(new Account(1001, 2000, 0.0123).getBalance());

        int num = 10;


    }
}
