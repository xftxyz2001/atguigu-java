package com.atguigu07.encapsulation;

/**
 * ClassName: AnimalTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 14:34
 * @Version 1.0
 */
public class AnimalTest {
    public static void main(String[] args) {

        Animal animal1 = new Animal();

        animal1.name = "金蟾";
        //因为legs声明为private，是私有的，出了Animal类之外就不能调用了。
//        animal1.legs = 4;
//        animal1.legs = -4;

        //只能通过setLegs()，间接的对legs属性进行赋值。
        animal1.setLegs(2);
        animal1.setLegs(-2);

//        System.out.println("name = " + animal1.name + ", legs = " + animal1.legs);

        System.out.println("name = " + animal1.name + ", legs = " + animal1.getLegs());

        animal1.eat();

    }
}

class Animal{ //动物
    //属性
    String name; //名字
    private int legs;//腿的个数



    //方法
    //设置legs的属性值
    public void setLegs(int l){
        if(l >= 0 && l % 2 == 0){
            legs = l;
        }else{
            System.out.println("你输入的数据非法");
        }
    }
    //获取legs的属性值
    public int getLegs(){
        return legs;
    }


    public void eat(){
        System.out.println("动物觅食");
    }
}

//private class AA{}
