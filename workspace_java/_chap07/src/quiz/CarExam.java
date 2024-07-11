package quiz;

public class CarExam {

	public static void main(String[] args) {

		Martin car1 = new Martin();
		Gwagen car2 = new Gwagen();
		
		car1.drive();
		int speed = car1.accel(4);
		System.out.println("지금 가속도 : "+ speed);
		
		speed = car1.breaking(4);
		System.out.println("지금 감속도 : "+ speed);
		
		car1.shoot();
		
		car2.drive();
//		car2.shoot(); // 지바겐에는 총쏘는 기능 없음
	}

}
