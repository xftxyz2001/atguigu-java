package com.atguigu01.string.exer1;

//考查：方法参数的值传递机制、String的不可变性
public class StringTest {

	String str = "good";
	char[] ch = { 't', 'e', 's', 't' };

	public void change(String str, char ch[]) {
		str = "test ok";
		ch[0] = 'b';
	}

	public static void main(String[] args) {
		StringTest ex = new StringTest();
		ex.change(ex.str, ex.ch);
		System.out.println(ex.str); //good
		System.out.println(ex.ch); //best
	}
}
