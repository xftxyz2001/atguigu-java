package com.atguigu07.encapsulation.exer2;

/**
 * ClassName: BookTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 15:40
 * @Version 1.0
 */
public class BookTest {
    public static void main(String[] args) {

        Book book1 = new Book();

        book1.setBookName("剑指Java");
        book1.setAuthor("尚硅谷教育");
        book1.setPrice(180.0);

        System.out.println(book1.showInfo());


    }
}
