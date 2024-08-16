package emp2.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp2.service.EmpService;

@WebServlet("/emp")
public class EmpController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("/emp doGet 실행");

		String empno2 = request.getParameter("empno");
		System.out.println("empno : " + empno2);

		EmpService empService = new EmpService();
		List list = empService.getEmp(empno2);

		// request 자체는 브라우저에서 서버로 요청한 모든 정보가 있는 곳
		// 거기에다 우리 list도 담아 두자
		request.setAttribute("list", list);

		// # JSP로 forward로 보내주기
		// forward 방식은 request도 전달해줌
		// 그래서 list를 request에 넣었던 것임!
		request.getRequestDispatcher("/WEB-INF/views/empList.jsp").forward(request, response);
	}

}
