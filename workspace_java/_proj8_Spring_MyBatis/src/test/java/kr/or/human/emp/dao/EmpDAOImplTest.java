package kr.or.human.emp.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import kr.or.human.emp.dto.EmpDTO;

@RunWith(SpringJUnit4ClassRunner.class) // 컨테이너 생성
@WebAppConfiguration // 다이나믹 웹 설정
@ContextConfiguration( // 사용할 bean들과 scan할 패키지 로딩
  locations = {
		  "file:src\\main\\webapp\\WEB-INF\\spring\\mybatis.xml",
		  "file:src\\main\\webapp\\WEB-INF\\spring\\appServlet\\servlet-context.xml"
  })
public class EmpDAOImplTest {

	@Autowired
	SqlSession sqlSession;
	
	@Test
	public void testSelectEmpOne() {
//		fail("Not yet implemented");
		
		int empno = 7788;
		
		EmpDTO empDTO = null;
		empDTO = sqlSession.selectOne("mapper.emp.selectEmpOne", empno);
		
		System.out.println(empDTO.getEname());
		/*
		assertEquals(null, null);	// 첫번째와 두번째가 같은가?
		assertTrue(true);			// 참인가?
		assertNotNull(null);		// null이 아닌가?
		*/
		
		assertEquals(empDTO.getEname(), "ScoTt51");	// 첫번째와 두번째가 같은가?
		assertTrue(empDTO.getEmpno() == 7788);
	}

}
