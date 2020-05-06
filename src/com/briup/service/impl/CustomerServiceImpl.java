package com.briup.service.impl;


import org.apache.ibatis.session.SqlSession;

import com.briup.bean.Customer;
import com.briup.common.MyException;
import com.briup.common.MySqlSessionFactory;
import com.briup.dao.CustomerMapper;
import com.briup.service.CustomerService;

public class CustomerServiceImpl implements CustomerService{
	private SqlSession session;
	private CustomerMapper mapper;
	public CustomerServiceImpl() {
		 session = MySqlSessionFactory.openSession();
		mapper = session.getMapper(CustomerMapper.class);
	}

	@Override
	public void register(Customer customer) throws MyException {
		Customer customer2 = mapper.findCustByName(customer.getName());
		if(customer2 != null){
			throw new MyException("用户已注册！");
		}else{
			mapper.insertCustomer(customer);
		}
		session.commit();
	}


	@Override
	public Customer findCustByNameAndPs(String name, String password){
		Customer customer = mapper.findCustByNameAndPs(name, password);
		return customer;
	}

	@Override
	public void login(String name, String password) throws MyException{
		Customer customer = mapper.findCustByNameAndPs(name, password);
		if(customer == null){
			throw new MyException("登录失败");
		}
	}
	
}
