package com.book;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/bookcontroller")
public class BookController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String bookname = req.getParameter("bookname");
		String bookprice = req.getParameter("bookprice");
		String authorname = req.getParameter("authorname");
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		BookModel bookModel = new BookModel();
		try {
			bookModel.setBookname(bookname);
			bookModel.setBookprice(Integer.parseInt(bookprice));
			bookModel.setAuthorname(authorname);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			writer.write("<h1 style='text-alingn:center;color:red;'>data  insertion failed<h1>");
			writer.write("<h4 style='text-alingn:center;color:red;'> Enter all the fields<h4>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
			dispatcher.include(req, resp);
			throw e;
			
		}
		BookDao bookdao = new BookDao();
		boolean setData = false;
		try {
			setData = bookdao.setData(bookModel);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (setData) {
			writer.write("<h1 style='text-alingn:center;color:green;'>data Successfully inserted<h1>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
			dispatcher.include(req, resp);
		} else {
			writer.write("<h1 style='text-alingn:center;color:red;'>data  insertion failed<h1>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
			dispatcher.include(req, resp);
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
			BookDao bookdao = new BookDao();
			try {
				List<BookModel> data = bookdao.getData();
				req.setAttribute("data", data);
				RequestDispatcher dispatcher = req.getRequestDispatcher("bookdata.jsp");
				dispatcher.forward(req, resp);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} 
}