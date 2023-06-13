package com.atguigu05.method_more._03valuetransfer;

/**
 * ClassName: ValueTransferTest3
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 9:19
 * @Version 1.0
 */
public class ValueTransferTest3 {
    public static void main(String[] args) {

        ValueTransferTest3 test = new ValueTransferTest3();

        Data data = new Data();
        data.m = 10;
        data.n = 20;

        System.out.println("m = " + data.m + ", n = " + data.n);

        //操作1：
//        int temp = data.m ;
//        data.m = data.n;
//        data.n = temp;

        //操作2：
        test.swap(data);
        System.out.println("m = " + data.m + ", n = " + data.n);

    }

    public void swap(Data data){
        int temp = data.m ;
        data.m = data.n;
        data.n = temp;
    }


}

class Data{
    int m;
    int n;
}
