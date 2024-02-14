package com.check_Vote;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/voter")
public class VoterChecking extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        String age = req.getParameter("age");
        String name =req.getParameter("name");
        res.setContentType("text/html");
        PrintWriter writer = res.getWriter();
        LocalDate date=LocalDate.now();
        LocalDate dob=LocalDate.parse(age);
        
 
        		
        if(date.getYear()-dob.getYear()>=18) {
        	
            RequestDispatcher request = req.getRequestDispatcher("votecheck.html");
            request.include(req,res);
            writer.print(name);
            writer.print(" YOU ARE ELIGIBLE TO VOTE!");
        } else {
        	
        	RequestDispatcher request = req.getRequestDispatcher("votecheck.html");
            request.include(req,res);
            writer.print(name);
        	writer.println("SORRY! YOU ARE NOT ELIGIBLE TO VOTE");
            
        }

        
    }


    	
    		
    	}