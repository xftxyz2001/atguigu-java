package com.atguigu03.stream;

import com.atguigu02.reference.data.Employee;
import com.atguigu02.reference.data.EmployeeData;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *  测试Stream的实例化
 *
 * @author 尚硅谷-宋红康
 */
public class StreamAPITest {

    //创建 Stream方式一：通过集合
    @Test
    public void test1(){
        List<Employee> list = EmployeeData.getEmployees();
//        default Stream<E> stream() : 返回一个顺序流
        Stream<Employee> stream = list.stream();

//        default Stream<E> parallelStream() : 返回一个并行流
        Stream<Employee> stream1 = list.parallelStream();

        System.out.println(stream);
        System.out.println(stream1);

    }

    //创建 Stream方式二：通过数组
    @Test
    public void test2(){
        //调用Arrays类的static <T> Stream<T> stream(T[] array): 返回一个流
        Integer[] arr = new Integer[]{1,2,3,4,5};

        Stream<Integer> stream = Arrays.stream(arr);

        int[] arr1 = new int[]{1,2,3,4,5};
        IntStream stream1 = Arrays.stream(arr1);

    }
    //创建 Stream方式三：通过Stream的of()
    @Test
    public void test3(){
        Stream<String> stream = Stream.of("AA", "BB", "CC", "SS", "DD");


    }
    

}
