package com.briup.service;

import java.util.List;

import com.briup.bean.Category;

public interface CategoryService {
	public List<Category> findAllCategory();
	
	public Category findCategoryByIdWithBooks(int id);
}
