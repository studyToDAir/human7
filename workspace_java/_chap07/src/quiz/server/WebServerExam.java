package quiz.server;

public class WebServerExam {

	public static void main(String[] args) {

		// 웹서버 실행
		WebServer ws = new WebServer();
		String html = ws.run("get", new Naver());
		
		if(html == null) {
			System.out.println();
		}
		System.out.println(html);
	}

}
