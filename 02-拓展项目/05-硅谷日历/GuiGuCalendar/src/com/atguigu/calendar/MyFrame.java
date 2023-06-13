package com.atguigu.calendar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author shk
 * @create 23:26
 */
public class MyFrame extends JFrame {//窗口类（默认隐藏的）
    public MyFrame(){

        //添加标题
        this.setTitle("硅谷日历");
        //设置大小
        this.setSize(300,400);
        //设置点击关闭按钮，退出程序
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置显式的位置
        this.setLocationRelativeTo(null);


        //创建顶部面板
        TopPanel topPanel = new TopPanel();
        this.add(topPanel,BorderLayout.NORTH);

        //创建主面板
        MainPanel mainPanel = new MainPanel();
        this.add(mainPanel);

        //禁止调整大小
        this.setResizable(false);

        //设置可见
        this.setVisible(true);

        topPanel.btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(topPanel.textYear.getText());
                System.out.println(topPanel.textMonth.getText());

                MainPanel mainPanel = new MainPanel(Integer.parseInt(topPanel.textYear.getText()),Integer.parseInt(topPanel.textMonth.getText()));
                MyFrame.this.add(mainPanel);

                MyFrame.this.setVisible(true);
            }
        });


    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
