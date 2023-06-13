package com.atguigu05.exer.exer1;

/**
 * ClassName: InterfaceTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 9:05
 * @Version 1.0
 */
public class InterfaceTest {
    public static void main(String[] args) {

        ComparableCircle c1 = new ComparableCircle(2.3);
        ComparableCircle c2 = new ComparableCircle(5.3);

        try{
            int compareValue = c1.compareTo(c2);
            if(compareValue > 0){
                System.out.println("c1对象大");
            }else if(compareValue < 0){
                System.out.println("c2对象大");
            }else{
                System.out.println("c1和c2一样大");
            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
