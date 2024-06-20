package com.myapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myapp.beans.RegisterUser;
import com.myapp.service.UserService;
import com.myapp.service.UserServiceImp;

public class FindQuestion extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException{
	
	UserService uservice = new UserServiceImp();
	res.setContentType("text/html");
	PrintWriter out=res.getWriter();
	
	String name=req.getParameter("uname");
	RegisterUser user = uservice.findQuestion(name);
	
	out.println("<form action ='checkans'>");
	out.println("Question : "+user.getQuestion()+"<br><br>");
	out.println("Answer : <input type ='text' name ='ans' id='ans'> <br><br>");
	out.println("New Password : <input type ='password' name ='npass' id='npass'> <br><br>");
	out.println("Confirm Password : <input type ='text' name ='cpass' id='cpass'> <br><br>");
	out.println("<input type ='hidden' name ='uname' id='uname' value='"+user.getUsername()+"'><br><br>");
	out.println("<input type ='hidden' name ='ans1' id='ans1' value='"+user.getAnswer()+"'><br>");
	out.println("<button type='submit' name='btn' value='Login' id='login'>Login</button>");
	}
	
}
