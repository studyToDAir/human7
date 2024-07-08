package sec05.exam01._this;

public class Car {

	String model;
	int speed;
	Car(){}
	
//	Car(String m){
//		model = m;
//	}
	Car(String model){
//		model = model;
//		
		int a = 10;
		a = a;
		
		Car c1 = new Car();
		c1.model = model;
		
		this.model = model;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
}
