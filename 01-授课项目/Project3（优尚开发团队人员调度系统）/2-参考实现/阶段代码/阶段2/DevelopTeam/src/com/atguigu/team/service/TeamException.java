package com.atguigu.team.service;

public class TeamException extends Exception{

	static final long serialVersionUID = -33875229948L;
	
	public TeamException(){}
	
	public TeamException(String message){
		super(message);
	}
}
