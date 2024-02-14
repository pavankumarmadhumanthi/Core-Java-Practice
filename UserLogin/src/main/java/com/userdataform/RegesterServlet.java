package com.userdataform;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/registration")
public class RegesterServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String parameter1 = req.getParameter("name");
		String parameter2 = req.getParameter("phno");
		String parameter3 = req.getParameter("passwor");
		String parameter4 = req.getParameter("email");
		resp.setContentType("text/html");
		UserDetailsdao dao=new UserDetailsdao();
		boolean value=false;
		try {
			value = dao.setData(parameter1,Integer.parseInt(parameter2),Double.parseDouble(parameter3), parameter4);	
		} catch (Exception e) {
			e.printStackTrace();
		}
		PrintWriter writer = resp.getWriter();
		if(value) {
			writer.write("registration success go for login");
			RequestDispatcher dispatcher = req.getRequestDispatcher("registration.html");
			dispatcher.include(req, resp);
		}
		else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("registration.html");
			writer.print("Registration failed");
			dispatcher.include(req,resp);
		}
	}


	}
 

