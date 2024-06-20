3
package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;
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

@WebServlet("/insertproduct")
public class InsertProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		ProductService pservice=new ProductServiceImp();
		
		String pname=req.getParameter("pname");
		int pid=Integer.parseInt(req.getParameter("pid"));
		int qty=Integer.parseInt(req.getParameter("pqty"));
		float price=Float.parseFloat(req.getParameter("price"));
		
		Product product = new Product(pid, pname, qty, price);
		int rowsaffected =pservice.addProduct(product);
		if(rowsaffected>0) {
			RequestDispatcher rd = req.getRequestDispatcher("DisplayProduct.jsp");
			rd.forward(req, resp);
		}
		else {
			out.println("<h3> Unable to add product</h3>");
			RequestDispatcher rd = req.getRequestDispatcher("DisplayProduct.jsp");
			rd.include(req, resp);
		}
	}

}
