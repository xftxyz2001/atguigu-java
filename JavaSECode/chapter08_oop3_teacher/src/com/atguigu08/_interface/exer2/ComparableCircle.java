package com.atguigu08._interface.exer2;

/**
 * ClassName: ComparableCircle
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 8:58
 * @Version 1.0
 */
public class ComparableCircle extends Circle implements CompareObject{
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    //根据对象的半径的大小，比较对象的大小
    @Override
    public int compareTo(Object o) {
        if(this == o){
            return 0;
        }

        if(o instanceof ComparableCircle){
            ComparableCircle c = (ComparableCircle)o;
            //错误的
//            return (int) (this.getRadius() - c.getRadius());
            //正确的写法1：
//            if(this.getRadius() > c.getRadius()){
//                return 1;
//            }else if(this.getRadius() < c.getRadius()){
//                return -1;
//            }else{
//                return 0;
//            }
            //正确的写法2：
            return Double.compare(this.getRadius(),c.getRadius());
        }else{
            return 2; //如果输入的类型不匹配，则返回2
//            throw new RuntimeException("输入的类型不匹配");
        }

    }
}
