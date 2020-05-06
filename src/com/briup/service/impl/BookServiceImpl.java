package com.briup.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.briup.bean.Book;
import com.briup.common.MySqlSessionFactory;
import com.briup.dao.BookMapper;
import com.briup.service.BookService;

public class BookServiceImpl implements BookService{
	private SqlSession session;
	private BookMapper mapper;
	
	 public BookServiceImpl() {
			session = MySqlSessionFactory.openSession();
			mapper = session.getMapper(BookMapper.class);
	}

	@Override
	public List<Book> findAllBooks() {
		//借助dao层对象，实现业务逻辑功能
	
		List<Book> books = mapper.findAllBooks();
		
		return books;
	}
	//用户访问主页，先从数据库提取所有书籍信息，然后添加到主页上进行显示
	//index.jsp-->servlet获取书籍-->跳转到index.jsp主页

	@Override
	public Book findBookByIdWithCategory(int id) {
		Book book = mapper.findBookByIdWithCategory(id);
		return book;
	}

	
}
