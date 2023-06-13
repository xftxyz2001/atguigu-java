package com.atguigu08.constructor.exer3;

/**
 * ClassName: Customer
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 9:00
 * @Version 1.0
 */
public class Customer {

    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String f,String l){
        firstName = f;
        lastName = l;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setAccount(Account a){
        account = a;
    }
    public Account getAccount(){
        return account;
    }


}
