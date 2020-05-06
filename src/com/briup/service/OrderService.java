package com.briup.service;

import java.util.List;

import com.briup.bean.Order;

public interface OrderService {
	public void insertOrder(Order order);
	public int find();
	public List<Order> findAllOrders();
	public  int findId();
}
