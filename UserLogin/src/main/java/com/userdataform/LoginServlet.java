package com.userdataform;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String parameter2 = req.getParameter("passwor");
		
		String parameter4 = req.getParameter("email");
		UserDetailsdao dao1=new UserDetailsdao();
		resp.setContentType("text/html");
		String value="";
		try {
			value=dao1.getData(Integer.parseInt(parameter2), parameter4);
		} catch (NumberFormatException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PrintWriter writer = resp.getWriter();
		if(value.length()>1) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("dashboard.html");
			dispatcher.forward(req, resp);
			writer.print("hello");
			
		}
		else {
			writer.print("invalid account details rgister first");
			RequestDispatcher dispatcher = req.getRequestDispatcher("login.html");
			dispatcher.include(req, resp);
		}
	}

}
