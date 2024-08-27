package emp2.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import emp2.dto.EmpDTO;
import emp2.service.EmpService;

@WebServlet("/login")
public class EmpLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// id, pw를 받아서
	// db 조회 후
	// 회원이면 list 페이지로
	// 회원이 아니면 로그인 페이지로
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String ename = request.getParameter("id");
			String empno = request.getParameter("pw");
			
			EmpDTO empDTO = new EmpDTO();
			empDTO.setEname( ename );
			empDTO.setEmpno( Integer.parseInt(empno) );
			
			EmpService empService = new EmpService();
			EmpDTO resultDTO = empService.loginCheck( empDTO );
			
			// 세션에 넣고
			if(resultDTO != null) {
				HttpSession session = request.getSession();
				session.setAttribute("loginDTO", resultDTO);
				
				// list 페이지로 sendRedirect
				response.sendRedirect(request.getContextPath() +"/emp");
			} else {
				// login 페이지로 sendRedirect
				response.sendRedirect(request.getContextPath() +"/login.jsp?code=LO01");
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
