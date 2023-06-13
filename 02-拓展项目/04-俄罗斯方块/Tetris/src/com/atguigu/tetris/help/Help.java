package com.atguigu.tetris.help;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class Help extends JDialog {
    //点击帮助按钮显示对话框
    public void showHelp(JFrame frame, JMenu menuFile) {
        menuFile.addMenuListener(new MenuListener() {
            @Override
            public void menuSelected(MenuEvent e) {
                showDialog(frame);

            }
            @Override
            public void menuDeselected(MenuEvent e) {
            }

            @Override
            public void menuCanceled(MenuEvent e) {

            }
        });
    }
    public static void showDialog(JFrame frame) {
        JLabel label = new JLabel();
        label.setText("<HTML>键盘方向←:向左移动;" +
                "<br>键盘方向→:向右移动;" +
                "<br>键盘方向↑:方块旋转;" +
                "<br>键盘方向↓:加速下落" +
                "<br>P:暂停" +
                "<br>Q:退出</HTML>");
        JDialog jDialog = new JDialog(frame);
        jDialog.setSize(200,200);
        jDialog.add(label);
        jDialog.setVisible(true);
        //jDialog相对放在jframe的中间
        jDialog.setLocationRelativeTo(frame);
    }

}
