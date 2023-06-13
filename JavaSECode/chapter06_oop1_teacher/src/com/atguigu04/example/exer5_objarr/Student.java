package com.atguigu04.example.exer5_objarr;

/**
 * ClassName: Student
 * Description:
 *  定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩score(int)。
 * @Author 尚硅谷-宋红康
 * @Create 14:36
 * @Version 1.0
 */
public class Student {

    //属性
    int number;//学号
    int state;//年级
    int score;//成绩

    //声明一个方法，显示学生的属性信息
    public String show(){
        return "number : " + number + ",state : " +
                state + ", score : " + score;
    }
}
