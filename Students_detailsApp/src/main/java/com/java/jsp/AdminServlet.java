package com.java.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		PrintWriter writer = resp.getWriter();
		resp.setContentType("text/html");
		Admin_dao obj1 = new Admin_dao();
		boolean admindata = false;
		try {
			admindata = obj1.getAdmindata(email, Integer.parseInt(password));
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (admindata) {
			writer.write("<h1 style='text-align:center;'>login Successful</h1>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("Common.html");
			dispatcher.include(req, resp);
		} else {
			writer.write("login failed");
			RequestDispatcher dispatcher = req.getRequestDispatcher("AdminLogin.html");
			dispatcher.include(req, resp);

		}

	}
}
