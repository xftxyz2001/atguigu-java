package com.atguigu13.idea.debug;

/**
 * ClassName: Debug03
 * Package: com.atguigu.debug
 * Description: 演示3：字段断点
 *
 * @Author: 尚硅谷-宋红康
 * @Create: 21:34
 * @Version 1.0
 */
public class Debug03 {
    public static void main(String[] args) {


    }
}

class Person{
    private int id = 1;
    private String name;

    public Person() {
    }
    {
        id = 2;
    }
    public Person(int id) {
        this.id = id;
    }



    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
