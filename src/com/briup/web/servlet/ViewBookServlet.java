package com.briup.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.briup.bean.Book;
import com.briup.service.impl.BookServiceImpl;

/**
 * 
 */
@WebServlet("/viewBookServlet")
public class ViewBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
//		HttpSession session = request.getSession(false);
		
		BookServiceImpl bookservice = new BookServiceImpl();
		Book book = bookservice.findBookByIdWithCategory(id);
		System.out.println(book);
		request.setAttribute("book", book);
		
		//跳转页面到viewBook.jsp
		String url="page/viewBook.jsp";
		request.getRequestDispatcher(url).forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
