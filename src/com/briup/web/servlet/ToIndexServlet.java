package com.briup.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.briup.bean.Book;
import com.briup.bean.Category;
import com.briup.service.BookService;
import com.briup.service.impl.BookServiceImpl;
import com.briup.service.impl.CategoryServiceImpl;

/**
 * 
 */
@WebServlet("/toIndexServlet")
public class ToIndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		HttpSession session = request.getSession();
		
		
		//1.此处使用service对象获取所有书籍信息
		BookService servicebook = new BookServiceImpl();
		List<Book> books = servicebook.findAllBooks();
		
		
		
		//获取类别信息
		CategoryServiceImpl servicecate = new CategoryServiceImpl();
		List<Category> categorys = servicecate.findAllCategory();
		System.out.println(categorys);
		System.out.println(books);
		//2.添加到request范围对象中
		request.setAttribute("books", books);
		request.setAttribute("categorys", categorys);
		//3.服务器内部跳转到主页
		String url = "page/index.jsp";
		request.getRequestDispatcher(url).forward(request, response);
		//4.jsp中提取书籍信息显示在主页上
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
