package edu.gqq.web;

import java.io.*;
import javax.servlet.*;

public class SimpleServlet implements Servlet {
	ServletConfig config = null;

	public void init(ServletConfig config) {
		this.config = config;
		System.out.println("SimpleServlet is initialized");
	}

	public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException {

		res.setContentType("text/html");
		System.out.println("processing...");
		PrintWriter out = res.getWriter();
		out.print("<html><body>");
		out.print("<b>hello simple servlet</b>");
		out.print("</body></html>");

	}

	public void destroy() {
		System.out.println("SimpleServlet is destroyed");
	}

	public ServletConfig getServletConfig() {
		return config;
	}

	public String getServletInfo() {
		return "copyright 2007-1010";
	}

}
