package sec04.exam04;

public class MemberJoinExam {

	public static void main(String[] a) {
		// 아이디, 비밀번호는 필수입니다.
		// 주소를 입력하기 싫으면 null을 넣어주세요
		// 나이를 입력하기 싫으면 -1을 넣어주세요
		// 성별을 입력하기 싫으면 -1을 넣어주세욧!
		MemberJoin member = new MemberJoin();
		
		member.join("id", "pw", "주소", 20, 1);
		
		member.join("아이디", "1234", null, -1, -1);
		member.join("아이디2", "qwerty", null, -1, -1);
		
		member.join("아이디3", "abcd");
	}
	
}
