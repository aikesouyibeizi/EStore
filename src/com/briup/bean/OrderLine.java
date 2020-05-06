package com.briup.bean;

public class OrderLine {
	private int id;
	private int num;
	private Book book;
	private Order order;
	public OrderLine() {
		super();
	}
	public OrderLine(int id, int num, Book book, Order order) {
		super();
		this.id = id;
		this.num = num;
		this.book = book;
		this.order = order;
	}
	
	public OrderLine(int num, Book book, Order order) {
		super();
		this.num = num;
		this.book = book;
		this.order = order;
	}
	public OrderLine(int num, Book book) {
		super();
		this.num = num;
		this.book = book;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	@Override
	public String toString() {
		return "OrderLine [id=" + id + ", num=" + num + ", book=" + book + ", order=" + order + "]";
	}
	
}
