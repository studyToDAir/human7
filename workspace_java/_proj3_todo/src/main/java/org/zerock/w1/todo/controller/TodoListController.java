package org.zerock.w1.todo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.zerock.w1.todo.dto.TodoDTO;
import org.zerock.w1.todo.service.TodoService;

@WebServlet("/todo/list")
public class TodoListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/todo/list doGet 실행");
		
		TodoService todoService = new TodoService();
		List<TodoDTO> todoList = todoService.getList();
		
		request.setAttribute("list1", todoList);
		
		request.getRequestDispatcher("/WEB-INF/todo/list.jsp").forward(request, response);
	}

}
