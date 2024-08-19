package org.zerock.w1.cookie;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie/set")
public class SetCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		
		// 만료일이 있는 쿠키
		// 브라우저 자체 DB(SQLite)또는 파일로 저장
		Cookie c = new Cookie("name", "value");
		c.setMaxAge(24*60*60);	// 초단위
//		c.setMaxAge(10);	// 초단위
		response.addCookie(c);
		
		Cookie c2 = new Cookie("name2", "value2");
		// 세션 쿠키 : 만료일이 없는 쿠키
		// setMaxAge를 설정하지 않거나
		// 음수를 넣어서 만든다.
		// 이러면 브라우저 메모리에만 저장된다.
		// 즉, 브라우저의 모든 탭을 끄면 사라짐
		c2.setMaxAge(-1);
		response.addCookie(c2);
		
		String value = "안보여줌";
		value = URLEncoder.encode(value, "utf-8");
		Cookie c3 = new Cookie("name3", value);
		response.addCookie(c3);
	}

}
