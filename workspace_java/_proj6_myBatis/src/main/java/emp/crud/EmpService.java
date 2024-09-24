package emp.crud;

public class EmpService {
	
	iDAO dao;
	
	EmpService(iDAO dao){
		this.dao = dao;
	}
	void setDao(iDAO dao){
		this.dao = dao;
	}
	void test() {
//		dao = new emp.crud.EmpDAO();
//		dao = new emp.crud.EmpDAO2();
		
		dao.getInstance();
	}
	void test2() {
		
		dao.getInstance();
	}
}
