package com.atguigu1.one.exer3;

import java.util.Scanner;

/**
 * ClassName: ArrayExer03
 * Description:
 * 案例：学生考试等级划分
 * <p>
 * 从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
 * 成绩>=最高分-10    等级为’A’
 * 成绩>=最高分-20    等级为’B’
 * 成绩>=最高分-30    等级为’C’
 * 其余              等级为’D’
 *
 * @Author 尚硅谷-宋红康
 * @Create 10:42
 * @Version 1.0
 */
public class ArrayExer03 {
    public static void main(String[] args) {
        //1. 从键盘输入学生的人数，根据人数，创建数组(动态初始化)
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入学生人数：");
        int count = scan.nextInt();

        int[] scores = new int[count];

        //2. 根据提示，依次输入学生成绩，并将成绩保存在数组元素中
        System.out.println("请输入" + count + "个成绩");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scan.nextInt();
        }


        //3. 获取学生成绩的最大值
        int maxScore = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (maxScore < scores[i]) {
                maxScore = scores[i];
            }
        }

        System.out.println("最高分是：" + maxScore);

        //4. 遍历数组元素，根据学生成绩与最高分的差值，得到每个学生的等级，并输出成绩和等级
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= maxScore - 10) {
                System.out.println("student " + i + " score is " + scores[i] +
                        " grade is A");
            } else if (scores[i] >= maxScore - 20) {
                System.out.println("student " + i + " score is " + scores[i] +
                        " grade is B");
            } else if (scores[i] >= maxScore - 30) {
                System.out.println("student " + i + " score is " + scores[i] +
                        " grade is C");
            } else {
                System.out.println("student " + i + " score is " + scores[i] +
                        " grade is D");
            }
        }

        scan.close();

    }
}
