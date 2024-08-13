package org.zerock.w1.todo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/one")
public class TodoOneController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/one doGet 실행");
		
		// 브라우저로 글씨를 보낸다
		PrintWriter out = response.getWriter();
		out.println("<h1>h");
		out.print("e");
		out.append("ll");
		out.write("o</h1>");
		
		// 브라우저에서 보낸 파라메터를 받는다
		// id의 값 출력하기
		String 아이디 = request.getParameter("id");
		System.out.println("아이디 : "+ 아이디);
		
		// pw의 값 출력하기
		
		// id의 값과 pw의 값을 브라우저에 출력
	}

}
