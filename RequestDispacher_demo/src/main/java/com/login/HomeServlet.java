package com.login;
 
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/home")
public class HomeServlet extends GenericServlet {
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname=req.getParameter("uname");
		String password=req.getParameter("password");
		PrintWriter p=res.getWriter();
		p.println("Welcome.........."+uname);
	}

}
