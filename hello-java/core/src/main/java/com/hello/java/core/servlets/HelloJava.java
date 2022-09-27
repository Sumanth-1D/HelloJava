package com.hello.java.core.servlets;

import java.io.IOException;
import java.util.Scanner;

import javax.servlet.Servlet;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.service.component.annotations.Component;

@Component(service={Servlet.class},property = {"Sling.servlet.paths=" + "/bin/hellojava"})


public class HelloJava extends SlingSafeMethodsServlet{
	
	protected void doGet(SlingHttpServletRequest req,SlingHttpServletResponse res) throws IOException{
		String name1 = req.getParameter("name");
		
		res.getWriter().println("Hello"+ name1);
		
	}

}
