package emp2.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp2.dto.EmpDTO;
import emp2.service.EmpService;

@WebServlet("/join")
public class EmpInsertConroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/join doGet 실행");
		
		request
			.getRequestDispatcher("/WEB-INF/views/empInsert.jsp")
			.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/join doPost 실행");
		
		// 전달인자 받기
		String empno = request.getParameter("empno");
		String ename = request.getParameter("ename");
		String sal = request.getParameter("sal");
		String deptno = request.getParameter("deptno");
		
		// service로 전달하기 쉽게하기 위해서
		// 전달인자를 DTO에 담기
		EmpDTO dto = new EmpDTO();
		dto.setEmpno(Integer.parseInt(empno));
		dto.setEname(ename);
		dto.setSal(Integer.parseInt(sal));
		dto.setDeptno(Integer.parseInt(deptno));
		
		// DTO를 service로 보내서 결과 받기
		EmpService empService = new EmpService();
		int result = empService.joinEmp(dto);
		System.out.println("insert 결과 : "+ result);
		
		// 리스트 페이지로 보내기
		// sendRedirect
		//		* 주소가 바뀐다는 특징이 있음
		//		브라우저에게 어디로 가라고 하는 명령을 내림
		// 		브라우저가 어기로 갑니다. 그래서 주소가 바뀌죠
		//		* request가 이어지지 않음
		response.sendRedirect("emp");
	}

}
