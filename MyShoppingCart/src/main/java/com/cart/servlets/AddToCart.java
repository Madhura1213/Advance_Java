package com.cart.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.cart.beans.Product;
import java.util.ArrayList;

import java.util.List;
import java.util.stream.Stream;

@WebServlet("/addtocart")
public class AddToCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String button=request.getParameter("btn");
	if(button.equals("add")) {
		HttpSession session = request.getSession();
		List<Product> cart = (List<Product>)session.getAttribute("cart");
		if(cart==null ) {
  			 cart=new ArrayList<>();
  		}
		String[] products= request.getParameterValues("product1");
		int[] qty = new int[products.length];
		
		System.out.println("Products List : ");
		Stream.of(products).forEach(System.out::println);
		
		for(int i=0;i<products.length;i++) {
		String[] productdetails= products[i].split(":");
		System.out.println(productdetails[i]);
		qty[i]= Integer.parseInt(request.getParameter(productdetails[1]));
		Product p= new Product(Integer.parseInt(productdetails[0]),productdetails[1],qty[i],Double.parseDouble(productdetails[2]));
		cart.add(p);
		}
		Stream.of(qty).forEach(System.out::println);
		session.setAttribute("cart", cart);
		RequestDispatcher rd = request.getRequestDispatcher("findCategory");
		rd.forward(request, response);
		
	}else {
		RequestDispatcher rd = request.getRequestDispatcher("findCategory");
		rd.forward(request, response);
	}
		
  }
}
