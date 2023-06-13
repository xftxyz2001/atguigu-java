package com.atguigu05._super.interview;

/**
 * @author 尚硅谷-宋红康
 * @create 14:02
 */
public class Interview02{
    public static void main(String[] args) {
        Father f = new Father();
        Son s = new Son();
        System.out.println(f.getInfo());//atguigu
        System.out.println(s.getInfo()); //atguigu
        s.test();//atguigu atguigu
        System.out.println("-----------------");
        s.setInfo("大硅谷");
        System.out.println(f.getInfo());//atguigu
        System.out.println(s.getInfo());//大硅谷
        s.test(); //大硅谷 大硅谷
    }
}
class Father{
    private String info = "atguigu";
    public void setInfo(String info){
        this.info = info;
    }
    public String getInfo(){
        return info;
    }
}
class Son extends Father{
    private String info = "尚硅谷";
    public void test(){
        System.out.println(this.getInfo());
        System.out.println(super.getInfo());
    }

//    public String getInfo(){
//        return info;
//    }
}
