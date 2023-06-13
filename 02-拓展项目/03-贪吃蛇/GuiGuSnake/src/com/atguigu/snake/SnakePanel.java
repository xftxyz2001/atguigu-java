package com.atguigu.snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * 实现游戏的动态页面
 * SnakePanel面板容器类，KeyListener用于接收键盘事件（击键）的侦听器接口，ActionListener用于接收操作事件的侦听器接口
 */
public class SnakePanel extends JPanel implements KeyListener, ActionListener {
    /**
     * 用数组元素的移动来表示贪吃蛇的移动，这里也可以使用链表来实现，
     * 因为每个位置需要横坐标和纵坐标来表示，定义两个数组，但是也限制了贪吃蛇的最大长度
     */
    public static int[]snakeX = new int[100];
    public static int[]snakeY = new int[100];
    //贪吃蛇的长度
    public static int length;
    //食物的纵横坐标
    int foodX;
    int foodY;
    //贪吃蛇头的方向
    Dir directory;
    int score;//积分
    //Timer定时器，表示蛇的移动速度
    Timer timer = new Timer(200,this);
    /**
     * 游戏是否开始
     */
    boolean isStart;
    /**
     * 表示游戏是否失败
     */
    boolean isFail;
     //构造函数
    public SnakePanel() {
        init();
        this.setFocusable(true);
        this.addKeyListener(this);
        timer.start();
    }
    //初始化小蛇的位置
    private void init(){
        //初始化蛇身长度为3，每个蛇身之间的距离是25
        length = 3;
        //蛇头的位置是[100,100]
        snakeX[0] = 100;
        snakeY[0] = 100;
        //第一个蛇身的位置是[75,100]
        snakeX[1] = 75;
        snakeY[1] = 100;
        //第二个蛇身的位置是【50，100】
        snakeX[2] = 50;
        snakeY[2] = 100;
        //初始化蛇头方向向右
        directory = Dir.R;
        //获取食物的位置
        Food.getFood(snakeX,snakeY);
        foodX = Food.X;
        foodY = Food.Y;
        //初始化不开始游戏
        isStart = false;
        //初始化游戏没有失败
        isFail = false;
        //分数初始化为0
        score = 0;
    }

    protected void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        //设置背景板为白色
        this.setBackground(Color.white);
        //绘制游戏区域
        graphics.setColor(Color.GRAY);
        //x:表示距离Jframe边框的横向距离，y表示距离Jframe边框的纵向距离开始绘制宽为450，高为430的内部框，也就是说游戏面板大小为450*430
        graphics.fillRect(25,25,450,430);
        //画贪吃蛇的头部
        if (directory==Dir.R){
            Data.right.paintIcon(this,graphics, snakeX[0], snakeY[0]);
        }else if (directory==Dir.L){
            Data.left.paintIcon(this,graphics, snakeX[0], snakeY[0]);
        }
        if (directory==Dir.U){
            Data.up.paintIcon(this,graphics, snakeX[0], snakeY[0]);
        }else if (directory==Dir.D){
            Data.down.paintIcon(this,graphics, snakeX[0], snakeY[0]);
        }
        //画身体
        for (int i = 1; i< length; i++){
            Data.body.paintIcon(this,graphics, snakeX[i], snakeY[i]);
        }
        //画食物
        Data.food.paintIcon(this,graphics,foodX,foodY);
        //绘制积分栏
        graphics.setColor(Color.BLACK);
        graphics.setFont(new Font("幼圆",Font.BOLD,20));
        graphics.drawString("长度："+ length,50,20);
        graphics.drawString("得分："+score,150,20);
        //游戏开始提醒
        if (isStart == false){
            graphics.setColor(Color.black);
            graphics.setFont(new Font("幼圆",Font.BOLD,20));
            graphics.drawString("按空格键开始游戏",180,180);
        }
        //失败判断
        if (isFail){
            graphics.setColor(Color.RED);
            graphics.setFont(new Font("幼圆",Font.BOLD,20));
            graphics.drawString("游戏失败，按空格键重新开始",180,180);
        }

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //判断游戏状态
        if(isStart&&!isFail) {
            //吃食物
            if (snakeX[0] == foodX && snakeY[0] == foodY) {
                length++;
                score += 10;
                Food.getFood(snakeX,snakeY);
                foodX = Food.X;
                foodY = Food.Y;
            }
            for (int i = length - 1; i > 0; i--) {
                snakeX[i] = snakeX[i - 1];
                snakeY[i] = snakeY[i - 1];
            }
            //移动头部
            if (directory == Dir.R) {
                snakeX[0] += 25;
                //判断边界
                if (snakeX[0] > 450) {
                    isFail = true;
                }
            } else if (directory == Dir.L) {
                snakeX[0] -= 25;
                //判断边界
                if (snakeX[0] < 25) {
                    isFail = true;
                }
            } else if (directory == Dir.U) {
                snakeY[0] -= 25;
                //判断边界
                if (snakeY[0] < 25) {
                    isFail = true;
                }
            } else if (directory == Dir.D) {
                snakeY[0] += 25;
                //判断边界
                if (snakeY[0] > 430) {
                    isFail = true;
                }
            }
            //死亡判定
            for (int i = 1; i < length; i++) {
                if (snakeX[0] == snakeX[i] && snakeY[0] == snakeY[i]) {
                    isFail = true;
                }
            }
            repaint();
        }
        timer.start();
    }

    @Override
    public void keyTyped(KeyEvent e) {}
    @Override
    public void keyPressed(KeyEvent e) {
        //获取按下的按键
        int keyCode = e.getKeyCode();
        switch (keyCode){
            case KeyEvent.VK_SPACE:
                //按键为空格，如果游戏失败，重新开始游戏，否则暂停游戏
                if (isFail){
                    isFail = false;
                    init();
                }else {
                    isStart = !isStart;
                }
                repaint();
                break;
            case KeyEvent.VK_LEFT:
                //当按键为左的时候，只要前进方向不是右，即可转向
                if (directory!=Dir.R){
                    directory = Dir.L;
                }
                break;
            case KeyEvent.VK_RIGHT:
               // 当按键为"右"的时候，只要前进方向不是"左",就可以转向
                if (directory!=Dir.L){
                    directory = Dir.R;
                }
                break;
            case KeyEvent.VK_UP:
                // 当按键为"上"，只要前进方向不是"下"，就可以转向
                if (directory!=Dir.D){
                    directory = Dir.U;
                }
                break;
            case KeyEvent.VK_DOWN:
                //当按键为"下"的时候，只要前进方向不是"上",就可以转向
                if (directory!=Dir.U){
                    directory = Dir.D;
                }
                break;
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {}
}
