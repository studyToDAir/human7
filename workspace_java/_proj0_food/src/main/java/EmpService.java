import java.util.List;

public class EmpService {

	List getEmp0() {
		EmpDAO empDAO = new EmpDAO();
		List list = empDAO.selectEmp0();
		
		return list;
	}
	
}
