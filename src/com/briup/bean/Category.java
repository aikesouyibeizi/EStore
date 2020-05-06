package com.briup.bean;

import java.util.List;

public class Category {
	private int id;
	private String name;
	private String info;
	//一个类别中包含多本书籍
	private List<Book> books;
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Category(String name, String info) {
		super();
		this.name = name;
		this.info = info;
	}
	public Category(int id, String name, String info, List<Book> books) {
		super();
		this.id = id;
		this.name = name;
		this.info = info;
		this.books = books;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", info=" + info + ", books=" + books + "]";
	}
	
}
