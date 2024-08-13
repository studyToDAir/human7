package org.zerock.w1.todo.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.zerock.w1.todo.dao.TodoDAO;
import org.zerock.w1.todo.dto.TodoDTO;

public class TodoService {

	public void register(TodoDTO todoDTO) {
		// DB에 insert
		System.out.println("등록중..."+ todoDTO.toString());
	}

	public List<TodoDTO> getList(){
		// DB에서 select
		
		
		TodoDAO todoDAO = new TodoDAO();
		
		List<TodoDTO> list = todoDAO.selectAll();
		
//		List<TodoDTO> list = new ArrayList<TodoDTO>();
//		
//		for(int i=0; i<10; i++) {
//			TodoDTO dto = new TodoDTO();
//			dto.setTno(i);
//			dto.setTitle("todo..."+i);
//			dto.setDueDate(LocalDate.now());
//			
//			list.add(dto);
//		}
		
		return list;
		
	}
	
	public TodoDTO get(int tno1) {
		TodoDTO dto1 = new TodoDTO();
		
		TodoDAO dao = new TodoDAO();
		dto1 = dao.selectOne(tno1);
		
//		dto1.setTno(tno1);
//		dto1.setTitle(tno1+"번째 글");
//		dto1.setDueDate(LocalDate.now());
//		dto1.setFinished(true);
		
		return dto1;
	}
	
}
