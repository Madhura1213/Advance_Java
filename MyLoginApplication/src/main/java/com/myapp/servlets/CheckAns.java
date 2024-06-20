package com.myapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myapp.service.UserService;
import com.myapp.service.UserServiceImp;

public class CheckAns extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException{
	res.setContentType("text/html");
	PrintWriter out=res.getWriter();
	
	String uname=req.getParameter("uname");
	String useranswer=req.getParameter("ans");
	String answer=req.getParameter("ans1");
	String newpass=req.getParameter("npass");
	String confirmpass=req.getParameter("cpass");
	
	if(useranswer.equals(answer)) {
		if(confirmpass.equals(newpass)) {
			UserService uservice = new UserServiceImp();
			
			boolean status = uservice.changePassword(uname,newpass);
			if(status) {
				out.println("<h3>Please Login with Changed Password </h3>");
				
			}else {
				out.println("<h3>Unable to Changed Password </h3>");
			}RequestDispatcher rd = req.getRequestDispatcher("validate.html");
			rd.include(req, res);
			 
		}
	}
	}
}
