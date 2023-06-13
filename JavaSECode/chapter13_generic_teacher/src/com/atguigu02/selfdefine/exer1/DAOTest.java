package com.atguigu02.selfdefine.exer1;

import java.util.List;

/**
 * ClassName: DAOTest
 * Description:
 *      定义一个测试类：
 *      创建 DAO 类的对象， 分别调用其 save、get、update、list、delete 方法来操作 User 对象，
 *      使用 Junit 单元测试类进行测试。
 * @Author 尚硅谷-宋红康
 * @Create 10:29
 * @Version 1.0
 */
public class DAOTest {
    public static void main(String[] args) {

        DAO<User> dao = new DAO<>();

        dao.save("1001",new User(1,33,"周杰伦"));
        dao.save("1002",new User(2,23,"昆凌"));

        dao.update("1002",new User(3,26,"蔡依林"));

        dao.delete("1002");

        List<User> list = dao.list();
        for(User u : list){
            System.out.println(u);
        }

    }
}
