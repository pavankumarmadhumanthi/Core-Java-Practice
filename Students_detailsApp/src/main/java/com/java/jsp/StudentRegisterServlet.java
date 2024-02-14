package com.java.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/StudentRegistration")
public class StudentRegisterServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 String id = req.getParameter("id");
	 String name = req.getParameter("name");
	 String course = req.getParameter("course");
	 String phone = req.getParameter("phone");
	 String date = req.getParameter("date");
	 String email = req.getParameter("email");
	 String password = req.getParameter("password");
	 PrintWriter writer = resp.getWriter();
	 resp.setContentType("text/html");
	 Student_dao obj2=new Student_dao();
	 try {
		boolean insertStudentdata = obj2.insertStudentdata(Integer.parseInt(id), name, course, Double.parseDouble(phone), date, email, Integer.parseInt(password));
		if(insertStudentdata) {
			writer.write("Student Record inserted Successfully");
			RequestDispatcher dispatcher = req.getRequestDispatcher("StudentRegister.html");
			dispatcher.include(req, resp);
			
		}else {
			writer.write("Student Record insertion failed !");
			RequestDispatcher dispatcher = req.getRequestDispatcher("StudentRegister.html");
			dispatcher.include(req, resp);
			
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	}

}
