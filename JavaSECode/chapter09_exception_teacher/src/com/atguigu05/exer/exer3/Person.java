package com.atguigu05.exer.exer3;

/**
 * ClassName: Person
 * Description:
 *      ①属性：名称(name)和生命值(lifeValue)
 *      ②提供setter和getter方法：
 *          在setLifeValue(int lifeValue)方法中，首先判断，如果 lifeValue为负数,就抛出NoLifeValueException，
 *          异常信息为：生命值不能为负数：xx；
 *          然后再给成员lifeValue赋值。
 *
 *       ③提供空参构造
 *
*       ④提供有参构造：使用setXxx方法给name和lifeValue赋值
 * @Author 尚硅谷-宋红康
 * @Create 11:20
 * @Version 1.0
 */
public class Person {
    private String name;
    private int lifeValue;

    public Person() {
    }

    public Person(String name, int lifeValue) {
//        this.name = name;
        setName(name);
        setLifeValue(lifeValue);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(int lifeValue) {
        if(lifeValue < 0){
            throw new NoLifeValueException("生命值不能为负数：" + lifeValue);
        }
        this.lifeValue = lifeValue;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lifeValue=" + lifeValue +
                '}';
    }
}
