package com.filehandling;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/file")
public class FileServlet extends HttpServlet{

@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String filename = req.getParameter("filename");
	String fileurl=req.getParameter("fileurl");
	PrintWriter writer = resp.getWriter();
	HttpSession session = req.getSession();
	
	String id = req.getRequestedSessionId();
	resp.setContentType("text/html");
	
	Filedao obj=new Filedao();
	boolean value=false;
	try {
		value = obj.insert(filename, fileurl);
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	if(value) {
		writer.write("file added successfully !");
		RequestDispatcher dispatcher = req.getRequestDispatcher("index.html");
		dispatcher.include(req, resp);
		System.out.println(id);
		
		
	}else {
		writer.write("file not added !");
		RequestDispatcher dispatcher = req.getRequestDispatcher("index.html");
		dispatcher.include(req, resp);
		
	}
}
}

