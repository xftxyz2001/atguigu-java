package com.atguigu01._static.exer1;

/**
 * ClassName: Account
 * Description:
 *      编写一个类实现银行账户的概念，包含的属性有“帐号”、“密码”、“存款余额”、“利率”、“最小余额”，
 *     定义封装这些属性的方法。账号要自动生成。
 * @Author 尚硅谷-宋红康
 * @Create 16:49
 * @Version 1.0
 */
public class Account {

    private int id; //账号

    private String password;//密码

    private double balance; //余额

    private static double interestRate;//利率

    private static double minBalance = 1.0;//最小余额

    private static int init = 1001;//用于自动生成id的基数

    public Account() {
        this.id = init;
        init++;
        password = "000000";
    }

    public Account(String password, double balance) {
        this.password = password;
        this.balance = balance;
        this.id = init;
        init++;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public static double getMinBalance() {
        return minBalance;
    }

    public static void setMinBalance(double minBalance) {
        Account.minBalance = minBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }
}
