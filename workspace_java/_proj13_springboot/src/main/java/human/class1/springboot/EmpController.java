package human.class1.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import human.class1.springboot.dao.EmpDAO;

@Controller
public class EmpController {
	@Autowired
	EmpDAO empDAO;

	@RequestMapping("/list")
	public String list(Model model) {
		
		List list = empDAO.selectEmp();
		model.addAttribute("msg", "hello world");
		model.addAttribute("list", list);
		
		return "list";
		
	}
	
}
