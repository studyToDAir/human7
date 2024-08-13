package org.zerock.w1.todo.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zerock.w1.todo.dto.TodoDTO;

@WebServlet("/one")
public class TodoOneController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/one doGet 실행");
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8;");
		
		
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
		String pw = request.getParameter("pw");
		System.out.println("pw : "+ pw);
		
		// id의 값과 pw의 값을 브라우저에 출력
		out.println("<h2> id : "+ 아이디 +"</h2>");
		out.println("<h2> pw : "+ pw +"</h2>");
		
		out.println("<hr>");

		// 서비스 클래스에서 했던일
		List<TodoDTO> list = new ArrayList<TodoDTO>();
		for(int i=1; i<=10; i++) {
			
			TodoDTO dto1 = new TodoDTO();
//			dto1.tno = i;
			dto1.setTno(i);
			dto1.setTitle("할일"+i);
			if(i % 3 == 0) {
				dto1.setFinished(true);
			}
			
			list.add(dto1);
		}
		
		// JSP에서 했던 일
		for(int i=0; i<list.size(); i++) {
			
//			TodoDTO dto2 = (TodoDTO)list.get(i);
			TodoDTO dto2 = list.get(i);
			
			out.println("<div>");
			out.println("<input type='checkbox' ");
			if(dto2.isFinished()) {
				out.println("checked='checked'");
			}
			out.println(">");
			
			out.println("tno : "+ dto2.getTno());
			out.println(", title : "+ dto2.getTitle());
			out.println("</div>");
		}
	}

}
