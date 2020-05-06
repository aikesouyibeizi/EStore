package com.briup.dao;

import java.util.List;

import com.briup.bean.Category;

public interface CategoryMapper {
	public List<Category> findAllCategory();
	
	public Category findCategoryByIdWithBooks(int id);
}
