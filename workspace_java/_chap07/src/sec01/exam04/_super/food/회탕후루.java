package sec01.exam04._super.food;

public class 회탕후루 {
	
	String name;
	int price;
	String recipe;
	String type;
	
	회탕후루(){
		this.name = "회탕후루";
		this.price = 20000;
		this.recipe = "회 + 설탕";
		this.type = "간식";
	}
	
//	int eat() {
//		System.out.println(this.name +" 먹는다");
//		return (int)(Math.random()*5)+1;	// 별점
//	}
	
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
	
	String cook(int master) {
		if(master > 7) {
			return "기가막히게 잘됨";
		} else if(master > 4) {
			return "먹을만하게 됨";
		} else {
			return "나 혼자 먹자";
		}
	}
	
	void goGarbage() {
		System.out.println("에잇 버리자");
	}
	
}
