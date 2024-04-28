package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Welcome")
public class HelloServlet1 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse resp ) throws ServletException,IOException{
		
		String email=req.getParameter("uname");
		String password=req.getParameter("password");
		if(email.equals("span") && password.equals("123"))
		{
		resp.sendRedirect("Home.html");
		}
		else {
			resp.setContentType("text/html");
			RequestDispatcher r=req.getRequestDispatcher("login.html");
			PrintWriter p=resp.getWriter();
			p.print("Incorrect username and password");
			r.include(req, resp);
			
		}
	}

}
