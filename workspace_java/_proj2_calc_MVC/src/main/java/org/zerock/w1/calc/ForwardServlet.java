package org.zerock.w1.calc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/forward")
public class ForwardServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ForwardServlet doGet 실행");
		
		String text = request.getParameter("text");
		System.out.println("text : "+ text);
		
		String url = "AnotherServlet";
		request.getRequestDispatcher(url).forward(request, response);
		
//		AnotherServlet as = new AnotherServlet();
//		as.doGet(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ForwardServlet doPost 실행");
		
		String text = request.getParameter("text");
		System.out.println("text : "+ text);
		
		String url = "AnotherServlet";
		request.getRequestDispatcher(url).forward(request, response);
	}

}
