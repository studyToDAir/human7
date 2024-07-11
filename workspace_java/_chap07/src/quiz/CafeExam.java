package quiz;

import java.util.ArrayList;
import java.util.List;

public class CafeExam {

	public static void main(String[] args) {

		PaikCoffee coffee1 = new PaikCoffee();
		
		
		Cafe coffee2 = (Cafe)new PaikCoffee();
		
		coffee1.order("대파라떼");
		coffee1.pay("대파라떼", 7000);
	}

}
