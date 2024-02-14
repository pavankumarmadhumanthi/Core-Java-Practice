package com.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class UserValidation extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("email");
		String password=req.getParameter("pass");
		PrintWriter writer = resp.getWriter();
		resp.setContentType("text/html");
		
		if(name!=null && password!=null) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("Login.html");
			writer.write("login succesfull !");
			dispatcher.include(req, resp);
			
		}else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("Login.html");
			writer.write("login Failed !");
			dispatcher.include(req, resp);
			
		}
	}
	

}
