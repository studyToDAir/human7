package sec04.exam04;

public class MemberJoin {
	
	/*
	 * 오버로딩
	 * 1. System.out.println처럼 전달인자를 신경쓰지 않게 하기 위함
	 * 2. 전달인자가 너무 많고 기본값을 입력하는 경우가 빈번할때
	 * 	  전달인자를 줄이는 목적으로도 사용함
	 */
	

	void join(String id, String pw, String address, int age, int gender) {
		System.out.println("아이디 : "+ id);
		System.out.println("비밀번호 : "+ pw);
		System.out.println("주소 : "+ address);
		System.out.println("나이 : "+ age);
		System.out.println("성별 : "+ gender);
	}

	void join(String id, String pw) {
		join(id, pw, null, -1, -1);
	}

}
