package sec04.exam03;

public class CarExam {

	public static void main(String[] args) {

		// Car클래스를 생성해서
		// Car 타입의 myCar 변수에 담는다
		Car myCar = new Car();
		
		// gas가 남았는지 받아온다
		boolean gasState = myCar.isLeftGas();
		
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		
		System.out.println(myCar.name);
//		myCar.name = "욕@#$@#$";
		myCar.setName("몽식이");
		System.out.println(myCar.name);
		
		myCar.setName("");
		System.out.println(myCar.name);
		
	}

}
