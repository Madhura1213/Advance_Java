package com.myapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myapp.beans.*;
import com.myapp.service.UserService;
import com.myapp.service.UserServiceImp;
public class RegisterDetails extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserService uservice = new UserServiceImp();
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		 String name = req.getParameter("name");
		 String gender = req.getParameter("gender");
		 String[] skill= req.getParameterValues("skill");
		 String username= req.getParameter("unm");
		 String password =req.getParameter("pass");
		 String question=req.getParameter("que");
		 String answer=req.getParameter("ans");
		 RegisterUser user = new RegisterUser(name, gender, skill, username, password, question, answer);
		
		boolean status = uservice.registerUser(user);
		if(status) {
			out.println("<h3>Please Login with Credentials </h3>");
			
		}else {
			out.println("<h3>Please Register Again </h3>");
		}RequestDispatcher rd = req.getRequestDispatcher("validate.html");
		rd.include(req, resp);
	}
}
