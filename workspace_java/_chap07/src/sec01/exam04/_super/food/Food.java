package sec01.exam04._super.food;

public class Food {
	
	Food(){
		System.out.println("Food 생성자 실행");
	}

	/*
	 *  이름name
		가격price
		주재료recipe
		종류type
	 */
	String name;
	int price;
	String recipe;
	String type;
	
	/*
	 *  먹는다eat()
		주문한다order()
		요리한다cook()
	 */
	int eat() {
		System.out.println(this.name +" 먹는다");
		return (int)(Math.random()*5)+1;	// 별점
	}
	
	/**
	 * 주문 기능
	 * @param int money 지불하는 금액
	 * @return int 거스름돈
	 */
	int order(int money) {
		int change = 0;	// 거스름돈
		
		if(money < this.price) {
			System.out.println(this.name +" 주문은 금액 부족으로 취소합니다");
		} else {
			System.out.println(this.name +" 주문한다");
			change = money - this.price;
		}
		
		return change;
	}
	
	/**
	 * 
	 * @param int master 요리 숙련도
	 * @return String 조리 결과
	 */
	String cook(int master) {
		if(master > 7) {
			return "기가막히게 잘됨";
		} else if(master > 4) {
			return "먹을만하게 됨";
		} else {
			return "나 혼자 먹자";
		}
	}
}
