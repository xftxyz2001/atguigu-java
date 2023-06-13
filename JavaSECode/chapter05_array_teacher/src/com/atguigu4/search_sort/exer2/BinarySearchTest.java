package com.atguigu4.search_sort.exer2;

/**
 * ClassName: BinarySearchTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 10:05
 * @Version 1.0
 */
public class BinarySearchTest {
    public static void main(String[] args) {

        int[] arr2 = new int[]{2,4,5,8,12,15,19,26,37,49,51,66,89,100};

        int target = 5;
//        target = 17;

        int head = 0;//默认的首索引
        int end = arr2.length - 1;//默认的尾索引


        boolean isFlag = false;//判断是否找到了指定元素

        while(head <= end){

            int middle = (head + end) / 2;

            if(target == arr2[middle]){
                System.out.println("找到了" + target + ",对应的位置为：" + middle);
                isFlag = true;
                break;
            }else if(target > arr2[middle]){
                head = middle + 1;
            }else{//target < arr2[middle]
                end = middle - 1;
            }
        }

        if(!isFlag){
            System.out.println("不好意思，未找到");
        }
    }
}
