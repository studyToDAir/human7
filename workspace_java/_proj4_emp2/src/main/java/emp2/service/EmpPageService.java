package emp2.service;

import java.util.List;

import emp2.dao.EmpPageDAO;

public class EmpPageService {
	
	public List getEmpPage(String countPerPage, String page) {
		int count = Integer.parseInt(countPerPage);
		int pageNo = Integer.parseInt(page);
		
		int start = ((pageNo - 1) * count) + 1;
		int end = pageNo * count;
//		int end = start + count - 1;
		
		EmpPageDAO empPageDAO = new EmpPageDAO();
		List list = empPageDAO.selectEmpPage(start, end);
		return list;
	}

}
