package expert;

public class IfExam {

	public static void main(String[] args) {

		int a = 10;
		boolean b = a < 5;
//		if(a > 5) {
		
		if(a < 5) {
			
			System.out.println(a + "은(는) 5보다 작습니다");
			
		} else if(a >= 5 && a < 15) {
			
			System.out.println(a + "은(는) 15보다 작습니다");
			
		} 
		else if(a < 25) {
			
			System.out.println(a + "은(는) 25보다 작습니다");
			
		}
		
		
		
		
		if(a < 5) {
			System.out.println(a + "은(는) 5보다 작습니다");
		}
		
		
		if(a >= 5 && a < 15) {
			System.out.println(a + "은(는) 15보다 작습니다");
		}
		
		
		if(a >= 15 && a < 25) {
			System.out.println(a + "은(는) 25보다 작습니다");
		}
		
		
		boolean a1 = true;
		boolean a2 = true;
		boolean a3 = false;
		
		// &&만 있는 경우 false가 나오면 그 뒤는 처다도 안본다
		System.out.println(  a1 && a3 && a2  );
//		String b1 = "치킨";
		String b1 = null;
		if(b1 != null) {
			System.out.println(123);
			
			if(b1.length() > 4) {
				System.out.println( b1 );
			}
			
		}
		
		if( b1 != null && b1.length() > 4) {
			System.out.println( b1 );
		}
		
		// ||는 true를 만나면 더이상 실행하지 않음
		System.out.println(  a1 || a3 || a2  );
		
		
		System.out.println(  (false || true) && true  );
		
//		if( 30 < a < 50 ) {
//		if( (3 < 4) < 5 ) {
//		if( true < 5 ) {
			
//		}
		if( 30 < a ) {
			if( a < 50 ) {
				System.out.println(12345);
			}
		}
		
		if( 30 < a && a < 50) {
			System.out.println(1234);
		}
		
//		7 % 3 == 1;
		
		double rand = Math.random();
//		double 답1 = rand * 100.0;
		// 0 <= rand < 100.0
//		(int)답1;
//		System.out.println( (int)-3.5 );
		
		
		// 5 ~ 7까지 렌덤으로 뽑고 싶을때
		// 5 + (0 ~ 2)
//		int a02 = (int) rand * 3;
//		int a02 = (int)(rand * 3);
//		int 결과 = a02 + 5;
		int 결과 = (int)(Math.random() * 3) + 5;
		
		int b02 = (int)(Math.random() * 6849684) % 3; // 0 ~ 9999
		
		
//		3,2,2,1
		
		
		
		// 내 주머니에 1만원있음
		// 술을 마시고 싶어요
		// 소주 : 5000
		// 과자 : 2000
		// 컵라면 : 1500
		// 족발 : 35000
		
		
		
	}

}
