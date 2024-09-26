package kr.or.human.emp.service;

import java.util.List;

import kr.or.human.emp.dto.EmpDTO;

public interface EmpService {

	List<EmpDTO> listEmp();
	public int joinEmp(EmpDTO empDTO);
	public EmpDTO detailEmp(int empno);
	public int modifyEmp(EmpDTO empDTO);
	public int deleteEmp(EmpDTO empDTO);
	
}
