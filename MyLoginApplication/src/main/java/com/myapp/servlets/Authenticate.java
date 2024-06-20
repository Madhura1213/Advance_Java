package com.myapp.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.myapp.beans.MyUser;
import com.myapp.service.UserService;
import com.myapp.service.UserServiceImp;


public class Authenticate extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		String uname=req.getParameter("uname");
		String pass=req.getParameter("pass");
		
		UserService uservice = new UserServiceImp();
		
		MyUser user = uservice.validateUser(uname, pass);
		if(user!=null) {
			RequestDispatcher rd = req.getRequestDispatcher("displayproducts");
			rd.forward(req, res);
		} else
			out.println("<h3>Invalid Credentials.. Please re-enter :</h3>");
		RequestDispatcher rd = req.getRequestDispatcher("validate.html");
		rd.include(req, res);
	}
}
