import java.util.List;

public class EmpService {

	List getEmp0() {
		EmpDAO empDAO = new EmpDAO();
		List list = empDAO.selectEmp0();
		
		return list;
	}
	
	int modifyEmp0(String ename, int empno){
		EmpDAO empDAO = new EmpDAO();
		int result = empDAO.updateEmp0(ename, empno);
		return result;
	}
	
}
