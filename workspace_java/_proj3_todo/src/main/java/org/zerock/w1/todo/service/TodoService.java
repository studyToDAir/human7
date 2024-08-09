package org.zerock.w1.todo.service;

import java.time.LocalDate;
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
			dto.setDueDate(LocalDate.now());
			
			list.add(dto);
		}
		
		
		return list;
		
	}
	
}
