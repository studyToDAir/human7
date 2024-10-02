package human.class1.ajax.dao;

import java.util.List;

import human.class1.ajax.dto.EmpDTO;

public interface EmpDAO {

	List selectEmp();
	public int deleteEmp(EmpDTO dto);
}
