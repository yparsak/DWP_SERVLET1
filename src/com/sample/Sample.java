package com.sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Sample")
public class Sample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Sample() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println(
			"<!doctype html public \"-//w3c//dtd html 4.0 transitional//en\"> \n"
			+ "<html> \n"
			+ "  <body> \n"
			+ "    <b>First Name</b>: "+ request.getParameter("first_name") + "  <br />\n"
			+ "    <b>Last  Name</b>: "+ request.getParameter("last_name") + " <br />\n"
			+ "  </body>\n"
			+ "</html>"
			);

		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
