package com.atguigu.exam.service;


import com.atguigu.exam.domain.Item;
import java.io.*;
import java.util.*;

public class ItemService {
	private Item[] items;//题目数组
	
    private final String ITEM_FILENAME = "./Items.txt";//读取的文件位置
    private final String ANSWER_FILENAME = "./answer.dat";//文件输出的位置
    private final int LINES_PER_ITEM = 6;//每题占用的行数
    public final int TOTAL_ITEMS;//题目数


    public ItemService() {
        List<String> list = readTextFile(ITEM_FILENAME);
        //计算得到题目数量
        TOTAL_ITEMS = list.size() / LINES_PER_ITEM;
        
        items = new Item[TOTAL_ITEMS];
        //初始化题目数组
        for (int i = 0; i < TOTAL_ITEMS; i++) {
            String question = list.get(i * LINES_PER_ITEM);
            String[] options = {
                list.get(i * LINES_PER_ITEM + 1),
                list.get(i * LINES_PER_ITEM + 2),
                list.get(i * LINES_PER_ITEM + 3),
                list.get(i * LINES_PER_ITEM + 4)
            };
            char answer = list.get(i * LINES_PER_ITEM + 5).charAt(0);
            items[i] = new Item(question, options, answer);
        }
    }
    /**
     * 读取指定位置文件的内容到内存中
     * @param filename
     * @return
     */
    private List<String> readTextFile(String filename) {
        FileReader fr = null;
        BufferedReader br = null;
        List<String> content = new ArrayList<String>();

        try {
            fr = new FileReader(filename);
            br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                if (!line.trim().equals("")) content.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }

            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        return content;
    }

    /**
     * 返回指定题号的题目
     * @param no
     * @return
     */
    public Item getItem(int no) {
        if (no <= 0 || no > TOTAL_ITEMS) {
            return null;
        }

        return items[no - 1];
    }

    /**
     * 将所有的答案构成的数组持久化到文件中
     * @param answer
     */
    public void saveAnswer(char[] answer) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(ANSWER_FILENAME);
            oos = new ObjectOutputStream(fos);

            oos.writeObject(answer);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
    public char[] readAnswer() {
        char[] answer = null;

        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream(ANSWER_FILENAME);
            ois = new ObjectInputStream(fis);

            answer = (char[])ois.readObject();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        return answer;
    }

    
}
