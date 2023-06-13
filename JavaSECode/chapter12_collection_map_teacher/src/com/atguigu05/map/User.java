package com.atguigu05.map;

/**
 * ClassName: User
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 9:00
 * @Version 1.0
 */
public class User implements Comparable{
    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        System.out.println("User equals()....");
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        User user = (User) o;
//        return age == user.age && Objects.equals(name, user.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }

    /*
    * 比如：按照年龄从小到大排序
    * */
//    @Override
//    public int compareTo(Object o) {
//        if(this == o){
//            return 0;
//        }
//
//        if(o instanceof User){
//            User u = (User)o;
//            return this.age - u.age;
//        }
//
//        throw new RuntimeException("类型不匹配");
//    }

    /*
    * 比如：先比较年龄从小到大排列，如果年龄相同，则继续比较姓名，从大到小
    * */
    @Override
    public int compareTo(Object o) {
        if(this == o){
            return 0;
        }

        if(o instanceof User){
            User u = (User)o;
            int value = this.age - u.age;
            if(value != 0){
                return value;
            }
            return -this.name.compareTo(u.name);
        }

        throw new RuntimeException("类型不匹配");
    }
}
