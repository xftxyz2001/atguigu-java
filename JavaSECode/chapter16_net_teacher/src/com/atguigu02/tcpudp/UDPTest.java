package com.atguigu02.tcpudp;

import org.junit.Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * ClassName: UDPTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 11:32
 * @Version 1.0
 */
public class UDPTest {
    //发送端
    @Test
    public void sender() throws Exception {
        //1. 创建DatagramSocket的实例
        DatagramSocket ds = new DatagramSocket();

        //2. 将数据、目的地的ip，目的地的端口号都封装在DatagramPacket数据报中
        InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
        int port = 9090;
        byte[] bytes = "我是发送端".getBytes("utf-8");
        DatagramPacket packet =  new DatagramPacket(bytes,0,bytes.length,inetAddress,port);

        //发送数据
        ds.send(packet);

        ds.close();
    }

    //接收端
    @Test
    public void receiver() throws IOException {
        //1. 创建DatagramSocket的实例
        int port = 9090;
        DatagramSocket ds = new DatagramSocket(port);

        //2. 创建数据报的对象，用于接收发送端发送过来的数据
        byte[] buffer = new byte[1024 * 64];
        DatagramPacket packet = new DatagramPacket(buffer,0,buffer.length);

        //3. 接收数据
        ds.receive(packet);

        //4.获取数据，并打印到控制台上
        String str = new String(packet.getData(),0,packet.getLength());
        System.out.println(str);

        ds.close();
    }
}
