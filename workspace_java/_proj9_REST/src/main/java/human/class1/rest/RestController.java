package human.class1.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestController {

	/*
	 * "/rest/ajax.view" <<<<
	 * "/rest/ajax"
	 */
	@RequestMapping(value="/ajax.view", method=RequestMethod.GET)
	public String ajaxView() {
		return "ajax";
	}
	
	
	// @RequestBody : post로 보낸 json을 처리
	@RequestMapping(value="/ajax", method=RequestMethod.POST)
	public String ajax( 
			
			@RequestParam(value="ename", required=false)String ename,
			@ModelAttribute EmpDTO dto2,
			
			@RequestBody EmpDTO dto
	) {
		// json으로 보낸건 @RequestParam 또는 request.getParameter로 받을 수 없다
		System.out.println("ename : "+ ename);
		System.out.println("dto2 : "+ dto2);
		System.out.println("dto : "+ dto);
		
		return "ajax";
	}
	
	// @ResponseBody : 그냥 값이나 json으로 리턴해줌
	@RequestMapping(value="/ajax/string", method=RequestMethod.POST)
	@ResponseBody
	public String ajaxString( 
			@RequestBody EmpDTO dto
	) {

		System.out.println("dto : "+ dto);
		
		return "human";
	}
}





