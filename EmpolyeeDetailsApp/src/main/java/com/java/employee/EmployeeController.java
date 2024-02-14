package com.java.employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/maincontroller")
public class EmployeeController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String city = req.getParameter("city");
		resp.setContentType("text/html");
		EmployeeModel model=new EmployeeModel();
		model.setEmployeeId(Integer.parseInt(id));
		model.setEmployeeName(name);
		model.setEmail(email);
		model.setCity(city);
		
		EmployeeDao dao=new EmployeeDao();
		int addEmployee=0;
		try {
			addEmployee = dao.addEmployee(model);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(addEmployee>=1) {
		PrintWriter writer = resp.getWriter();
		writer.write("registration Successfull");
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("EmployeRegistration.html");
		requestDispatcher.include(req, resp);
	}else {
		PrintWriter writer = resp.getWriter();
		writer.write("registration failed");
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("EmployeRegistration.html");
		requestDispatcher.include(req, resp);
		
	}
}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		EmployeeModel model=new EmployeeModel();
		EmployeeDao dao=new EmployeeDao();
		resp.setContentType("text/html");
		List<EmployeeModel> employeeById=null;
		try {
			 employeeById = dao.getEmployeeById(Integer.parseInt(id));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(employeeById.size()!=0) {
			req.setAttribute("employeeById", employeeById);
			RequestDispatcher dispatcher = req.getRequestDispatcher("EmployeeView.jsp");
			dispatcher.forward(req, resp);
			
		}else {
			PrintWriter writer = resp.getWriter();
			writer.write("<h1 style='color:red;'> invalid EmployeeId <h1>");
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("EmlpoyeeLogin.html");
			dispatcher.include(req, resp);
		}
		
		
	}
}