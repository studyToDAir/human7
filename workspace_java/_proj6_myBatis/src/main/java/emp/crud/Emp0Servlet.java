package emp.crud;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/emp0")
public class Emp0Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private boolean _DEBUG = true;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String cmd = request.getParameter("cmd");
		
		if(cmd == null) {
			EmpDAO empDAO = new EmpDAO();
			List<EmpDTO> empList = empDAO.selectEmp();
			request.setAttribute("empList", empList);
			
			request.getRequestDispatcher("/WEB-INF/views/emp.jsp").forward(request, response);

		} else if( "join".equals(cmd) ) {

			request.getRequestDispatcher("/WEB-INF/views/empJoin.jsp").forward(request, response);
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String strEmpno = request.getParameter("empno");
		String ename = request.getParameter("ename");
		String strHireDate = request.getParameter("hireDate");	// 2024-09-19
		
		try {
			int empno = Integer.parseInt(strEmpno);
			Date hireDate = Date.valueOf(strHireDate);
			
			EmpDTO empDTO = new EmpDTO();
			empDTO.setEmpno(empno);
			empDTO.setEname(ename);
			empDTO.setHireDate(hireDate);
			
			// insert 실행
			
			EmpDAO empDAO = new EmpDAO();
			int result = empDAO.insertEmp(empDTO);
			System.out.println("회원 가입 결과 : "+ result);
			
			response.sendRedirect("emp0");
			
		}catch (Exception e) {
			if(_DEBUG) {
				e.printStackTrace();
			}
		}
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
