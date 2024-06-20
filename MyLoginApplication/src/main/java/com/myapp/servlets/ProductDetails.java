package com.myapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.myapp.service.*;
import com.myapp.beans.Product;

public class ProductDetails extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		ProductService pserv=new ProductServiceImp();
	
		List<Product> plist =pserv.getAllProducts();
		out.println("<h2> Product Data </h2>");
		out.println("<table border='1'><caption>Contents</caption><tr><th>Product Id"
				+ "<th> Name"
				+ "<th>Quantity"
				+ "<th>Price</tr> ");
		
		for(Product p : plist)
		{
			out.println("<tr><td>"+p.getPid()
					+ "<td>"+p.getPname()
					+ "<td>"+p.getQty()
					+ "<td>"+p.getPrice()+"</tr>");
		}
		out.println("</table>");
		
		
	}
}
