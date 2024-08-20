package org.zerock.w1.session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session/mypage")
public class MyPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8;");
		
		
		HttpSession session = request.getSession();
		Boolean isLogon = (Boolean)session.getAttribute("isLogon");
		if(isLogon == null) {
			response.sendRedirect(request.getContextPath() + "/cookie.jsp");
		}
		
		response.getWriter().println("여기는 로그인해야 들어올 수 있습니다<br>");
		response.getWriter().println("너의 레벨은 : "+ session.getAttribute("level"));
		
	}

}
