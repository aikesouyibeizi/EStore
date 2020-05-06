package com.briup.dao;

import com.briup.bean.OrderLine;

/**
 *
 */

public interface OrderLineMapper {
	public void insertOrderLine(OrderLine orderLine);
	public int find();
	
}
