package com.atguigu07._abstract.template;

/**
 * ClassName: TemplateTest
 * Description:
 * 抽象应用案例：模板方法的设计模式
 *
 * @Author 尚硅谷-宋红康
 * @Create 15:26
 * @Version 1.0
 */
public class TemplateTest {
    public static void main(String[] args) {
        PrintPrimeNumber p =  new PrintPrimeNumber();

        p.spendTime();
    }
}

abstract class Template {

    //计算某段代码的执行，需要花费的时间
    public void spendTime() {

        long start = System.currentTimeMillis();

        code();

        long end = System.currentTimeMillis();

        System.out.println("花费的时间为：" + (end - start));
    }

    public abstract void code();

}

class PrintPrimeNumber extends Template {

    @Override
    public void code() {

        for (int i = 2; i <= 100000; i++) {
            boolean isFlag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isFlag = false;
                    break;
                }
            }
            if (isFlag) {
                System.out.println(i);
            }
        }

    }
}
