package edu.gqq.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("showheader")
@WebServlet(name="ShowHeaders",loadOnStartup=1,urlPatterns={"/showheader"})
public class ShowHeaders extends HttpServlet {

	@Override
	public void init() throws ServletException {
		super.init();
		log("ShowHeaders init ok");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		out.println("HTTP headers sent by your client:<br>");

		Enumeration enum2 = req.getHeaderNames();
		while (enum2.hasMoreElements()) {
			String headerName = (String) enum2.nextElement();
			String headerValue = req.getHeader(headerName);
			out.print("<b>" + headerName + "</b>: ");
			out.println(headerValue + "<br>");
		}
	}
}
