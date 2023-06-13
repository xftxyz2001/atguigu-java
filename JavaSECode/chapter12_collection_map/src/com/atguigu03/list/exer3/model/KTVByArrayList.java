package com.atguigu03.list.exer3.model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 尚硅谷-宋红康
 * @create 20:26
 */
public class KTVByArrayList {
    private static ArrayList musicList = new ArrayList();// 创建歌曲列表
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        addMusicList();// 添加一部分歌曲至歌曲列表
        boolean flag = true;
        while (flag) {
            System.out.println("当前歌曲列表：" + musicList);
            System.out.println("-------------欢迎来到点歌系统------------");
            System.out.println("1.添加歌曲至列表");
            System.out.println("2.将歌曲置顶");
            System.out.println("3.将歌曲前移一位");
            System.out.println("4.退出");
            System.out.print("请输入操作序号：");
            int key = sc.nextInt();// //接收键盘输入的功能选项序号
            // 执行序号对应的功能
            switch (key) {
                case 1:// 添加歌曲至列表
                    addMusic();
                    break;
                case 2:// 将歌曲置顶
                    setTop();
                    break;
                case 3:// 将歌曲前移一位
                    setBefore();
                    break;
                case 4:// 退出
                    System.out.println("----------------退出---------------");
                    System.out.println("您已退出系统");
                    flag = false;
                    break;
                default:
                    System.out.println("----------------------------------");
                    System.out.println("功能选择有误，请输入正确的功能序号!");
                    break;
            }

        }
    }

    // 初始时添加歌曲名称
    private static void addMusicList() {
        musicList.add("本草纲目");
        musicList.add("你是我的眼");
        musicList.add("老男孩");
        musicList.add("白月光与朱砂痣");
        musicList.add("不谓侠");
        musicList.add("爱你");
    }

    // 执行添加歌曲
    private static void addMusic() {
        System.out.print("请输入要添加的歌曲名称：");
        String musicName = sc.next();// 获取键盘输入内容
        musicList.add(musicName);// 添加歌曲到列表的最后
        System.out.println("已添加歌曲：" + musicName);
    }

    // 执行将歌曲置顶
    private static void setTop() {
        System.out.print("请输入要置顶的歌曲名称：");
        String musicName = sc.next();// 获取键盘输入内容
        int musicIndex = musicList.indexOf(musicName);// 查找指定歌曲位置
        if (musicIndex < 0) {// 判断输入歌曲是否存在
            System.out.println("当前列表中没有输入的歌曲！");
        }else if(musicIndex == 0){
            System.out.println("当前歌曲默认已置顶！");
        }else {
            musicList.remove(musicName);// 移除指定的歌曲
            musicList.add(0, musicName);// 将指定的歌曲放到第一位
            System.out.println("已将歌曲《" + musicName + "》置顶");
        }
    }

    // 执行将歌曲置前一位
    private static void setBefore() {
        System.out.print("请输入要置前的歌曲名称：");
        String musicName = sc.next();// 获取键盘输入内容
        int musicIndex = musicList.indexOf(musicName);// 查找指定歌曲位置
        if (musicIndex < 0) {// 判断输入歌曲是否存在
            System.out.println("当前列表中没有输入的歌曲！");
        } else if (musicIndex == 0) {// 判断歌曲是否已在第一位
            System.out.println("当前歌曲已在最顶部！");
        } else {
            musicList.remove(musicName);// 移除指定的歌曲
            musicList.add(musicIndex - 1, musicName);// 将指定的歌曲放到前一位
            System.out.println("已将歌曲《" + musicName + "》置前一位");
        }
    }
}
