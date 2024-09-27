package human.class1.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
//@RestController // @Controller + @ResponseBody
@RequestMapping("/human")
public class RestController {

	@RequestMapping("/test1")
	public int test1() {
		return 100;
	}

	@RequestMapping("/test2")
	public String test2() {
		return "ajax";
	}
	
	

}
