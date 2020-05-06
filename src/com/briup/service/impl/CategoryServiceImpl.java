package com.briup.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.briup.bean.Category;
import com.briup.common.MySqlSessionFactory;
import com.briup.dao.CategoryMapper;
import com.briup.service.CategoryService;

public class CategoryServiceImpl implements CategoryService{
	private SqlSession session;
	private CategoryMapper mapper;
	
	public CategoryServiceImpl() {
		session = MySqlSessionFactory.openSession();
		mapper = session.getMapper(CategoryMapper.class);
	}
	
	@Override
	public List<Category> findAllCategory() {
		List<Category> categorys = mapper.findAllCategory();
		System.out.println(categorys);
		return categorys;
	}

	@Override
	public Category findCategoryByIdWithBooks(int id) {
		Category category = mapper.findCategoryByIdWithBooks(id);
		
		return category;
	}
}
