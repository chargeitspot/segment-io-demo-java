package com.cis.segmentio;

//Import required java libraries
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.cis.segmentio.objects.Message;

//Extend HttpServlet class
public class SegmentServlet extends HttpServlet {

	public static final Logger logger = Logger.getLogger(SegmentServlet.class);

	public void init() throws ServletException {
		// Do required initialization

		
   
	}

	public void doPost(HttpServletRequest request,
		HttpServletResponse response)
		throws ServletException, IOException {
	
		//response MIME type
		response.setContentType("text/plain");
	
		//json processing
		Message p = new Message();
		try(Reader reader = request.getReader()){
			Gson gson = new GsonBuilder().create();
			p = gson.fromJson(reader, Message.class);        
		} catch(Exception e) {
			logger.error("JSON mal-formed or not present", e);
			response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Error with JSON data");
			return;
		}
		
		if(p.getType() == null || p.getUserId() == null) {
			logger.error("JSON mal-formed or not present");
			response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Error with JSON data");
			return;
		}
		
		//ignore requests other than identify
		if(p.getType() != "identify") {
			response.setStatus(HttpServletResponse.SC_OK);
			response.getWriter().println("Ignoring requests other than identify");
			return;
		}
		
		if( p.getTraits() == null || p.getTraits().getEmail() == null) {
			logger.error("Identify request missing elements");
			response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Error getting data from identify request");
			return;
		}
		
	
	
		// at this point, you do whatever you need to do with the request
		PrintWriter out = response.getWriter();
		out.println(p.toString()); // this example responds to the request with processed data ( from Message.toString() )
	
	}
		  
	public void destroy() {
		// do nothing.
	}
}