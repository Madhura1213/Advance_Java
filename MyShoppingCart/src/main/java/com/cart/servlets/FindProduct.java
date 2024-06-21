package com.cart.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cart.beans.Product;
import com.cart.service.IProductService;
import com.cart.service.ProductService;

@WebServlet("/findproduct")
public class FindProduct extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	int cartid= Integer.parseInt(request.getParameter("cart1"));
	
	String btn = request.getParameter("btn");
	
	if(btn.equalsIgnoreCase("find")) {
	IProductService pservice= new ProductService();
	List<Product> plist = pservice.findAllProduct(cartid);
	request.setAttribute("productlist",plist);
	RequestDispatcher rd = request.getRequestDispatcher("FindProduct.jsp");
	rd.forward(request, response);
	
	}else {
		
		RequestDispatcher rd = request.getRequestDispatcher("Showbill.jsp");
		rd.forward(request, response);
	}
 }

}
