package com.atguigu12.wrapper.interview;

public class InterviewTest3 {
	public static void main(String[] args) {
		Object o1 = true ? new Integer(1) : new Double(2.0);
		System.out.println(o1);//1.0

		
		Object o2;
		if (true)
		    o2 = new Integer(1);
		else
		    o2 = new Double(2.0);
		System.out.println(o2);//1
	}
}
