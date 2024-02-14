package com.user;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private ArrayList<User> userList = new ArrayList<>();
    private AtomicInteger idCounter = new AtomicInteger(1);

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action == null) {
            action = "list";
        }

        switch (action) {
            case "list":
                request.setAttribute("userList", userList);
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;
            case "create":
                String username = request.getParameter("username");
                String useremail = request.getParameter("useremail");
                String userphno = request.getParameter("userphno");
                User newUser = new User();
                newUser.setUserid(idCounter.getAndIncrement());
                newUser.setUsername(username);
                newUser.setUseremail(useremail);
                newUser.setUserphno(Integer.parseInt(userphno));
                userList.add(newUser);
                response.sendRedirect("UserServlet");
                break;
            case "edit":
                int editUserId = Integer.parseInt(request.getParameter("id"));
                User userToEdit = userList.stream().filter(u -> u.getUserid() == editUserId).findFirst().orElse(null);
                if (userToEdit != null) {
                    request.setAttribute("userToEdit", userToEdit);
                }
                response.sendRedirect("UserServlet");
                break;
            case "update":
                int updateUserId = Integer.parseInt(request.getParameter("id"));
                String updatedUsername = request.getParameter("username");
                String updatedUseremail = request.getParameter("useremail");
                String updatedUserphno = request.getParameter("userphno");
                User userToUpdate = userList.stream().filter(u -> u.getUserid() == updateUserId).findFirst().orElse(null);
                if (userToUpdate != null) {
                    userToUpdate.setUsername(updatedUsername);
                    userToUpdate.setUseremail(updatedUseremail);
                    userToUpdate.setUserphno(Integer.parseInt(updatedUserphno));
                }
                response.sendRedirect("UserServlet");
                break;
            case "delete":
                int userId = Integer.parseInt(request.getParameter("id"));
                userList.removeIf(u -> u.getUserid() == userId);
                response.sendRedirect("UserServlet");
                break;
            default:
                request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}

