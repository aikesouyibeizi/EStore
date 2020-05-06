package com.briup.service.impl;

import org.apache.ibatis.session.SqlSession;

import com.briup.bean.OrderLine;
import com.briup.common.MySqlSessionFactory;
import com.briup.dao.OrderLineMapper;
import com.briup.service.OrderLineService;

public class OrderLineServiceImpl implements OrderLineService{
	private SqlSession session;
	private OrderLineMapper mapper;
	
	public OrderLineServiceImpl() {
		session = MySqlSessionFactory.openSession();
		mapper = session.getMapper(OrderLineMapper.class);
	}

	@Override
	public void insertOrderLine(OrderLine orderLine) {
		mapper.insertOrderLine(orderLine);
		session.commit();
	}

	@Override
	public int find() {
		int find = mapper.find();
		
		return find;
	}
	
}
