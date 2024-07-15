package sec03.exam02._abstract;

// 추상 클래스
// 추상 메소드를 가질 수 있다
// new가 되지 않는다
// 
public abstract class Animal {

	String kind;
	
	void breathe() {
		System.out.println("숨숴 숨숴");
	}
	
	// 추상 메소드
	// 내가 구현하지 않고 나를 상속받은 애들이 구현하도록 유도
	abstract void sound();
	
}
