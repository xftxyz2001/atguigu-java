package com.atguigu05.method_more._02args;

/**
 * @author 尚硅谷-宋红康
 * @create 23:23
 */
public class ArgsTest {

    public static void main(String[] args) {
        ArgsTest test = new ArgsTest();

        test.print();
        test.print(1);
        test.print(1,2);

        test.print(new int[]{1,2,3});
//        test.print(1,2,3);
    }


    public void print(int ... nums){
        System.out.println("1111");

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

//    public void print(int[] nums){
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
//    }

    public void print(int i,int ... nums){

    }
    //编译不通过
//    public void print(int ... nums,int i){
//
//    }

    public void print(int i){
        System.out.println("2222");
    }

    public void print(int i,int j){
        System.out.println("3333");
    }

    /*
    场景举例：
    * String sql = "update customers set name = ?,email = ? where id = ?";
    *
    * String sql1 = "update customers set name = ? where id = ?";
    *
    * public void update(String sql,Object ... objs);
    *
    * */

}
