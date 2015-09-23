package edu.gqq.web;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.gqq.apputils.DateUtils;

public class DaysToGoServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println(new DateUtils().daysToNewYear() + " to go in 2014. Learn Gradle now!");
	}
}
