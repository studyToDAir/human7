package human.class1.ajax.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import human.class1.ajax.dto.EmpDTO;
import human.class1.ajax.service.EmpService;

@Controller
public class EmpController {

	@Autowired
	EmpService empService;
	
	@RequestMapping("/listEmp")
	@ResponseBody
	public List listEmp() {
		List list = empService.listEmp();
		System.out.println("list.size() : "+ list.size());
		
		return list;
	}
	
	@RequestMapping("/emp")
	public String emp() {
		return "emp";
	}
	
	@RequestMapping("/deleteEmp")
	@ResponseBody
	public int deleteEmp(@RequestBody EmpDTO dto) {
		System.out.println(dto);
		int result = empService.deleteEmp(dto);
		System.out.println("삭제 결과 : "+ result);
		
		return result;
	}
}
