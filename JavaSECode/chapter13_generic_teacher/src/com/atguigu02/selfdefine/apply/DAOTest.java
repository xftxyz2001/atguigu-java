package com.atguigu02.selfdefine.apply;

import org.junit.Test;

import java.util.List;

/**
 * ClassName: DAOTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 10:12
 * @Version 1.0
 */
public class DAOTest {
    @Test
    public void test1(){
        CustomerDAO dao1 = new CustomerDAO();

        dao1.insert(new Customer());

        Customer customer = dao1.queryForInstance(1);

    }

    @Test
    public void test2(){
        OrderDAO dao1 = new OrderDAO();
        dao1.insert(new Order());

        List<Order> list = dao1.queryForList(1);
    }
}
