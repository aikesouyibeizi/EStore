package com.briup.bean;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ShopCar {
	private Map<Integer,OrderLine> map = new HashMap<Integer,OrderLine>();
	
	//往购物车中添加一本书，形成一个 订单项
	public void addCar(Book book,int num){ 
		int id = book.getId();
		OrderLine orderLine = map.get(id);
		if(orderLine == null){
			orderLine = new OrderLine();
			orderLine.setNum(num);
			orderLine.setBook(book);
			map.put(id, orderLine);
		}else{
			orderLine.setNum(orderLine.getNum()+num);
		}
	}
	//获取购物车中的所有订单项
	public Collection<OrderLine> getLines(){
		return map.values();
		
	}
	//返回购物车内所有订单项的总价格
	public double getTotal(){
		double total = 0;
		Set<Integer> bookIds = map.keySet();
		for (Integer bookId : bookIds) {
			OrderLine orderLine = map.get(bookId);
			Book book = orderLine.getBook();
			double price = book.getPrice();
			int num = orderLine.getNum();
			total = total + (price * num);
		}
		return total;
		
	}
	//返回购物车内订单项的总个数
	public int getCount(){
		int count = 0;
		Set<Integer> bookIds = map.keySet();
		for (Integer bookId : bookIds) {
			OrderLine orderLine = map.get(bookId);
			int num = orderLine.getNum();
			count = count + num;
		}
		return count;
	}
	//清空购物车
	public void clearCar(){
		map.clear();
	}
	//删除订单项
	public void remove(int bookId){
		map.remove(bookId);
	}
}
