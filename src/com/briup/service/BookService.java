package com.briup.service;

import java.util.List;

import com.briup.bean.Book;

/*
 * 书籍操作service层接口
 */
public interface BookService {
	public List<Book> findAllBooks();
	
	public Book findBookByIdWithCategory(int id);
}
