package com.briup.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.briup.bean.Order;
import com.briup.common.MySqlSessionFactory;
import com.briup.dao.OrderMapper;
import com.briup.service.OrderService;

public class OrderServiceImpl implements OrderService{
	private SqlSession session;
	private OrderMapper mapper;
	public OrderServiceImpl() {
		session = MySqlSessionFactory.openSession();
		mapper = session.getMapper(OrderMapper.class);
	}
	
	
	@Override
	public void insertOrder(Order order) {
		mapper.insertOrder(order);
		session.commit();
	}
	@Override
	public List<Order> findAllOrders() {
		List<Order> orders = mapper.findAllOrders();
		return orders;
	}


	@Override
	public int find() {
		int find = mapper.find();
		return find;
	}


	@Override
	public int findId() {
		int findId = mapper.findId();
		return findId;
	}
	
}
