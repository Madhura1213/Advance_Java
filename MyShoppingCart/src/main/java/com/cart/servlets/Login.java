package com.cart.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cart.beans.MyUser;
import com.cart.service.CartService;
import com.cart.service.ICartService;

@WebServlet("/validate")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String username = request.getParameter("uname");
		String password = request.getParameter("pass");
		String op = request.getParameter("btn");
		
		PrintWriter out =  response.getWriter();
		ICartService cservice = new CartService();
		MyUser user = cservice.validateUser(username, password);
		if(user!=null) {
			HttpSession session = request.getSession();
			session.setAttribute("user", username);
			RequestDispatcher rd = request.getRequestDispatcher("findCategory");
			rd.forward(request, response);
		} else
			out.println("<h3>Invalid Credentials.. Please re-enter :</h3>");
		RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
		rd.include(request, response);
		}
		
	}


