package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.Team;

public class TestCollection {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
		Team team1=(Team)ctx.getBean("t1");
		System.out.println("---------------------");
		System.out.println(team1);
		((ClassPathXmlApplicationContext)ctx).close();

	}

}
