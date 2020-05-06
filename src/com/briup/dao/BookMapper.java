package com.briup.dao;

import java.util.List;

import com.briup.bean.Book;
/**
 * 书籍操作，映射接口
 * @author 小柳子
 *
 */

public interface BookMapper {
	public List<Book> findAllBooks();
	
	public Book findBookByIdWithCategory(int id);
	
}
