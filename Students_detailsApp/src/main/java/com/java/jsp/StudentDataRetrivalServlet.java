package com.java.jsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StudentDataRetrival")
public class StudentDataRetrivalServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		Student_dao obj1 = new Student_dao();
		ResultSet studentdata = null;
		PrintWriter writer = resp.getWriter();
		resp.setContentType("text/html");
		if ( Integer.parseInt(id) == 1000) {
			studentdata = obj1.getAllStudents();
			req.setAttribute("studentdata", studentdata);
			RequestDispatcher dispatcher = req.getRequestDispatcher("Studentdata.jsp");
			dispatcher.forward(req, resp);
		}
		if (id.length() > 0 && Integer.parseInt(id) != 1000) {
			studentdata = obj1.getStudentdata(Integer.parseInt(id));
			req.setAttribute("studentdata", studentdata);
			RequestDispatcher dispatcher = req.getRequestDispatcher("Studentdata.jsp");
			dispatcher.forward(req, resp);
		}else {
			writer.write("<h1 Style='color:red;'>Field is not empty</h1>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("Common.html");
			dispatcher.include(req, resp);
		}
		

	}

}
