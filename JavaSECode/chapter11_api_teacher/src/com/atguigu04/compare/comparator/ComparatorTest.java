package com.atguigu04.compare.comparator;

import com.atguigu04.compare.Product;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ClassName: ComparatorTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 16:57
 * @Version 1.0
 */
public class ComparatorTest {

    @Test
    public void test1(){
        Product[] arr = new Product[5];
        arr[0] = new Product("HuaweiMate50pro",6299);
        arr[1] = new Product("Xiaomi13pro",4999);
        arr[2] = new Product("VivoX90pro",5999);
        arr[3] = new Product("Iphone14ProMax",9999);
        arr[4] = new Product("HonorMagic4",6299);

        //创建一个实现了Comparator接口的实现类的对象
        Comparator comparator = new Comparator(){

            //如果判断两个对象o1,o2的大小，其标准就是此方法的方法体要编写的逻辑。
            //比如：按照价格从高到低排序
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Product && o2 instanceof Product){

                    Product p1 = (Product) o1;
                    Product p2 = (Product) o2;

                    return -Double.compare(p1.getPrice(),p2.getPrice());

                }

                throw new RuntimeException("类型不匹配");

            }
        };


        Comparator comparator1 = new Comparator(){

            //如果判断两个对象o1,o2的大小，其标准就是此方法的方法体要编写的逻辑。
            //比如：按照name从低到高排序
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Product && o2 instanceof Product){

                    Product p1 = (Product) o1;
                    Product p2 = (Product) o2;

                    return p1.getName().compareTo(p2.getName());
                }

                throw new RuntimeException("类型不匹配");

            }
        };

        Arrays.sort(arr,comparator1);


        //排序后，遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }

    @Test
    public void test2(){
        String[] arr = new String[]{"Tom","Jerry","Tony","Rose","Jack","Lucy"};

        Arrays.sort(arr,new Comparator(){

            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof String && o2 instanceof String){
                    String s1 =(String) o1;
                    String s2 =(String) o2;

                    return -s1.compareTo(s2);
                }
                throw new RuntimeException("类型不匹配");
            }
        });

        //排序后，遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
