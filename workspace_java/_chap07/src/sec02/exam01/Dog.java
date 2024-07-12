package sec02.exam01;

public class Dog extends Animal{

	@Override
	void sound() {
		System.out.println("R R R R R");
	}
	
	void walk() {
		System.out.println("강아지 산책");
	}
}
