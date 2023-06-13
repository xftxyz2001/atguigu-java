package banking8.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//实现单例模式
public class Bank {
	private List<Customer> customers;//用于存放客户
	
	
	private Bank(){
		customers = new ArrayList<Customer>();
	}
	private static Bank bank = new Bank();
	
	public static Bank getBanking(){
		return bank;
	}
	//添加一个Customer到集合中
	public void addCustomer(String f,String l){
		Customer cust = new Customer(f, l);
		customers.add(cust);
	}
	//获取Customer的个数
	public int getNumOfCustomers(){
		return customers.size();
	}
	//返回指定索引位置的Customer
	public Customer getCustomer(int index){
		return customers.get(index);
	}
	public Iterator<Customer> getCustomers(){
		return customers.iterator();
	}
}
