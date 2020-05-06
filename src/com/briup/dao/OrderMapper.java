package com.briup.dao;

import java.util.List;

import com.briup.bean.Order;

/**
 * 
 *
 */

public interface OrderMapper {
	public void insertOrder(Order order);
	public int find();
	public List<Order> findAllOrders();
	public  int findId();
	
}
