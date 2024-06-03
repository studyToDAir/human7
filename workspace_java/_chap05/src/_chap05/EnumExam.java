package _chap05;

public class EnumExam {

	public static void main(String[] args) {

		System.out.println(LoginResult.SUCCESS);
		System.out.println(LoginResult.FAIL);
		
		LoginResult login;
		login = LoginResult.SUCCESS;
		
		// 내가 login에 어떤 값을 넣었는지 모를때
		if( login == LoginResult.SUCCESS ) {
			System.out.println("성공");
		} else if ( login == LoginResult.FAIL ) {
			System.out.println("실패");
		}
	}

}
