package quiz.server;

public class WebServerExam {

	public static void main(String[] args) {

		// Naver 초기화
		Naver naver = new Naver();
		naver.setNaverController(new NaverController());
		
		// 웹서버 실행
		WebServer ws = new WebServer();
		String html = ws.run("get", naver);
		
		if(html == null) {
			System.out.println("404 page not found");
		} else {
			System.out.println(html);
		}
	}

}
