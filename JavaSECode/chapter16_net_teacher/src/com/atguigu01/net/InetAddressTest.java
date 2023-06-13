package com.atguigu01.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * ClassName: InetAddressTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 8:56
 * @Version 1.0
 */
public class InetAddressTest {
    public static void main(String[] args) {


        try {
            //1. 实例化
            //getByName(String host)：获取指定ip对应的InetAddress的实例
            InetAddress inet1 = InetAddress.getByName("192.168.23.31");
            System.out.println(inet1);

            InetAddress inet2 = InetAddress.getByName("www.atguigu.com");
            System.out.println(inet2); //www.atguigu.com/122.228.95.175


            //getLocalHost():获取本地ip对应的InetAddress的实例
//            InetAddress inet3 = InetAddress.getLocalHost();
//            System.out.println(inet3);//DESKTOP-QCP2QPI/192.168.21.107
//
//            InetAddress inet4 = InetAddress.getByName("127.0.0.1");
//            System.out.println(inet4);

            //2.两个常用的方法
//            System.out.println(inet1.getHostName());//192.168.23.31
//            System.out.println(inet1.getHostAddress());//192.168.23.31

            System.out.println(inet2.getHostName());//www.atguigu.com
            System.out.println(inet2.getHostAddress());//122.228.95.175

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
}
