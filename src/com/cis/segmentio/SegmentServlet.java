package com.cis.segmentio;

//Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

//Extend HttpServlet class
public class SegmentServlet extends HttpServlet {

private String message;

public void init() throws ServletException
{
   // Do required initialization
   message = "Hello World";
   
}

public void doGet(HttpServletRequest request,
                 HttpServletResponse response)
         throws ServletException, IOException {
   // Set response content type
   response.setContentType("text/html");

   // Actual logic goes here.
   PrintWriter out = response.getWriter();
   out.println("<h1>" + message + "</h1>");
}

public void doPost(HttpServletRequest request,
		HttpServletResponse response)
		throws ServletException, IOException {
	
	//response MIME type
	response.setContentType("text/plain");
	
	//json processing
	

	
}
		  
public void destroy()
{
   // do nothing.
}
}