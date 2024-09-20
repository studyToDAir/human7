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
		EmpDAO empDAO = new EmpDAO();
		
		if(cmd == null) {
//			List<EmpDTO> empList = empDAO.selectEmp();
			
			EmpDTO empDTO = new EmpDTO();
			
			String keyword = request.getParameter("keyword");
			String searchType = request.getParameter("searchType");
			String[] checks = request.getParameterValues("check");
			
			empDTO.setKeyword(keyword);
			empDTO.setSearchType(searchType);
			empDTO.setChecks(checks);
			
			List<EmpDTO> empList = empDAO.selectEmpList(empDTO);
			request.setAttribute("empList", empList);
			request.setAttribute("keyword", keyword);
			request.setAttribute("searchType", searchType);
			
			request.getRequestDispatcher("/WEB-INF/views/emp.jsp").forward(request, response);

		} else if( "join".equals(cmd) ) {

			request.getRequestDispatcher("/WEB-INF/views/empJoin.jsp").forward(request, response);
		
		} else if( "detail".equals(cmd) ) {
			
			// pk인 empno 확보
			String strEmpno = request.getParameter("empno");
			
			try {
				int empno = Integer.parseInt(strEmpno);
				
				// 특정 회원 정보 조회
				EmpDTO empDTO = empDAO.selectEmpOne(empno);
				
				// 정보를 request에 담아서
				request.setAttribute("empDTO", empDTO);
				request.setAttribute("cmd", "detail");
				
				// 상세 정보 페이지로 이동
				request.getRequestDispatcher("/WEB-INF/views/empJoin.jsp").forward(request, response);
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		} else if( "edit".equals(cmd) ) {

			// pk인 empno 확보
			String strEmpno = request.getParameter("empno");
			
			try {
				int empno = Integer.parseInt(strEmpno);
				
				// 특정 회원 정보 조회
				EmpDTO empDTO = empDAO.selectEmpOne(empno);
				
				// 정보를 request에 담아서
				request.setAttribute("empDTO", empDTO);
				request.setAttribute("cmd", cmd);
				
				// 상세 정보 페이지로 이동
				request.getRequestDispatcher("/WEB-INF/views/empJoin.jsp").forward(request, response);
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String strEmpno = request.getParameter("empno");
		String ename = request.getParameter("ename");
		String strHireDate = request.getParameter("hireDate");	// 2024-09-19
		
		try {
			int empno = Integer.parseInt(strEmpno);
			
			Date hireDate = null;
			if(strHireDate != null) {
				hireDate = Date.valueOf(strHireDate);
			}
			
			EmpDTO empDTO = new EmpDTO();
			empDTO.setEmpno(empno);
			empDTO.setEname(ename);
			empDTO.setHireDate(hireDate);
			
			// insert 실행
			
			EmpDAO empDAO = new EmpDAO();
			
			String cmd = request.getParameter("cmd");
			if(cmd == null) {
				int result = empDAO.insertEmp(empDTO);
				System.out.println("회원 가입 결과 : "+ result);
			} else if( "edit".equals(cmd) ) {
				// 업데이트
				int result = empDAO.updateEmp(empDTO);
				System.out.println("회원 가입 결과 : "+ result);
			} else if( "delete".equals(cmd) ) {
				// 삭제
				int result = empDAO.deleteEmp(empDTO);
				System.out.println("회원 삭제 결과 : "+ result);
			}
			
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
