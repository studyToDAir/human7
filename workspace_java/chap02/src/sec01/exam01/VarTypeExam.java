package sec01.exam01;

public class VarTypeExam {

	public static void main(String[] args) {

		byte b = 127;
//		b = 128;
		
		char c = 97;
		System.out.println(c);
		c = 97 + 5;
		c = 'c' + 5; // 'h'
		System.out.println(c);
		char c1 = 'a';	// 문자 하나만 저장하는 용도, 홀따옴표'로 감싼다
		
		long balance = 3000000000L; // 명확하게 long으로 지정하려면 
									// 숫자 뒤에 L 또는 l을 붙여준다
//		byte b21 = 1L;
		
		String s = "문\t자\n열";
		System.out.println(s);
		s = "문문\t자";
		System.out.println(s);
		
		float f = 0.1234567890123456789F;
		// 소수점 7번째 자리까지 정확함
		System.out.println(f);
		double d = 0.1234567890123456789;
		// 소수점 16번째 자리까지 정확함
		System.out.println(d);
		
		boolean b1 = true;
		boolean b2 = false;  
		
		
	}

}
