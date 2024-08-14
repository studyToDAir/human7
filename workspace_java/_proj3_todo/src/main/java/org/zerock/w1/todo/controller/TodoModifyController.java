package org.zerock.w1.todo.controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zerock.w1.todo.dto.TodoDTO;
import org.zerock.w1.todo.service.TodoService;

@WebServlet("/todo/modify")
public class TodoModifyController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/todo/modify doGet 실행");
		
		String str_tno = request.getParameter("tno");
		System.out.println("str_tno : "+ str_tno);
		
		// 문자를 숫자로 String to int
		int tno2 = Integer.parseInt(str_tno);
		
		TodoService todoService = new TodoService();
		TodoDTO dto2 = todoService.get(tno2);
		
		request.setAttribute("dto", dto2);
		request.getRequestDispatcher("/WEB-INF/todo/modify.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/todo/register doPost 실행");
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8;");
		
		String str_tno = request.getParameter("tno");
		int tno2 = Integer.parseInt(str_tno);
		
		String title = request.getParameter("title");
		String dueDate = request.getParameter("dueDate");
		String finished = request.getParameter("finished");
		
		TodoDTO todoDTO = new TodoDTO();
		todoDTO.setTno(tno2);
		todoDTO.setTitle(title);
		todoDTO.setDueDate(LocalDate.parse(dueDate));
		if("N".equals(finished)) {
			todoDTO.setFinished(false);
		} else {
			todoDTO.setFinished(true);
		}
		System.out.println(todoDTO);
		
		// db 의 insert까지 실행
		TodoService todoService = new TodoService();
		int result = todoService.modify(todoDTO);
		System.out.println("update 결과 : "+ result);
		
		// 목록으로 보내기
//		response.sendRedirect("list");
//		response.sendRedirect("/_proj3_todo/todo/list");
		String contextPath = request.getContextPath();
		response.sendRedirect(contextPath + "/todo/list");
	}

}
