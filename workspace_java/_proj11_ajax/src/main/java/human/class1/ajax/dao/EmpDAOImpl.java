package human.class1.ajax.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDAOImpl implements EmpDAO{
	
	@Autowired
	SqlSession sqlSession;

	@Override
	public List selectEmp() {
		List list = sqlSession.selectList("mapper.emp.selectEmp");
		return list;
	}

}
