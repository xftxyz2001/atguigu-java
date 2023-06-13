package com.atguigu02.singleton;

/**
 * ClassName: GirlFriend
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 9:09
 * @Version 1.0
 */
public class GirlFriendTest {
    public static void main(String[] args) {

    }
}

//懒汉式
class GirlFriend{
    //1.类的构造器私有化
    private GirlFriend(){
    }

    //2. 声明当前类的实例
    //4. 此属性也必须声明为static的
    private static GirlFriend instance = null;

    //3. 通过getXxx()获取当前类的实例，如果未创建对象，则在方法内部进行创建
    public static GirlFriend getInstance(){

        if(instance == null){

            instance = new GirlFriend();

        }

        return instance;


    }
}
