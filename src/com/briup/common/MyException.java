package com.briup.common;

public class MyException extends Exception{
	
	private static final long serialVersionUID = 1L;
	public MyException(String msg){
		super(msg);
	}
	public MyException(){
		this("");
	}
}
