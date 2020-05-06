package com.briup.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.briup.bean.ShopCar;

/**
 * 
 */
@WebServlet("/removeOrderLineServlet")
public class RemoveOrderLineServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RemoveOrderLineServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int bookId = Integer.parseInt(request.getParameter("id"));
		HttpSession session = request.getSession(false);
		ShopCar car = (ShopCar)session.getAttribute("car");
		car.remove(bookId);
		System.out.println("removeOrderLineServlet");
		request.getRequestDispatcher("/page/shopCart.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
