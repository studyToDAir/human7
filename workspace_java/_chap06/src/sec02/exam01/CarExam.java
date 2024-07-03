package sec02.exam01;

public class CarExam {

	public static void main(String[] a) {

		Car myCar = new Car();
		Car myCar2 = new Car();
		
		System.out.println(myCar.model);
		
		myCar.model = "흑팔라";
		System.out.println(myCar.model);

		System.out.println(myCar2.model);
		
//		int a;
//		System.out.println(a);
		System.out.println(myCar.speed);
	}
	
	
	

}
