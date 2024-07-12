package quiz;

public class Martin extends Car {
	
	Martin(){
		this.brand = "마틴";
	}

	@Override
	public void drive(){
	    System.out.println("마틴 부릉 부릉 부르릉");
	}
	
	@Override
	int accel(int press) {
		System.out.println(press + " 만큼 마틴이 빨라집니다");
		return press * 4;
	}
	
	@Override
	int breaking(int press) {
		System.out.println(press + " 만큼 마틴이 느려지고 있습니다");
		return press * 5;
	}
	
	void shoot() {
		System.out.println("총을 쏩니다 땅야 땅야");
	}
	
}
