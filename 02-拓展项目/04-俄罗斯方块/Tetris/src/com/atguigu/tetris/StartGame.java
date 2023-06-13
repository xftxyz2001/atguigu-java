package com.atguigu.tetris;


import com.atguigu.tetris.help.Help;

import javax.swing.*;

public class StartGame extends JFrame {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(525, 600);
        frame.setUndecorated(false);//true去掉窗口框！
        frame.setTitle("尚硅谷-俄罗斯方块");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Location 位置 RelativeTo相对于
        frame.setLocationRelativeTo(null);//使当前窗口居中
        //创建并添加菜单栏
        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);
        JMenu menuFile = new JMenu("Help(F1)");
        menuBar.add(menuFile);
        //点击帮助按钮显示游戏帮助
        Help help = new Help();
        help.showHelp(frame, menuFile);
        //添加游戏主界面
        GamePanel gamePanel = new GamePanel(frame);
        frame.add(gamePanel);
        frame.setSize(525, 600);
        frame.setUndecorated(false);//true去掉窗口框！
        frame.setTitle("硅谷俄罗斯方块");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        gamePanel.action();
    }
}
