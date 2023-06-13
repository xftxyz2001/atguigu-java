package com.atguigu05._super.exer3;

/**
 * ClassName: CheckAccountTest
 * Description:
 *      写一个用户程序测试CheckAccount类。
 *      在用户程序中，创建一个账号为1122、余额为20000、年利率4.5%，可透支限额为5000元的CheckAccount对象。
 *
 *       使用withdraw方法提款5000元，并打印账户余额和可透支额。
 *       再使用withdraw方法提款18000元，并打印账户余额和可透支额。
 *       再使用withdraw方法提款3000元，并打印账户余额和可透支额。
 * @Author 尚硅谷-宋红康
 * @Create 14:49
 * @Version 1.0
 */
public class CheckAccountTest {
    public static void main(String[] args) {

        CheckAccount checkAccount = new CheckAccount(1122,20000,0.045,5000);

        checkAccount.withdraw(5000);
        System.out.println("您的账户余额：" + checkAccount.getBalance());
        System.out.println("您的可透支额：" + checkAccount.getOverdraft());

        checkAccount.withdraw(18000);
        System.out.println("您的账户余额：" + checkAccount.getBalance());
        System.out.println("您的可透支额：" + checkAccount.getOverdraft());

        checkAccount.withdraw(3000);
        System.out.println("您的账户余额：" + checkAccount.getBalance());
        System.out.println("您的可透支额：" + checkAccount.getOverdraft());
    }
}
