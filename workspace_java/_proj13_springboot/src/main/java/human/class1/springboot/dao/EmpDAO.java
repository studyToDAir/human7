package human.class1.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmpDAO {

	public List selectEmp();
	
}
