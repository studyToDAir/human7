package sec05.exam02._static;

public class Calc {

//	static double pi = 3.141592;
	static double pi;
	
	static {
		pi = 3.141592;
		System.out.println(123);
	}
	
	
	
	String color;
	
	// 지역변수 : 해당 블럭에서만 사용 가능, 
	//			  블럭이 끝나면 사라짐
	// 필드변수 : new가 된 순간(인스턴스)부터 사용 가능, 
	//			  클래스 소멸 시 사라짐
	// static 변수 == 클래스변수 == 공용변수
	//			  java 실행 시 사용 가능
	//			  java 종료 시 사라짐
	
	
	
	Calc(){
		System.out.println(pi);
		pi  = 3;
	}
	
	// static 에서는
	// static 밖에 못쓴다
	// this 못쓴다
	static int test() {
		System.out.println(pi);
//		this.color = "흰색";
//		color = "흰색";
//		test2();
		return 1;
	}
	
	// static이 아닌것은
	// static을 마음대로 사용할 수 있다
	int test2() {
		test();
		return 1;
	}
	
}
