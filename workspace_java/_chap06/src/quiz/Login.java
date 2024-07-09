package quiz;

public class Login {

	String id;
	String pw;
	
	Login(String id, String pw){
		this.id = id;
		this.pw = pw;
	}
	
	/*
	 * 생성자로 id, pw를 받아서 저장해 놓음 (회원가입)
		login(아이디, 패스워드) 실행하면
		login메소드 안에서...
		만약 같으면 "메인페이지" 출력하고 true 돌려줌
		다르면 "로그인 화면으로 돌아감" 출력하고 false 돌려줌
	 */
	boolean login(String id, String pw) {
		boolean result = false;
		if(this.id.equals(id) && this.pw.equals(pw)) {
			System.out.println("메인페이지로 이동" );
			result = true;
		} else {
			System.out.println("로그인 화면으로 돌아감");
			result = false;
		}
		
		return result;
	}
}
