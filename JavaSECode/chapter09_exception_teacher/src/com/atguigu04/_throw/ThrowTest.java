package com.atguigu04._throw;

/**
 * ClassName: ThrowTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 10:27
 * @Version 1.0
 */
public class ThrowTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        try{
            s1.regist(10);
            s1.regist(-10);
            System.out.println(s1);
        }catch(Exception e){
            e.printStackTrace();
//            System.out.println(e.getMessage());
        }



    }
}

class Student {
    int id;

//    public void regist(int id) t{
//        if(id > 0){
//            this.id = id;
//        }else{
////            System.out.println("输入的id非法");
//            //手动抛出异常类的对象
////            throw new RuntimeException("输入的id非法");
//
//        }
//    }

    public void regist(int id) throws Exception {
        if (id > 0) {
            this.id = id;
        } else {
//            System.out.println("输入的id非法");
            //手动抛出异常类的对象
//            throw new RuntimeException("输入的id非法");

//            throw new Exception("输入的id非法");

//            throw new String("输入的id非法"); //报错
            throw new BelowZeroException("输入的id非法");

//            System.out.println("此语句不能被执行");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}
