package com.grails.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class First
 */
@WebServlet("/First")
public class First extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private int count=0;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public First() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("name"); 
		response.setContentType("text/html"); 
		count++;
		
		PrintWriter out = response.getWriter(); 
		System.out.println("Username:"+id);
	    String htmlResponse="<html>";
		htmlResponse +="<h2>Welcome:"+ id +"</br>";
		htmlResponse +="</html>";
		out.println(htmlResponse);
		out.println("count:"+count);
		out.println("<P>");
        out.print("<form action=\"");
        out.print(response.encodeURL("Hai.html"));
        out.print("\" ");
        out.println("method=POST>");
        out.println("<br>");
        out.println("<input type=submit value=\"Back\">");
        out.println("</form>");
        out.close();
		
	}

}
