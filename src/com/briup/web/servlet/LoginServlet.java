package com.briup.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.briup.bean.Customer;
import com.briup.common.MyException;
import com.briup.service.impl.CustomerServiceImpl;

/**
 * 
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");

		HttpSession session = request.getSession();
		
		CustomerServiceImpl customerService = new CustomerServiceImpl();
		Customer customer = customerService.findCustByNameAndPs(name, password);
		session.setAttribute("customer", customer);
		try {

			customerService.login(name, password);
			request.getRequestDispatcher("toIndexServlet").forward(request, response);

		} catch (MyException e) {
			e.printStackTrace();
			request.getRequestDispatcher("page/login.jsp").forward(request, response);
		}


	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
