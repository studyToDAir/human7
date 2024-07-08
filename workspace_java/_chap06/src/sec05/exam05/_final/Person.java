package sec05.exam05._final;

public class Person {

	// final이 붙은 변수는 변경할 수 없다
	final String nation = "Korea";
	
	// final로 선언하는 동시에 초기화하지 않은 경우
	// 생성자에서 딱 한번 값을 초기화 할 수 있다
	final String ssn;
	
	Person(){
		ssn = "1234";
	}
	
	
	void test() {
//		nation = "USA";
		System.out.println(Math.PI);
	}
	
}
