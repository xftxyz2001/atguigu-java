package com.atguigu02.tcpudp.chat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 * 案例：聊天室的实现 （服务器端）
 *
 * @author 尚硅谷-宋红康
 * @create 16:45
 */
public class ChatServerTest {
	//这个集合用来存储所有在线的客户端
	static ArrayList<Socket> online = new  ArrayList<Socket>();
	
	public static void main(String[] args)throws Exception {
		//1、启动服务器，绑定端口号
		ServerSocket server = new ServerSocket(8989);
		
		//2、接收n多的客户端同时连接
		while(true){
			Socket socket = server.accept(); //阻塞式的方法
			
			online.add(socket);//把新连接的客户端添加到online列表中

			//主要负责获取当前socket中的数据，并分发给当前聊天室的所有的客户端。
			MessageHandler mh = new MessageHandler(socket);
			mh.start();//
		}
	}
	
	static class MessageHandler extends Thread{
		private Socket socket;
		private String ip;
		
		public MessageHandler(Socket socket) {
			super();
			this.socket = socket;
		}

		public void run(){
			try {
				ip = socket.getInetAddress().getHostAddress();
				
				//插入：给其他客户端转发“我上线了”
				sendToOther(ip+"上线了");
				
				//(1)接收该客户端的发送的消息
				InputStream input = socket.getInputStream();
				InputStreamReader reader = new InputStreamReader(input);
				BufferedReader br = new BufferedReader(reader);
				
				String str;
				while((str = br.readLine())!=null){
					//(2)给其他在线客户端转发
					sendToOther(ip+":"+str);
				}
				
				sendToOther(ip+"下线了");
			} catch (IOException e) {
				try {
					sendToOther(ip+"掉线了");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}finally{
				//从在线人员中移除我
				online.remove(socket);
			}
		}
		
		//封装一个方法：给其他客户端转发xxx消息
		public void sendToOther(String message) throws IOException{
			//遍历所有的在线客户端，一一转发
			for (Socket on : online) {
				OutputStream every = on.getOutputStream();
				//为什么用PrintStream？目的用它的println方法，按行打印
				PrintStream ps = new PrintStream(every);
				
				ps.println(message);
			}
		}
	}
}

