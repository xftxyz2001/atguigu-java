package com.atguigu3.common_algorithm.exer2;

/**
 * ClassName: ArrayExer02
 * Description:
 *      （1）在编程竞赛中，有10位评委为参赛的选手打分，分数分别为：5,4,6,8,9,0,1,2,7,3
 *      （2）求选手的最后得分（去掉一个最高分和一个最低分后其余8位评委打分的平均值）
 * @Author 尚硅谷-宋红康
 * @Create 16:29
 * @Version 1.0
 */
public class ArrayExer02 {
    public static void main(String[] args) {

        int[] scores = {5,4,6,8,9,0,1,2,7,3};
        //声明三个特征值
        int sum = 0;
        int max = scores[0];
        int min = scores[0];

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i]; //累加总分
            //用于获取最高分
            if(max < scores[i]){
                max = scores[i];
            }
            //用于获取最低分
            if(min > scores[i]){
                min = scores[i];
            }
        }

        int avg = (sum - max - min) / (scores.length - 2);
        System.out.println("去掉最高分和最低分之后，平均分为：" + avg);


    }
}
