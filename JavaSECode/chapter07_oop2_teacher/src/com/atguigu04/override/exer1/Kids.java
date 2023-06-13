package com.atguigu04.override.exer1;

/**
 * ClassName: Kids
 * Description:
 *      定义类Kids继承ManKind，并包括
 *
 *      - 成员变量int yearsOld；
 *      - 方法printAge()打印yearsOld的值。
 *
 *     修改继承内容的练习1中定义的类Kids，在Kids中重新定义employeed()方法，
 *     覆盖父类ManKind中定义的employeed()方法，输出"Kids should study and no job."
 * @Author 尚硅谷-宋红康
 * @Create 9:52
 * @Version 1.0
 */
public class Kids extends ManKind {
    private int yearsOld;

    public Kids(){

    }

    public Kids(int yearsOld){
        this.yearsOld = yearsOld;
    }

    public Kids(int sex, int salary,int yearsOld){
        this.yearsOld = yearsOld;
        setSex(sex);
        setSalary(salary);
    }


    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge(){

        System.out.println("I am " + yearsOld + " years old.");
    }
    public void employeed(){
        System.out.println("Kids should study and no job.");
    }
}
