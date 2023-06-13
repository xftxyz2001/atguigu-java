package com.atguigu05.exer.exer1;

/**
 * ClassName: CompareObject
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 8:55
 * @Version 1.0
 */
public interface CompareObject {
    //若返回值是 0 , 代表相等; 若为正数，代表当前对象大；负数代表当前对象小
    public int compareTo(Object o) throws Exception;
}
