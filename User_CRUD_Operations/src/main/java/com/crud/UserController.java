package com.crud;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class UserController extends HttpServlet {

	private ArrayList<User> userList = new ArrayList<>();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getParameter("action");
		User user = new User();
		UserDao dao = new UserDao();

		switch (action) {
		case "create":

			user.setUsername(req.getParameter("username"));
			user.setUseremail(req.getParameter("useremail"));
			String userphno = req.getParameter("userphno");
			user.setUserphno(Integer.parseInt(userphno));

			try {
				boolean createUser = dao.createUser(user);
				if (createUser) {
					System.out.println("created");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		case "edit":
			int id = Integer.parseInt(req.getParameter("userid"));
			user.setUserid(id);
			User retrieveUser = dao.retrieveUser(id);
			req.setAttribute("user", retrieveUser);
			RequestDispatcher dispatcher1 = req.getRequestDispatcher("index.jsp");
			dispatcher1.include(req, resp);
			
			break;

		case "update":
		String username = req.getParameter("username");
			String useremail = req.getParameter("useremail");
			String userphno1 = req.getParameter("userphno");
			String userid = req.getParameter("userphno");
			

			try {
				boolean createUser = dao.updateUser(username,useremail,Integer.parseInt(userphno1),Integer.parseInt(userid));
				if(createUser) {
					RequestDispatcher dispatcher = req.getRequestDispatcher("userdata.jsp");
					dispatcher.forward(req, resp);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		case "delete":

			user.setUserid(Integer.parseInt(req.getParameter("userid")));
			try {
				boolean deleteUser = dao.deleteUser(user);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			req.getRequestDispatcher("userdata.jsp").include(req, resp);
			break;

		case "retrieve":
			List<User> retrieveAllUsers = dao.retrieveAllUsers();
			req.setAttribute("data", retrieveAllUsers);
			RequestDispatcher dispatcher = req.getRequestDispatcher("userdata.jsp");
			dispatcher.forward(req, resp);
			break;
			
			
	}
	}

}
