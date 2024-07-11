package quiz;

public class Gwagen extends Car {
	
	Gwagen(){
		brand = "벤츠";
	}

	@Override
	void drive(){
	    System.out.println("지바겐이 출발한다 드르릉");
	}
	
}
