package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.demo.service.*;
import com.demo.beans.MyUser;

@WebServlet("/validate")
public class ValidateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		String uname=req.getParameter("uname");
		String pass=req.getParameter("pass");
		UserService uservice = new UserServiceImp();
		
		MyUser user = uservice.validateUser(uname, pass);
		if(user!=null) {
			HttpSession session = req.getSession();
			session.setAttribute("user", user);
			RequestDispatcher rd = req.getRequestDispatcher("displayProducts");
			rd.forward(req, res);
		} else
			out.println("<h3>Invalid Credentials.. Please re-enter :</h3>");
		RequestDispatcher rd = req.getRequestDispatcher("Login.jsp");
		rd.include(req, res);
		
	}

}
