package emp2.service;

import java.util.List;

import emp2.dao.EmpDAO;

public class EmpService {

	public List getEmp(String a) {
		EmpDAO empDAO = new EmpDAO();
		
		List result = empDAO.selectEmp(a);
		
		return result;
	}
	
}
