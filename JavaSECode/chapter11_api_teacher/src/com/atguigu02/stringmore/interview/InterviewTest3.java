package com.atguigu02.stringmore.interview;

/**
 * @author 尚硅谷-宋红康
 * @create 19:30
 */
public class InterviewTest3 {
    private static void change(String s,StringBuffer sb){
        s = "aaaa";
        sb.setLength(0);
        sb.append("aaaa");
    }


    public static void main(String[] args) {
        String s = "bbbb";
        StringBuffer sb = new StringBuffer("bbbb");
        change(s,sb);
        System.out.println(s+sb);//bbbbaaaa
    }
}
