package org.zerock.w1.todo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.zerock.w1.todo.dto.TodoDTO;

public class TodoDAO {
	
	private Connection getConnection() {
		
		Connection con = null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@125.181.132.133:51521:xe";
		String user = "scott2_0";
		String password = "tiger";
		
		try {
			// Class.forName : String을 이용해서 class를 생성한다
			// 드라이버 : 서로 다른 것들(java, oracle)이 소통할 수 있게 해주는 것
			// 오라클 드라이버 로딩
			Class.forName(driver);
			
			// DB 접속
			con = DriverManager.getConnection(url, user, password);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}

	public List<TodoDTO> selectAll() {
		List<TodoDTO> list = new ArrayList<TodoDTO>();
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@125.181.132.133:51521:xe";
		String user = "scott2_0";
		String password = "tiger";
		
		try {
			// Class.forName : String을 이용해서 class를 생성한다
			// 드라이버 : 서로 다른 것들(java, oracle)이 소통할 수 있게 해주는 것
			// 오라클 드라이버 로딩
			Class.forName(driver);
			
			// DB 접속
			Connection con = DriverManager.getConnection(url, user, password);
			
			// SQL 준비
			String query = "select * from tbl_todo";
			//		String을 오라클용으로 컴파일
			PreparedStatement ps = con.prepareStatement(query);
			
			// SQL 실행 및 결과 확보
			//		ResultSet에 모든 select 결과가 들어있다
			//		executeQuery : select 전용, ResultSet을 반환함
			//		executeUpdate : select 외 모든것, int를 반환함
			ResultSet rs = ps.executeQuery();
			
			
			// 결과 활용
			// rs.next() 다음줄이 있는가?
			// next가 실행된 이후에는 rs가 한 줄로 바뀜
			while( rs.next() ) {
				System.out.println(1);
				// 전달인자로 컬럼명을 적고 그 내용을 형변환 해서 가지고 온다
				int tno = rs.getInt("tno");
				String title = rs.getString("title");
				String finished = rs.getString("finished");

//				java.sql.Date 
				LocalDate dueDate = rs.getDate("duedate").toLocalDate();
				
				TodoDTO dto = new TodoDTO();
				dto.setTno(tno);
				dto.setTitle(title);
				dto.setDueDate(dueDate);
				dto.setFinished( finished.equals("Y") ? true : false );
				
				
				list.add(dto);
			}
			
			rs.close();
			ps.close();
			con.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return list;
	}
	
	public TodoDTO selectOne(int tno) {
		TodoDTO todoDTO = null;
		
		// DB 접속
		Connection con = getConnection();
		
		// 접속이 안되었다면 null을 바로 리턴한다
		if(con == null) return null;
		
		try {
			
			// sql 준비
			String sql = "select * from tbl_todo where tno = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			// ?를 값으로 채워줌
			// 첫번째 전달인자는 ?의 순서
			// 만약에 글씨라면 setString, 알아서 '로 감싸준다
			ps.setInt(1, tno);
			
			// sql 실행 및 결과 확보
			ResultSet rs = ps.executeQuery();
			
			// 결과 활용
			if( rs.next() ) {
				todoDTO = new TodoDTO();
				todoDTO.setTno( 	 rs.getInt("tno") );
				todoDTO.setTitle( 	 rs.getString("title") );
				todoDTO.setDueDate(  rs.getDate("duedate").toLocalDate() );
				todoDTO.setFinished( rs.getString("finished").equals("Y") ? true : false);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return todoDTO;
	}
	
	
}








