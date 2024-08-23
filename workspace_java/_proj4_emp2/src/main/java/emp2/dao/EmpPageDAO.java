package emp2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import emp2.dto.EmpDTO;

public class EmpPageDAO {

	public List selectEmpPage(int start, int end) {
		List list = new ArrayList();
		
		try {
			// DB 접속
			Context ctx = new InitialContext();
			DataSource dataSource = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			Connection con = dataSource.getConnection();

			// SQL 준비
			String 	query =  " select * ";
		            query += " from ( ";
		            query += "    select lv, rownum rnum, empno, ename, job, hiredate ";
		            query += "    from ( ";

			        query += "  	with emp_recu (lv, empno, ename, mgr, job, hiredate) as (";
			        query += "  	    select ";
			        query += "  	        1 as lv,";
			        query += "  	        empno, ename, mgr, job, hiredate ";
			        query += "  	    from emp           ";
			        query += "  	    where mgr is null  ";
			        query += "  	    ";
			        query += "  	    union all";
			        query += "  	    ";
			        query += "  	    select";
			        query += "  	        er.lv + 1 as lv,";
			        query += "  	        e.empno, lpad(' ', 2*er.lv)||e.ename, e.mgr, e.job, e.hiredate";
			        query += "  	    from emp_recu er";
			        query += "  	    left outer join emp e on er.empno = e.mgr";
			        query += "  	    where e.mgr is not null";
			        query += "  	)";
			        query += "  	search depth first by empno desc set sort_empno_desc";
			        query += "  	select * from emp_recu";
			        query += "  	order by sort_empno_desc";
		            
		            query += "    ) ";
		            query += " ) ";
		            query += " where rnum >= ? and rnum <= ?";
            
            PreparedStatement ps = new LoggableStatement(con, query);
			ps.setInt(1, start);
			ps.setInt(2, end);
			
			System.out.println( ( (LoggableStatement)ps ).getQueryString() );
			
			// SQL 실행 및 결과 확보
			ResultSet rs = ps.executeQuery();
			while( rs.next() ) {
				EmpDTO empDTO = new EmpDTO();
				
				// 이번 줄에서 empno 컬럼의 값을 int로 형변환해서 가져옴
				int empno = rs.getInt("empno");
				empDTO.setEmpno(empno);
				
				String ename = rs.getString("ename");
				empDTO.setEname(ename);
				
				empDTO.setJob( rs.getString("job") );
				empDTO.setHireDate( rs.getDate("hiredate") );
				
				empDTO.setRnum( rs.getInt("rnum") );
				empDTO.setLv( rs.getInt("lv") );
				
				list.add(empDTO);
			}
			
			rs.close();
			ps.close();
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public int totalEmpPage() {
		int result = -1;
		
		try {
			// DB 접속
			Context ctx = new InitialContext();
			DataSource dataSource = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			Connection con = dataSource.getConnection();

			// SQL 준비
			String 	query =  " select count(*) cnt ";
		            query += " from ( ";
		            query += "    select rownum rnum, empno, ename, job, hiredate ";
		            query += "    from ( ";
		
		
			        query += "  	with emp_recu (lv, empno, ename, mgr, job, hiredate) as (";
			        query += "  	    select ";
			        query += "  	        1 as lv,";
			        query += "  	        empno, ename, mgr, job, hiredate ";
			        query += "  	    from emp           ";
			        query += "  	    where mgr is null  ";
			        query += "  	    ";
			        query += "  	    union all";
			        query += "  	    ";
			        query += "  	    select";
			        query += "  	        er.lv + 1 as lv,";
			        query += "  	        e.empno, lpad(' ', 2*er.lv)||e.ename, e.mgr, e.job, e.hiredate";
			        query += "  	    from emp_recu er";
			        query += "  	    left outer join emp e on er.empno = e.mgr";
			        query += "  	    where e.mgr is not null";
			        query += "  	)";
			        query += "  	search depth first by empno desc set sort_empno_desc";
			        query += "  	select * from emp_recu";
			        query += "  	order by sort_empno_desc";
		            
		            query += "    ) ";
		            query += " ) ";
            
            PreparedStatement ps = new LoggableStatement(con, query);
			
			System.out.println( ( (LoggableStatement)ps ).getQueryString() );
			
			// SQL 실행 및 결과 확보
			ResultSet rs = ps.executeQuery();
			while( rs.next() ) {
				result = rs.getInt("cnt");
			}
			
			rs.close();
			ps.close();
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	
}
