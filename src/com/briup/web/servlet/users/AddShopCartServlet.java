package com.briup.web.servlet.users;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.briup.bean.Book;
import com.briup.bean.ShopCar;
import com.briup.service.impl.BookServiceImpl;

/**
 * 
 */
@WebServlet("/users/addShopCartServlet")
public class AddShopCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		int num = Integer.parseInt(request.getParameter("num"));
		
		HttpSession session = request.getSession(false);
		
		BookServiceImpl bookService = new BookServiceImpl();
		Book book = bookService.findBookByIdWithCategory(id);
		
		System.out.println("shopCarServlet"+book);
		
		ShopCar car =(ShopCar) session.getAttribute("car");
		if(car == null){
			car = new ShopCar();
			car.addCar(book, num);
			session.setAttribute("car", car);
		}else{
			car.addCar(book, num);
			session.setAttribute("car", car);
		}
		
		request.getRequestDispatcher("/page/shopCart.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
