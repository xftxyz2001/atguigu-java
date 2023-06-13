package com.atguigu01.file.exer2;

import org.junit.Test;

import java.io.File;
import java.io.FilenameFilter;

/**
 * ClassName: Exer02
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 16:01
 * @Version 1.0
 */
public class Exer02 {
    /*
    * 判断指定目录下是否有后缀名为.jpg的文件，如果有，就输出该文件名称
    * */
    @Test
    public void test1(){
        File dir = new File("F:\\10-图片");

        //方式1：
//        String[] listFiles = dir.list();
//        for(String s : listFiles){
//            if(s.endsWith(".jpg")){
//                System.out.println(s);
//            }
//        }

        //方式2：
        //public String[] list(FilenameFilter filter)
        String[] listFiles = dir.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {//name:即为子文件或子文件目录的名称
//                if(name.endsWith(".jpg")){
//                    return true;
//                }else{
//                    return false;
//                }

                return name.endsWith(".jpg");
            }
        });

        for(String s : listFiles){
            System.out.println(s);
        }
    }
}
