import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class EmpDAO {

	// DB부분만 빼서 메소드로 만들기
	List selectEmp0() {
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
			// select : executeQuery(), 리턴: ResultSet
			// 그 외 : executeUpdate(), 리턴 : int
			ResultSet rs = ps.executeQuery();
			// 여기까지의 rs는 전체 데이터

//						rs.next(); // 다음줄이 있는가? true/false
//						// 여기서부터 rs는 해당 줄의 데이터
//						
//						// 해당 줄에서 
//						// 전달인자인 컬럼의 값을 
//						// 특정한 타입으로 리턴
//						// 		아랫줄에서는 ename 컬럼의 값을
//						//		String 타입으로 리턴
//						String ename = rs.getString("ename");
//						System.out.println("ename : "+ ename);

			while (rs.next()) {
				String ename = rs.getString("ename");

				list.add(ename);

				System.out.println("ename : " + ename);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}
	
	
	int updateEmp0(String ename, int empno) {
		int result = -1;
		
		// DB 조회
		try {
			
			// DB 접속
			Context ctx = new InitialContext();
			DataSource dataSource = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			Connection con = dataSource.getConnection();
			
			// SQL 준비
			// sql문만 수정했음
			String  query  = " update emp0 ";
					query += " set ename = ? ";
					query += " where empno = ? ";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, ename);
			ps.setInt(2, empno);
			
			// SQL 실행
			// select : executeQuery(), 리턴: ResultSet
			// 그 외 : executeUpdate(), 리턴 : int
			result = ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
