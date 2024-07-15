package quiz.server;

import java.util.ArrayList;

public class NaverService {

	NaverDAO naverDAO;
	NaverService(){
		this.naverDAO = new NaverDAO();
	}
//	void setNaverDAO(NaverDAO naverDAO) {
//		this.naverDAO = naverDAO;
//	}
	
	String getEmp(){
		System.out.println("서비스의 getEmp 실행");
		
		String html = "";
		html += "<div>\n\t";
		
		ArrayList list = naverDAO.selectEmp();
		String table = list.toString();	// ArrayList를 String으로 변환
		html += table;
		
		html += "\n</div>";
		
		
		return html;
	}
	
}
