package com.briup.web.servlet.users;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.briup.bean.Order;
import com.briup.service.impl.OrderServiceImpl;

/**
 * 
 */
@WebServlet("/users/toMyOrdersServlet")
public class ToMyOrdersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		OrderServiceImpl orderService = new OrderServiceImpl();
		List<Order> orders = orderService.findAllOrders();
		HttpSession session = request.getSession(false);
		session.setAttribute("orders", orders);
		request.getRequestDispatcher("/page/myOrders.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
