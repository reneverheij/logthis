package com.ibm.stuff.logthis;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Servlet implementation class LogServlet
 */
public class LogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException 
	{
		// 
		final Logger logger = LogManager.getLogger(LogServlet.class);
		logger.info(request.getParameter("logstring"));

		// Go back to index.jsp.
		response.sendRedirect(request.getContextPath());
	}

}
