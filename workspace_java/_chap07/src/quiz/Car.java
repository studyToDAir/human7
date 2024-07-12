package quiz;

public class Car {
	
	String brand = null;
	int speed;
	
	public void drive(){
	    System.out.println("운전을 시작합니다");
	}
	
	int accel(int press) {
		System.out.println(press + " 만큼 엑셀을 밟습니다");
		return press * 2;
	}
	
	int breaking(int press) {
		System.out.println(press + " 만큼 브레이크를 밟습니다");
		return press * 3;
	}
}
