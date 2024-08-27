package emp2.service;

import java.util.List;

import emp2.dao.EmpDAO;
import emp2.dto.EmpDTO;

public class EmpService {
	
	EmpDAO empDAO = new EmpDAO();
	
	public List getEmp(String a) {
		EmpDAO empDAO = new EmpDAO();
		
		List result = empDAO.selectEmp(a);
		
		return result;
	}
	
	public int joinEmp(EmpDTO dto) {
		int insertCount = this.empDAO.insertEmp(dto);
		return insertCount;
	}
	
	// 전달받은 EmpDTO를
	// DAO로 보내고
	// DAO가 return한 EmpDTO를 반환한다
	public EmpDTO loginCheck(EmpDTO empDTO) {
		EmpDAO empDAO = new EmpDAO();
		EmpDTO resultDTO = empDAO.selectLogin(empDTO);
		return resultDTO;
	}
}
