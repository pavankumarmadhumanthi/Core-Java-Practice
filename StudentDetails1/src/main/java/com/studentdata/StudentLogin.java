package com.studentdata;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.studentdata.Student_dao;

public class StudentLogin extends GenericServlet {
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id = request.getParameter("id");
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String address=request.getParameter("address"); 
		
		PrintWriter writer = response.getWriter();
		writer.write(id);
		writer.write(name);
		writer.write(email);
		writer.write(phone);
		writer.write(address);
		
		Student_dao obj=new Student_dao();
		try {
			obj.dataInsert(Integer.parseInt(id), name, email,Double.parseDouble(phone), address);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		}

}
