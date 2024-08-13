package org.zerock.w1.todo.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.zerock.w1.todo.dto.TodoDTO;

public class TodoService {

	public void register(TodoDTO todoDTO) {
		// DB에 insert
		System.out.println("등록중..."+ todoDTO.toString());
	}

	public List<TodoDTO> getList(){
		// DB에서 select
		
		List<TodoDTO> list = new ArrayList<TodoDTO>();
		
		
		for(int i=0; i<10; i++) {
			TodoDTO dto = new TodoDTO();
			dto.setTno(i);
			dto.setTitle("todo..."+i);
			dto.setDueDate(new Date(System.currentTimeMillis()));
			
			list.add(dto);
		}
		
		return list;
		
	}
	
	public TodoDTO get(int tno1) {
		TodoDTO dto1 = new TodoDTO();
		
		dto1.setTno(tno1);
		dto1.setTitle(tno1+"번째 글");
		dto1.setDueDate(new Date(System.currentTimeMillis()));
		dto1.setFinished(true);
		
		return dto1;
	}
	
}
