package com.briup.test;

import com.briup.bean.Book;
import com.briup.bean.Category;
import com.briup.bean.Customer;
import com.briup.service.impl.BookServiceImpl;
import com.briup.service.impl.CategoryServiceImpl;
import com.briup.service.impl.CustomerServiceImpl;
import com.briup.service.impl.OrderLineServiceImpl;
import com.briup.service.impl.OrderServiceImpl;

public class Test {
	public static void main(String[] args) {
		BookServiceImpl impl = new BookServiceImpl();
		Book book = impl.findBookByIdWithCategory(1);
		System.out.println(book);
		
		CategoryServiceImpl impl2 = new CategoryServiceImpl();
		Category category = impl2.findCategoryByIdWithBooks(1);
		System.out.println(category);
		
		CustomerServiceImpl impl3 = new CustomerServiceImpl();
		Customer customer;
		customer = impl3.findCustByNameAndPs("小王子", "123");
		System.out.println(customer);
		OrderLineServiceImpl line = 
				new OrderLineServiceImpl();
		OrderServiceImpl impl1 = new OrderServiceImpl();
		int findId = impl1.findId();
		System.out.println(findId);
		int i = line.find();
		int find = impl1.find();
		System.out.println(find);
		System.out.println(i);
		
	}
}
