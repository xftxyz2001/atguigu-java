package com.atguigu04.inputstreamreader.exer;

import org.junit.Test;

import java.io.*;

/**
 * @author 尚硅谷-宋红康
 * @create 9:06
 */
public class InputStreamReaderDemo {

    @Test
    public void test() {
        InputStreamReader isr = null;
        OutputStreamWriter osw = null;
        try {
            isr = new InputStreamReader(new FileInputStream("康师傅的话.txt"),"gbk");

            osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\shkstart\\Desktop\\寄语.txt"),"utf-8");

            char[] cbuf = new char[1024];
            int len;
            while ((len = isr.read(cbuf)) != -1) {
                osw.write(cbuf, 0, len);
                osw.flush();
            }
            System.out.println("文件复制完成");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (isr != null)
                    isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (osw != null)
                    osw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
