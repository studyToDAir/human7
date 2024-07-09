package quiz;

public class LoginExam {

	public static void main(String[] abc) {
		Login l1 = new Login("admin", "1234");
		
		boolean result = l1.login("test", "test");
		if(!result) {
			l1.login("admin", "1234");
		}
	}

}
