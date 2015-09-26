package edu.gqq.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet {  
	  
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String n = request.getParameter("userName");
		String p = request.getParameter("userPass");

		if (p.equals("servlet")) {
			out.print("this contents will be not displayed");
			RequestDispatcher rd = request.getRequestDispatcher("welcome");
			rd.include(request, response);
		} else {
			out.print("<h1 style='color:red'>Sorry UserName or Password Error!</h1>");
			
			//if use rd.forward, it just displays the contents of index.html. But dont display out.
			RequestDispatcher rd = request.getRequestDispatcher("/index.html");
			rd.include(request, response);

		}
	}

}  