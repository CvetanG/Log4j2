package net.codejava.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.apache.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@WebServlet("/test")
public class TestLog4jServlet extends HttpServlet {
//		static final Logger LOGGER = Logger.getLogger(TestLog4jServlet.class); 
	static final Logger LOGGER = LogManager.getLogger(TestLog4jServlet.class); 
			
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		LOGGER.info("This is a logging statement from log4j2");
		
		String html = "<html><h2>Log4j2 has been initialized successfully!</h2></html>";
		response.getWriter().println(html);
	}

}