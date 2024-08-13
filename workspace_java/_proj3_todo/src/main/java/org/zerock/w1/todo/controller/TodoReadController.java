package org.zerock.w1.todo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zerock.w1.todo.dto.TodoDTO;
import org.zerock.w1.todo.service.TodoService;

@WebServlet("/todo/read")
public class TodoReadController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/todo/read");
		
		String str_tno = request.getParameter("tno");
		System.out.println("str_tno : "+ str_tno);
		
		// 문자를 숫자로 String to int
		int tno2 = Integer.parseInt(str_tno);
		
		TodoService todoService = new TodoService();
		TodoDTO dto2 = todoService.get(tno2);
		
		request.setAttribute("dto", dto2);
		request.getRequestDispatcher("/WEB-INF/todo/read.jsp").forward(request, response);
	}

}
