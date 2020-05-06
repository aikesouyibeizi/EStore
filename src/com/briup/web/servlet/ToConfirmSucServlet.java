package com.briup.web.servlet;

import java.io.IOException;
import java.util.Collection;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.briup.bean.Book;
import com.briup.bean.Customer;
import com.briup.bean.Order;
import com.briup.bean.OrderLine;
import com.briup.bean.ShopCar;
import com.briup.service.impl.OrderLineServiceImpl;
import com.briup.service.impl.OrderServiceImpl;

/**
 *
 */
@WebServlet("/toConfirmSucServlet")
public class ToConfirmSucServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		ShopCar car = (ShopCar)session.getAttribute("car");
		Customer customer = (Customer)session.getAttribute("customer");
		if(car != null && customer != null){
			double total = car.getTotal();
			String name = customer.getName();
			String address = customer.getAddress();
			String telephone = customer.getTelephone();
			
			Order order = new Order(total,new Date(),name,address,telephone,customer);
			OrderServiceImpl orderService = new OrderServiceImpl();
			orderService.insertOrder(order);
			
			Collection<OrderLine> lines = car.getLines();
			OrderLineServiceImpl orderLineService = new OrderLineServiceImpl();
			for (OrderLine line : lines) {
				Book book = line.getBook();
				int num = line.getNum();
				OrderLine orderLine = new OrderLine(num,book,order);
				orderLineService.insertOrderLine(orderLine);
			}
		}
		
		car.clearCar();
		
		request.getRequestDispatcher("/page/confirmSuc.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
