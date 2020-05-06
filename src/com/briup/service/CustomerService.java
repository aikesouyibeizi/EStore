package com.briup.service;

import com.briup.bean.Customer;
import com.briup.common.MyException;

public interface CustomerService {
	//登录
	public void register(Customer customer) throws MyException;
	
	
	//注册
	public Customer findCustByNameAndPs(String name,String password);
	
	public void login(String name,String password) throws MyException;
}
