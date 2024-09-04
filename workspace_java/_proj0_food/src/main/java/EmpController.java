
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/emp2")
public class EmpController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8;");

		EmpService empService = new EmpService();
		List list = empService.getEmp0();

		System.out.println(list);

		request.setAttribute("empList", list);
		List list2 = (List) request.getAttribute("empList");

		// jsp로 보내기
		request.getRequestDispatcher("/emp.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("/emp2 doPost 실행");
		
		String empno = request.getParameter("empno");
		System.out.println("empno : "+ empno);

		String ename = request.getParameter("ename");
		System.out.println("ename : "+ ename);
		
		EmpService empService = new EmpService();
		int no = Integer.parseInt(empno);
		int result = empService.modifyEmp0(ename, no);
		System.out.println("수정 결과 : "+ result);
		
		response.sendRedirect("emp2");
	}

}
