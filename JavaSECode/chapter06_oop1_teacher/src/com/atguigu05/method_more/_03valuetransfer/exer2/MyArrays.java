package com.atguigu05.method_more._03valuetransfer.exer2;

/**
 * ClassName: MyArrays
 * Description:
 *      根据上一章数组中的常用算法操作，自定义一个操作int[]的工具类。
 *      涉及到的方法有：求最大值、最小值、总和、平均数、遍历数组、复制数组、数组反转、
 *              数组排序(默认从小到大排序)、查找等
 * @Author 尚硅谷-宋红康
 * @Create 14:13
 * @Version 1.0
 */
public class MyArrays {

    /**
     * 获取int[]数组的最大值
     * @param arr 要获取最大值的数组
     * @return 数组的最大值
     */
    public int getMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * 获取int[]数组的最小值
     * @param arr 要获取最小值的数组
     * @return  数组的最小值
     */
    public int getMin(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    public int getSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public int getAvg(int[] arr){

        return getSum(arr) / arr.length;
    }

    public void print(int[] arr){ //[12,231,34]
        System.out.print("[");

        for (int i = 0; i < arr.length; i++) {
            if(i == 0){
                System.out.print(arr[i]);
            }else{
                System.out.print("," + arr[i]);
            }
        }

        System.out.println("]");
    }

    public int[] copy(int[] arr){
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public void reverse(int[] arr){
        for(int i = 0,j = arr.length - 1;i < j;i++,j--){
            //交互arr[i] 与 arr[j]位置的元素
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public void sort(int[] arr){
        for(int j = 0;j < arr.length - 1;j++){
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if(arr[i] > arr[i + 1]){
                    //交互arr[i] 和 arr[i + 1]
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }

            }
        }
    }

    /**
     * 针对于数组进行排序操作
     * @param arr 待排序的数组
     * @param sortMethod  asc:升序   desc：降序
     */
    public void sort(int[] arr,String sortMethod){
        if("asc".equals(sortMethod)){//if(sortMethod.equals("asc")){ //ascend:升序
            for(int j = 0;j < arr.length - 1;j++){
                for (int i = 0; i < arr.length - 1 - j; i++) {
                    if(arr[i] > arr[i + 1]){
                        //交互arr[i] 和 arr[i + 1]
//                        int temp = arr[i];
//                        arr[i] = arr[i + 1];
//                        arr[i + 1] = temp;
                        //错误的：
//                        swap(arr[i],arr[i + 1]);

                        //正确的：
                        swap(arr,i,i+1);
                    }

                }
            }
        }else if("desc".equals(sortMethod)){
            for(int j = 0;j < arr.length - 1;j++){
                for (int i = 0; i < arr.length - 1 - j; i++) {
                    if(arr[i] < arr[i + 1]){
                        //交互arr[i] 和 arr[i + 1]
//                        int temp = arr[i];
//                        arr[i] = arr[i + 1];
//                        arr[i + 1] = temp;
                        //错误的：
//                        swap(arr[i],arr[i + 1]);

                        //正确的：
                        swap(arr,i,i+1);
                    }

                }
            }
        }else{
            System.out.println("你输入的排序方式有误");
        }

    }

//    public void swap(int i,int j){
//        int temp = i;
//        i = j;
//        j = temp;
//    }

    private void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }



    /**
     * 使用线性查找的算法，查找指定的元素
     * @param arr 待查找的数组
     * @param target 要查找的元素
     * @return target元素在arr数组中的索引位置。若未找到，则返回-1
     */
    public int linearSearch(int[] arr,int target){

        for(int i = 0;i < arr.length;i++){
            if(target == arr[i]){
                return i;
            }

        }

        //只要代码执行到此位置，一定是没找到
        return -1;

    }



}
