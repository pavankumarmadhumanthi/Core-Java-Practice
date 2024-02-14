package com.contact;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/")
public class UserController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getParameter("action");
		
		UserDao dao = new UserDao();
		ContactDao cont=new ContactDao();

		switch (action) {
		case "create":

			String username = req.getParameter("username");
			String useremail = req.getParameter("useremail");
			String userpassword = req.getParameter("userpassword");
			String userphno = req.getParameter("userphno");
			

			try {
				boolean createUser = dao.createUser(username, useremail, userpassword, userphno);
				if (createUser) {
					req.setAttribute("msg","User account created");
					RequestDispatcher dispatcher= req.getRequestDispatcher("register.jsp");
					dispatcher.include(req, resp);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				req.setAttribute("msg","User account created");
				RequestDispatcher dispatcher= req.getRequestDispatcher("register.jsp");
				dispatcher.include(req, resp);
			}
			break;
		case "login":
			String useremail1 = req.getParameter("useremail");
			String userpassword1 = req.getParameter("userpassword");
			int user = dao.getUser(useremail1, userpassword1);
			if(user!=0) {
			
				 List<Contact> contacts = cont.getContacts(user);
				 HttpSession session = req.getSession();
				 session.setAttribute("user",user);
				 req.setAttribute("List", contacts);
				 RequestDispatcher dispatcher = req.getRequestDispatcher("contacts.jsp");
				dispatcher.forward(req, resp);
			
				
			}else {
				req.setAttribute("msg","failed to Login");
				RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
				dispatcher.include(req, resp);
				
			}
			break;
		
		case "addcontact": 
			String userid = req.getParameter("user");
			String contactname = req.getParameter("contactname");
			String contactemail = req.getParameter("contactemail");
			String contact = req.getParameter("contact");
			try {
				boolean add = cont.createUser(Integer.parseInt(userid),contactname, contactemail, contact);
				if(add) {
					 List<Contact> contacts = cont.getContacts(Integer.parseInt(userid));
					 req.setAttribute("List", contacts);
					 RequestDispatcher dispatcher = req.getRequestDispatcher("contacts.jsp");
					dispatcher.forward(req, resp);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "contactsdata":
			 int userid1=(Integer)req.getAttribute("userid");
			 List<Contact> contacts = cont.getContacts(userid1);
			 req.setAttribute("List", contacts);
			 RequestDispatcher dispatcher = req.getRequestDispatcher("contacts.jsp");
			dispatcher.forward(req, resp);
			break;
			
		case "logout":
			
	        HttpSession session = req.getSession(false); 

	        if (session != null) {
	            // Invalidate the session
	            session.invalidate();

	            // Redirect to a logout confirmation page or the login page
	            resp.sendRedirect("login.jsp");
	        } else {
	            // If no session exists, you can handle the case accordingly
	            resp.sendRedirect("login.jsp");
	        }
	    }
			
		}
	
}
