package com.cart.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.cart.service.*;
import com.cart.beans.Category;

@WebServlet("/findCategory")
public class FindCategory extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	IProductService pservice= new ProductService();
	
	List<Category> clist= pservice.getAll();
	request.setAttribute("categorylist", clist);
	RequestDispatcher rd = request.getRequestDispatcher("displaycategory.jsp");
	rd.forward(request, response);
	
	
	}

}
