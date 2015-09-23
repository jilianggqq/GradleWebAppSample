package edu.gqq.apputils;

import org.apache.log4j.Logger;

public class Log4jUtil {

	static Logger logger;

	public static Logger getLogger() {
		// PropertyConfigurator.configure("log4j.properties");
		logger = Logger.getLogger(Log4jUtil.class);
		return logger;
	}

	public static Logger getLogger(Class<?> c) {

		// PropertyConfigurator.configure("log4j.properties");
		logger = Logger.getLogger(c);
		// String
		return logger;
	}
}
