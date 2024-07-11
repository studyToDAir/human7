package quiz;

import java.util.ArrayList;

public class Cafe {

	String name;
	
	// 따아 : 3000
	// 아아 : 3500
	// 라떼 : 4000
	
	// 따아, 아아, 라떼
	// 3000, 3500, 4000
	
	ArrayList menus = new ArrayList();
	ArrayList prices = new ArrayList();
	
	
	void order(String coffee) {
		System.out.println("주문 : "+ coffee);
	}
	
	void pay(String coffee, int money) {
		System.out.println("받은 돈 : "+ money);
		
		// 잔돈을 거슬러주면 좋겠다
		// 그러려면 커피 종류별 가격이 있어야겠다
		int price = getPrice(coffee);
		
		if(money < price) {
			System.out.println("금액이 부족합니다.");
		} else {
			System.out.println( money - price + "원 돌려드릴께요");
		}
	}
	
	int getPrice(String menu) {
		int price = -1;	// 메뉴가 없을때 -1을 돌려주도록 설계
		for(int i=0; i<menus.size(); i++) {
			if(menus.get(i).equals(menu)) {
				price = (int)prices.get(i);
			}
		}
		return price; 
	}
}
