package com.atguigu.team.service;

import com.atguigu.team.domain.Architect;
import com.atguigu.team.domain.Designer;
import com.atguigu.team.domain.Employee;
import com.atguigu.team.domain.Equipment;
import com.atguigu.team.domain.NoteBook;
import com.atguigu.team.domain.PC;
import com.atguigu.team.domain.Printer;
import com.atguigu.team.domain.Programmer;

import static com.atguigu.team.service.Data.*;

public class NameListService {

	private Employee[] employees;

	/*
	 * 根据项目提供的Data类构建相应大小的employees数组
	 * 再根据Data类中的数据构建不同的对象，包括Employee、Programmer、Designer和Architect对象，
	 * 以及相关联的Equipment子类的对象. 将对象存于数组中 Data类位于com.atguigu.team.service包中
	 */
	public NameListService() {
		employees = new Employee[EMPLOYEES.length];

		for (int i = 0; i < employees.length; i++) {
			// 获取员工的类型
			int type = Integer.parseInt(EMPLOYEES[i][0]);
			// 获取用户的id,name,age,salary
			int id = Integer.parseInt(EMPLOYEES[i][1]);
			String name = EMPLOYEES[i][2];
			int age = Integer.parseInt(EMPLOYEES[i][3]);
			double salary = Double.parseDouble(EMPLOYEES[i][4]);
			
			//根据type，创建相应类型的对象，并初始化到employees数组中
			Equipment equipment;
			double bonus;
			int stock;
			switch (type) {
			case EMPLOYEE:
				employees[i] = new Employee(id, name, age, salary);
				break;
			case PROGRAMMER:
				equipment = createEquipment(i);
				employees[i] = new Programmer(id, name, age, salary, equipment);
				break;
			case DESIGNER:
				equipment = createEquipment(i);
				bonus = Double.parseDouble(EMPLOYEES[i][5]);
				employees[i] = new Designer(id, name, age, salary, equipment, bonus);
				break;
			case ARCHITECT:
				equipment = createEquipment(i);
				bonus = Double.parseDouble(EMPLOYEES[i][5]);
				stock = Integer.parseInt(EMPLOYEES[i][6]);
				employees[i] = new Architect(id, name, age, salary, equipment, bonus, stock);
				break;
			}

		}
	}

	/**
	 * 根据传入的索引，获取指定Data中设备数组中的对象。
	 * 
	 * @param index
	 */
	private Equipment createEquipment(int index) {
		int type = Integer.parseInt(EQUIPMENTS[index][0]);
		String model = EQUIPMENTS[index][1];
		String info = EQUIPMENTS[index][2];
		
		switch (type) {
		case PC:
			return new PC(model, info);	
		case NOTEBOOK:
			double price = Double.parseDouble(info);
			return new NoteBook(model, price);
		case PRINTER:
			
			return new Printer(model, info);
		}
		return null;
	}
	
	//获取所有的员工构成的数组
	public Employee[] getAllEmployees() {
		return employees;
	}
	/**
	 * 
	 * @param id 指定员工的ID
	 * @return 指定员工对象
	 * @throws TeamException 找不到指定的员工
	 */
	public Employee getEmployee(int id) throws TeamException {
		
		for(int i = 0;i < employees.length;i++){
			if(employees[i].getId() == id){
				return employees[i];
			}
		}
		throw new TeamException("找不到指定的员工");
	}

}
