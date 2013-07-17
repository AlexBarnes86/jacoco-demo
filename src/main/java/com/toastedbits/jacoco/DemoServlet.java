package com.toastedbits.jacoco;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = -7485296299041069908L;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String question = request.getParameter("q");
		
		PrintWriter pw = response.getWriter();
		pw.print("<!DOCTYPE html><html><head><meta charset=\"utf-8\"><title>Answer</title></head><body>");
		
		if(question != null) {
			pw.print("<p>Question: " + question + "<br>");
			pw.print("Answer: " + new JaCoCoDemo().calculateAnswer(question) + "</p>");
		}
		else {
			pw.print("<p>Pose a question with the q request parameter</p>");
		}
		
		pw.print("</body></html>");
		
		pw.flush();
	}
}