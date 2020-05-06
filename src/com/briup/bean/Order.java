package com.briup.bean;

import java.util.Date;
import java.util.List;

public class Order {
	private int id;
	private double total;
	private Date orderDate;
	private String name;
	private String address;
	private String telephone;
	private Customer customer;
	private List<OrderLine> orderLines;
	public Order() {
		super();
	}
	public Order(int id, double total, Date orderDate, String name, String address, String telephone, Customer customer,
			List<OrderLine> orderLines) {
		super();
		this.id = id;
		this.total = total;
		this.orderDate = orderDate;
		this.name = name;
		this.address = address;
		this.telephone = telephone;
		this.customer = customer;
		this.orderLines = orderLines;
	}
	
	public Order(double total, Date orderDate, String name, String address, String telephone) {
		super();
		this.total = total;
		this.orderDate = orderDate;
		this.name = name;
		this.address = address;
		this.telephone = telephone;
	}
	
	public Order(double total, Date orderDate, String name, String address, String telephone, Customer customer) {
		super();
		this.total = total;
		this.orderDate = orderDate;
		this.name = name;
		this.address = address;
		this.telephone = telephone;
		this.customer = customer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<OrderLine> getOrderLines() {
		return orderLines;
	}
	public void setOrderLines(List<OrderLine> orderLines) {
		this.orderLines = orderLines;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", total=" + total + ", orderDate=" + orderDate + ", name=" + name + ", address="
				+ address + ", telephone=" + telephone + ", customer=" + customer + "]";
	}
	
	
}
