package com.demo.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImp;

@WebServlet("/displayProducts")
public class ProductDisplay extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		
		ProductService pserv=new ProductServiceImp();
	
		List<Product> plist =pserv.getAllProducts();
		
		request.setAttribute("plist", plist);
		System.out.println(plist);
		RequestDispatcher rd = request.getRequestDispatcher("DisplayProduct.jsp");
		rd.include(request, resp);
	}

}
