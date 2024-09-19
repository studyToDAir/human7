package emp.crud;

import java.io.Reader;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class EmpDAO {

	private  SqlSessionFactory sqlMapper = null;
	
	public  SqlSessionFactory getInstance() {
		if(sqlMapper == null) {
			try {
				String res = "mybatis/SqlMapConfig.xml";
				Reader reader = Resources.getResourceAsReader(res);
				
				SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
				sqlMapper = ssfb.build(reader);
				
				reader.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return sqlMapper;
	}

	public List<EmpDTO> selectEmp(){
		List<EmpDTO> empList = null;
		
		// SqlMapConfig.xml을 읽어옴
		sqlMapper = getInstance();
		if(sqlMapper != null) {
			// DB 접속
			SqlSession sqlSession = sqlMapper.openSession();
			
			empList = sqlSession.selectList("mapper.emp.selectAllEmp");
			System.out.println("empList.size : " + empList.size());
		} else {
			System.out.println("DB 접속 실패");
		}
		
		return empList;
	}
	
	
	public int insertEmp(EmpDTO empDTO){
		int result = -1;
		
		// SqlMapConfig.xml을 읽어옴
		sqlMapper = getInstance();
		if(sqlMapper != null) {
			// DB 접속
			// 자동 커밋 : sqlMapper.openSession()
			// 수동 커밋 : sqlMapper.openSession(false)
			SqlSession sqlSession = sqlMapper.openSession(true);
			
			try {
				result = sqlSession.insert("mapper.emp.param.insertEmp", empDTO);
			} catch (Exception e) {
				sqlSession.rollback();
			}
			
		} else {
			System.out.println("DB 접속 실패");
		}
		
		return result;
	}
	
}
