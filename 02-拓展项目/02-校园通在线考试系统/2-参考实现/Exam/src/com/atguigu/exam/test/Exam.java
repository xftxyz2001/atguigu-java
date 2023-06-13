package com.atguigu.exam.test;

import com.atguigu.exam.domain.Item;
import com.atguigu.exam.service.ItemService;
import com.atguigu.exam.view.ExamView;

/**
 * 测试入口
 */
public class Exam {
    public static void main(String[] args) {
    	//测试一：
//    	ItemService itemService = new ItemService();
//    	List<String> list = itemService.readTextFile("Items.txt");
//    	for(String s : list){
//    		System.out.println(s);
//    	}
    	
    	//测试二：
//    	ItemService itemService = new ItemService();
//    	Item item = itemService.getItem(1);
//    	System.out.println(item);
    	
        ExamView examView = new ExamView();

        examView.enterMainMenu();
    	
    }
}
