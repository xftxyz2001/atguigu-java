package com.atguigu01._this.exer2;

/**
 * ClassName: Account
 * Description:
 *      账户类
 * @Author 尚硅谷-宋红康
 * @Create 14:22
 * @Version 1.0
 */
public class Account {
    private double balance;//余额

    public Account(double init_balance) {
        this.balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }

    //存钱
    public void deposit(double amt){
        if(amt > 0){
            balance += amt;
            System.out.println("成功存入：" + amt);
        }
    }

    //取钱
    public void withdraw(double amt){
        if(balance >= amt && amt > 0){
            balance -= amt;
            System.out.println("成功取出：" + amt);
        }else{
            System.out.println("取款数额有误或余额不足");
        }
    }
}
