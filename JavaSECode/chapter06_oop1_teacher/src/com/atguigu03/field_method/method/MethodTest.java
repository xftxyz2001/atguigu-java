

package com.atguigu03.field_method.method;

/**
 * @author 尚硅谷-宋红康
 * @create 19:01
 */
public class MethodTest {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.eat();
        p1.eat();

        p1.info();

        p1.sleep(8);

        String info = p1.interests("编程");
        System.out.println(info);
    }

}



class Person{

    //属性
    String name;
    int age;
    char gender;

    //方法
    public void eat(){
        System.out.println("人吃饭");

        sleep(8);

        System.out.println("name = " + name);
    }

    public void sleep(int hour){
        System.out.println("人至少每天睡眠" + hour + "小时");
    }

    public String interests(String hobby){
        String info = "我的爱好是" + hobby;
        System.out.println(info);
//        return info;

        return "abc";
    }

    public int getAge(){
        return age;
    }

    public void info(){
        System.out.println("Person info()");
//        info();

        //方法内不能定义方法！
//        public void show(){
//
//        }
    }

    public void printNumber(int targetNumber){ //10
        for(int i = 1;i <= targetNumber;i++){

            if(i == 4){
                return ; //用于结束方法。
                //return后面不能声明执行语句
//                System.out.println("迪丽热巴要约我吃饭");
            }

            System.out.println(i);
        }
    }

}
