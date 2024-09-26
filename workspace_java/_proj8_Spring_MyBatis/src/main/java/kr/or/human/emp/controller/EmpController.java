package kr.or.human.emp.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.or.human.HomeController;
import kr.or.human.emp.dto.EmpDTO;
import kr.or.human.emp.service.EmpService;

@Controller
public class EmpController {

	private static final Logger logger = LoggerFactory.getLogger(EmpController.class);
	
	@Autowired
	EmpService empService;
	
	@RequestMapping("/member")
	public String listEmp(Model model) {
		List<EmpDTO> list = empService.listEmp();
		model.addAttribute("empList", list);
		
//		System.out.println("list.size() : "+ list.size());
		logger.debug("debug list.size() : "+ list.size());
		logger.info("info list.size() : "+ list.size());
		logger.warn("warn list.size() : "+ list.size());
		logger.error("error list.size() : "+ list.size());
		
		return "emp";
	}
	
	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String join(Model model) {
		return "empJoin";
	}
	
	@RequestMapping(value="/join", method=RequestMethod.POST)
//	public String join2(EmpDTO empDTO, Model model) {
	public String join2(@ModelAttribute("empDTO") EmpDTO empDTO, Model model) {
		int result = empService.joinEmp(empDTO);
		System.out.println("회원 가입 결과 : "+ result);
		
//		listEmp(model);
//		return "forward:/member";
		return "redirect:/member";
	}
	
	@RequestMapping(value="/detail", method=RequestMethod.GET)
//	public String detail(int empno) {
	public String detail(@RequestParam("empno") int empno, Model model) {
		
		EmpDTO empDTO = empService.detailEmp(empno);
		
		model.addAttribute("empDTO", empDTO);
		model.addAttribute("cmd", "detail");
		
		return "empJoin";
	}
	
	@RequestMapping(value="/edit", method=RequestMethod.GET)
//	public String detail(int empno) {
	public String edit(@RequestParam("empno") int empno, Model model) {
		
		EmpDTO empDTO = empService.detailEmp(empno);
		
		model.addAttribute("empDTO", empDTO);
		model.addAttribute("cmd", "edit");
		
		return "empJoin";
	}
	@RequestMapping(value="/edit", method=RequestMethod.POST)
	public String edit2(EmpDTO empDTO, Model model) {
		
		int result = empService.modifyEmp(empDTO);
		System.out.println("회원 수정 결과 : "+ result);
		
		return "redirect:/member";
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public String delete(EmpDTO empDTO, Model model) {
		
		int result = empService.deleteEmp(empDTO);
		System.out.println("회원 삭제 결과 : "+ result);
		
		return "redirect:/member";
	}
}
