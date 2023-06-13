package com.atguigu4.search_sort.exer1;

/**
 * ClassName: ArrayExer01_2
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 9:27
 * @Version 1.0
 */
public class ArrayExer01_2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};

        int deleteIndex = 4;

        //方式1：不新建数组
//        for(int i = deleteIndex;i < arr.length - 1;i++){
//            arr[i] = arr[i + 1];
//        }
//
//        //修改最后元素,设置为默认值
//        arr[arr.length - 1] = 0;


        //方式2：新建数组，新的数组的长度比原有数组的长度少1个
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < deleteIndex; i++) {
            newArr[i] = arr[i];
        }

        for(int i = deleteIndex;i < arr.length - 1;i++){
            newArr[i] = arr[i + 1];
        }

        arr = newArr;

        //遍历arr数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

    }
}
