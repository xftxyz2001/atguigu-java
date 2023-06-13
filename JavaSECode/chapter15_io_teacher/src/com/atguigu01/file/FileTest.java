package com.atguigu01.file;

import org.junit.Test;

import java.io.File;

/**
 * ClassName: FileTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 14:22
 * @Version 1.0
 */
public class FileTest {
    /*
     * `public File(String pathname) ` ：以pathname为路径创建File对象，可以是绝对路径或者相对路径，如果pathname是相对路径，则默认的当前路径在系统属性user.dir中存储。
     * `public File(String parent, String child) ` ：以parent为父路径，child为子路径创建File对象。
     * `public File(File parent, String child)` ：根据一个父File对象和子文件路径创建File对象
     *
     * 文件的路径表示方式：
     * 方式1：绝对路径：以windows操作系统为例，包括盘符在内的文件或文件目录的完整路径。
     * 方式2：相对路径：相对于某一个文件目录来讲的相对的位置。
     *          在IDEA中，如果使用单元测试方法：相对于当前的module来讲
     *                   如果使用main()方法：相对于当前的project来讲
    * */
    @Test
    public void test1(){
        //public File(String pathname)
        File file1 = new File("d:/io\\hello.txt");

        File file2 = new File("ab");
        System.out.println(file2.getAbsolutePath());
    }

//    public static void main(String[] args) {
//        File file2 = new File("abc");
//        System.out.println(file2.getAbsolutePath());
//    }

    @Test
    public void test2(){
        //public File(String parent, String child)
        //参数1：一定是一个文件目录
        //参数2：可以是一个文件，也可以是一个文件目录
        File file1 = new File("d:\\io","abc.txt");
        File file2 = new File("abc","a12");

        //public File(File parent, String child)
        //参数1：一定是一个文件目录
        //参数2：可以是一个文件，也可以是一个文件目录
        File file3 = new File(file2,"ab.txt");
    }
}
