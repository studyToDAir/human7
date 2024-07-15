package quiz.server;

import java.util.ArrayList;

public class NaverController {

	NaverService naverService;
	
	NaverController(){
		this.naverService = new NaverService();
	}
//	void setNaverService(NaverService naverService){
//		this.naverService = naverService;
//	}
	
	String doGet(){
		return naverService.getEmp();
	}
}
