package com.atguigu06.project.team.junit;

import com.atguigu06.project.team.domain.Employee;
import com.atguigu06.project.team.service.NameListService;
import com.atguigu06.project.team.service.TeamException;
import org.junit.Test;

/**
 * ClassName: NameListServiceTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 15:17
 * @Version 1.0
 */
public class NameListServiceTest {

    @Test
    public void testGetAllEmployees(){
        NameListService nameListService =  new NameListService();

        Employee[] employees = nameListService.getAllEmployees();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    @Test
    public void testGetEmployee(){
        try {
            NameListService nameListService =  new NameListService();
            int id = 3;
            id = 13;
            Employee employee = nameListService.getEmployee(id);
            System.out.println(employee);
        } catch (TeamException e) {
//            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }


}
