package com.atguigu03.threadsafe.exer;

/**
 * ClassName: AccountTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 16:45
 * @Version 1.0
 */
public class AccountTest {
    public static void main(String[] args) {

        Account acct = new Account();

        Customer customer1 = new Customer(acct,"甲");
        Customer customer2 = new Customer(acct,"乙");

        customer1.start();
        customer2.start();

    }
}

class Account{ //账户
    private double balance;//余额

    public synchronized void deposit(double amt){ //this:是不是唯一的？即为acct,是唯一的。
        if(amt > 0){
            balance += amt;
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName()+ "存钱1000块，余额为：" + balance);
    }
}

class Customer extends Thread{
    Account account;

    public Customer(Account acct){
        this.account = acct;
    }

    public Customer(Account acct,String name){
        super(name);
        this.account = acct;
    }

    @Override
    public void run() {

        for (int i = 0; i < 3; i++) {

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            account.deposit(1000);

        }

    }
}
