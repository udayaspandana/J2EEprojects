package com.login;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
 
@WebServlet("/login")
public class LoginServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname=req.getParameter("uname");
		String password=req.getParameter("password");
		if(uname.equals("Supriya") && password.equals("123")) {
			RequestDispatcher r=req.getRequestDispatcher("home");
			r.forward(req, res);
		}
		else {
			res.setContentType("text/html");
			RequestDispatcher r=req.getRequestDispatcher("Login.html");
			PrintWriter p=res.getWriter();
			p.print("Incorrect username and password");
			r.include(req, res);
		}
	}
}
