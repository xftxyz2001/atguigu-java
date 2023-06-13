package com.atguigu03.field_method.field.exer2;

/**
 * ClassName: EmployeeTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 9:07
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {

        //创建Employee的一个实例
        Employee emp1 = new Employee();

        emp1.id = 1001;
        emp1.name = "杰克"; //emp1.name = new String("杰克");
        emp1.age = 24;
        emp1.salary = 8900;

        emp1.birthday = new MyDate();
        emp1.birthday.year = 1998;
        emp1.birthday.month = 2;
        emp1.birthday.day = 28;
        /*
        另一种写法：
        * MyDate mydate1 = new MyDate();
        * emp1.birthday = mydate1;
        * */

        //打印员工信息
        System.out.println("id = " + emp1.id + ",name = " + emp1.name +
                ", age = " + emp1.age + ", salary = " + emp1.salary +
                ", birthday = [" + emp1.birthday.year + "年" + emp1.birthday.month +
                "月" + emp1.birthday.day + "日]");


    }
}





















