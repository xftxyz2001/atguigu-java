package com.atguigu02.selfdefine.exer3;

/**
 * ClassName: StudentTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 10:41
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {

        /*
        *   语文老师希望成绩是“优秀”、“良好”、“及格”、“不及格”，数学老师希望成绩是89.5, 65.0，
            英语老师希望成绩是'A','B','C','D','E'
        * */

        Student<String> s1 = new Student<>("Tom","良好");

        Student<Double> s2 = new Student<>("Jerry",87.5);//87.5自动装箱

        Student<Character> s3 = new Student<>("Rose",'A');//'A'自动装箱


        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}
