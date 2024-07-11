package quiz;

public class PaikCoffee extends Cafe {

	PaikCoffee(){
		name = "빽다방 천안역점";
		
		menus.add("원조커피");
		prices.add(3000);
		
		menus.add("대파라떼");
		prices.add(5000);
	}
	
	@Override
	void order(String coffee) {
		System.out.println(coffee + " 주문 받았습니다");
		int price = getPrice(coffee);
		if(price == -1) {
			System.out.println("그 메뉴는 없습니다.");
		} else {
			System.out.println("가격은 "+ price +"원 입니다.");
		}
	}
	
	
	String sell사라다빵() {
		return "사라다빵";
	}
}
