package com.briup.dao;


import com.briup.bean.Customer;
/**
 * 书籍操作，映射接口
 * @author 小柳子
 *
 */

public interface CustomerMapper {
	
	public Customer findCustByName(String name);
	
	public void insertCustomer(Customer customer);
	
	public Customer findCustByNameAndPs(String name,String password);
	
}
