package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.Product;

public class TestProduct
{
	public static void main(String[] args) 
	{	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
	
	Product p11=(Product)ctx.getBean("p1");
	Product p12=(Product)ctx.getBean("p2");
	
	System.out.println("--------------------");
	System.out.println(p11);
	System.out.println("--------------------");
	System.out.println(p12);
	
	((ClassPathXmlApplicationContext)ctx).close();
	}
}
