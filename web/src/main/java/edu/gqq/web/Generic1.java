package edu.gqq.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Generic1 extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		this.log(req.getParameter("info"));
		res.setContentType("text/html");

		ServletConfig config = getServletConfig();
		Enumeration<String> initParameterNames = config.getInitParameterNames();
		if (initParameterNames != null) {
			log("initParameterNames is not null");
//			initParameterNames.
			while (initParameterNames.hasMoreElements()) {
				String nextElement = initParameterNames.nextElement();
				this.log(nextElement);
			}
		} else {
			log("initParameterNames is null");
		}

		PrintWriter out = res.getWriter();
		out.print("<html><body>");
		out.print("<b>hello generic servlet</b>");
		out.print("</body></html>");
	}

}
