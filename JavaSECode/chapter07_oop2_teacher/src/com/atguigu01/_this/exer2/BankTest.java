package com.atguigu01._this.exer2;

/**
 * ClassName: BankTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 14:35
 * @Version 1.0
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addCustomer("操","曹");
        bank.addCustomer("备","刘");

        bank.getCustomer(0).setAccount(new Account(1000));
        bank.getCustomer(0).getAccount().withdraw(50);

        System.out.println("账户余额为：" + bank.getCustomer(0).getAccount().getBalance());
    }
}
