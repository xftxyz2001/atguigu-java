package com.atguigu.snake;
import javax.swing.*;

/**
 * 创建游戏窗口，在窗口中添加一个游戏面板
 */
public class StartGame {
    public static void main(String[] args){
        //建立游戏窗口
        //标题
        JFrame frame = new JFrame("硅谷贪吃蛇");
        //窗体大小
        frame.setSize(500,500);
        //窗口显示屏幕中间
        frame.setLocationRelativeTo(null);
        //固定窗口大小
        frame.setResizable(false);
        //设置窗体关闭事件
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //添加游戏内容
        frame.add(new SnakePanel());
        //设置窗体可见
        frame.setVisible(true);
    }
}
