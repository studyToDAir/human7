package expert;

public class ForExam {

	public static void main(String[] args) {
/*
//		for(    ;    ;    ) {
//			
//		}
		
		int a = 1;	// a를 초기화 했다
//		int c = 0;
		
		// 딱 세번만 실행하고 시펑
		// 첫번째 실행
		a = a + 10;
		System.out.println(a);
//		c++;
		
//		if(c <= 3) {
		if(a <= 31) {
			// 첫번째와 같은 코드를 두번째 실행
			a = a + 10;
			System.out.println(a);
//			c++;
		}
		
		// 계속 같은 코드를 세번째 실행
//		if(c <= 3) {
		if(a <= 31) {
			// 첫번째와 같은 코드를 두번째 실행
			a = a + 10;
			System.out.println(a);
//			c++;
		}
//		if(c <= 3) {
		if(a <= 31) {
			// 첫번째와 같은 코드를 두번째 실행
			a = a + 10;
			System.out.println(a);
//			c++; // 4
		}
//		if(c <= 3) {
		if(a <= 31) {
			// 첫번째와 같은 코드를 두번째 실행
			a = a + 10;
			System.out.println(a);
//			c++;
		}
		
		// 첫번째 장소 : 초기화식 : 처음에 딱 한번만 실행됨
		// 두번째 장소 : 조건식 : 거짓이 아닐때 반복 시키는 조건
		//						: 처음부터 조건이 맞아야 실행됨
		// 세번째 장소 : 증감식 : 사실은 그냥 실행문 끝에
		//						: 무조건 실행해야 하는 코드를 넣는 곳
//		int b = 1;
//		for(  ;  b <= 31   ;     ) { }
		*/
//		for( int b = 1 ;  b <= 31   ;  System.out.println(123)   ) {
		
		for( int b = 2 ;  b <= 31   ; b = b + 10   ) {
			System.out.println(b);
//			b++;
//			++b;
		}
//		for(int b = 1;     ;     ) {
//			
//		}
		int i=0;
		for(    ; i<3; i++) {
			
			System.out.println(i);
		}
	}

}
