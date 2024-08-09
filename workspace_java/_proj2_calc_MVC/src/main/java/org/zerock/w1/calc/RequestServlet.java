package org.zerock.w1.calc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/req")
public class RequestServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		test(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		test(request, response);
	}
	
	void test(HttpServletRequest request, HttpServletResponse response) {

		System.out.println("getRemoteAddr : "+ request.getRemoteAddr());
		System.out.println("getMethod : "+ request.getMethod());
		System.out.println("getRequestURL : "+ request.getRequestURL());
		System.out.println("getRequestURI : "+ request.getRequestURI());
		System.out.println("getServletPath : "+ request.getServletPath());
		System.out.println("getQueryString : "+ request.getQueryString());
		System.out.println("getContextPath : "+ request.getContextPath());
		
		// request에 임의의 값을 키로 저장할 수 있다
		request.setAttribute("key", "value");
		// request에서 키로 값을 꺼낼 수 있다
		String v = (String)request.getAttribute("key");
		System.out.println(v);
	}

}
