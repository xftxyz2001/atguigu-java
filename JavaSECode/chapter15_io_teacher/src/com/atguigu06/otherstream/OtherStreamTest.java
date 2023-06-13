package com.atguigu06.otherstream;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.*;

/**
 * ClassName: OtherStreamTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 15:26
 * @Version 1.0
 */
public class OtherStreamTest {
    /*
    * 从键盘输入字符串，要求将读取到的整行字符串转成大写输出。
    * 然后继续进行输入操作，直至当输入“e”或者“exit”时，退出程序。
    * */
    @Test
    public void test1(){
        System.out.println("请输入信息(退出输入e或exit):");
        // 把"标准"输入流(键盘输入)这个字节流包装成字符流,再包装成缓冲流
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        try {
            while ((s = br.readLine()) != null) { // 读取用户输入的一行数据 --> 阻塞程序
                if ("e".equalsIgnoreCase(s) || "exit".equalsIgnoreCase(s)) {
                    System.out.println("安全退出!!");
                    break;
                }
                // 将读取到的整行字符串转成大写输出
                System.out.println("-->:" + s.toUpperCase());
                System.out.println("继续输入信息");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close(); // 关闭过滤流时,会自动关闭它包装的底层节点流
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test2() throws FileNotFoundException {
        PrintStream ps = new PrintStream("io.txt");
        ps.println("hello");
        ps.println(1);
        ps.println(1.5);

        System.setOut(ps);
        System.out.println("你好,atguigu");


        ps.close();

    }

    @Test
    public void test3(){
        PrintStream ps = null;
        try {
            FileOutputStream fos = new FileOutputStream(new File("D:\\IO\\text.txt"));
            // 创建打印输出流,设置为自动刷新模式(写入换行符或字节 '\n' 时都会刷新输出缓冲区)
            ps = new PrintStream(fos, true);
            if (ps != null) {// 把标准输出流(控制台输出)改成文件
                System.setOut(ps);
            }
            for (int i = 0; i <= 255; i++) { // 输出ASCII字符
                System.out.print((char) i);
                if (i % 50 == 0) { // 每50个数据一行
                    System.out.println(); // 换行
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                ps.close();
            }
        }
    }

    //测试自定义的日志类
    @Test
    public void test4(){
        //测试工具类是否好用
        Logger.log("调用了System类的gc()方法，建议启动垃圾回收");

        Logger.log("调用了TeamView的addMember()方法");

        Logger.log("用户尝试进行登录，验证失败");
    }

    @Test
    public void test5() throws IOException {
        //赋值一个图片
        File srcFile = new File("playgirl.jpg");
        File destFile = new File("playgirl_copy2.jpg");

        FileUtils.copyFile(srcFile,destFile);

        System.out.println("复制成功");
    }
}
