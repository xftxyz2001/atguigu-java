package com.atguigu07.object;
//Object类的clone()的使用
public class CloneTest {
	public static void main(String[] args) {
		Animal a1 = new Animal("小花");
		try {
			Animal a2 = (Animal) a1.clone();
			a2.setName("毛毛");

			System.out.println("原始对象：" + a1);
			System.out.println("a1[name = " + a1.getName() + "]");
			System.out.println("clone之后的对象：" + a2);
			System.out.println("a2[name = " + a2.getName() + "]");
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}

class Animal implements Cloneable{
	private String name;

	public Animal() {
		super();
	}

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}