package emp2.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import emp2.dao.EmpPageDAO;

public class EmpPageService {
	
	public Map getEmpPage(String countPerPage, String page) {
		int count = Integer.parseInt(countPerPage);
		int pageNo = Integer.parseInt(page);
		
		int start = ((pageNo - 1) * count) + 1;
		int end = pageNo * count;
//		int end = start + count - 1;
		
		EmpPageDAO empPageDAO = new EmpPageDAO();
		List list = empPageDAO.selectEmpPage(start, end);
		
		int totalCount = empPageDAO.totalEmpPage();
		
		Map map = new HashMap();
		map.put("list", list);
		map.put("totalCount", totalCount);
		
		return map;
	}

}
