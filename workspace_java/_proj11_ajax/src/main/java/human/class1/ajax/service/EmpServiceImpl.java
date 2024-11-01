package human.class1.ajax.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import human.class1.ajax.dao.EmpDAO;
import human.class1.ajax.dto.EmpDTO;

@Service
public class EmpServiceImpl implements EmpService{

	@Autowired
	EmpDAO empDAO;
	
	@Override
	public List listEmp() {
		
//		EmpDAO empDAO = (EmpDAO)new EmpDAOImpl();
		List<EmpDTO> list = empDAO.selectEmp();
		
		return list;
	}

	@Override
	public int deleteEmp(EmpDTO dto) {
		
		int result = empDAO.deleteEmp(dto);
		
		return result;
	}
}
