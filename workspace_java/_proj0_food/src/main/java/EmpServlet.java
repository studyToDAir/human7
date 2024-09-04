

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

@WebServlet("/emp")
public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8;");
		
		List list = new ArrayList();
		
		// DB 조회
		try {
			
			// DB 접속
			Context ctx = new InitialContext();
			DataSource dataSource = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			Connection con = dataSource.getConnection();
			
			// SQL 준비
			// sql문만 수정했음
			String query = "select * from emp0";
			
			PreparedStatement ps = con.prepareStatement(query);
			
			
			// SQL 실행
			// select  : executeQuery(), 리턴: ResultSet
			// 그 외 : executeUpdate(),  리턴 : int
			ResultSet rs = ps.executeQuery();
			// 여기까지의 rs는 전체 데이터
			
//			rs.next(); // 다음줄이 있는가? true/false
//			// 여기서부터 rs는 해당 줄의 데이터
//			
//			// 해당 줄에서 
//			// 전달인자인 컬럼의 값을 
//			// 특정한 타입으로 리턴
//			// 		아랫줄에서는 ename 컬럼의 값을
//			//		String 타입으로 리턴
//			String ename = rs.getString("ename");
//			System.out.println("ename : "+ ename);
			
			
			while(rs.next()) {
				String ename = rs.getString("ename");
				
				list.add(ename);
				
				System.out.println("ename : "+ ename);
				response.getWriter().write("ename : "+ ename +"<br>");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(list);
		
		request.setAttribute("empList", list);
		List list2 = (List)request.getAttribute("empList");
		
		// jsp로 보내기
		request.getRequestDispatcher("/emp.jsp").forward(request, response);
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
