

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/order")
public class OrderServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/order doGet 실행");
		response.setContentType("text/html; charset=utf-8;");
		
		PrintWriter out = response.getWriter();
		
		String foodName = request.getParameter("food");
		String cnt = request.getParameter("count");
		
		out.write("음식명 : "+ foodName +"<br>");
		out.write("인원수 : "+ cnt +"<br>");
		
		int num = (int)(Math.random()*100) + 1;
		out.write("<hr>대기번호 : "+ num +"<br>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/order doPost 실행");
	}

}
