package com.atguigu01._this.exer2;

/**
 * ClassName: Customer
 * Description:
 *      客户类
 * @Author 尚硅谷-宋红康
 * @Create 14:25
 * @Version 1.0
 */
public class Customer {
    private String firstName;//名
    private String lastName;//姓

    private Account account; //账户

    public Customer(String f, String l) {
        this.firstName = f;
        this.lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
