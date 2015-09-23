package edu.gqq.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import edu.gqq.apputils.Log4jUtil;

@WebServlet("/hello3")
public class HelloServlet3 extends HttpServlet {
	Logger logger = Log4jUtil.getLogger(HelloServlet3.class);
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		logger.info("hello3 do get");
		PrintWriter writer = resp.getWriter();
		writer.write("Hello Servlet 3");
		writer.close();
	}
}
