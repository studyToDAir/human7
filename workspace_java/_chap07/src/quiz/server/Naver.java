package quiz.server;

public class Naver {

	NaverController naverController;
	
	Naver(){
		this.naverController = new NaverController();
	}
//	void setNaverController(NaverController naverController) {
//		this.naverController = naverController;
//	}
	
	String doService(String method) {
		
		String html = null;
		
		if("get".equals(method)) {
			html = this.naverController.doGet();
		}
		
		return html;
	}
	
}
