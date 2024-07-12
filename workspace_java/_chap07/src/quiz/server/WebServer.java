package quiz.server;

public class WebServer {

	String run(String method, Naver portal) {
		return portal.doService(method);
	}
	
}
