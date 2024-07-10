package sec01.exam04._super.food;

public class 제육 extends Food {

	int a = 20;
	
	제육(){
//		super();
		System.out.println("제육 생성자 실행");
		
		this.name = "제육";
		this.price = 8000;
		this.recipe = "돼지고기 앞다리";
		this.type = "한식";
	}
	
	void setSpicy(String spicy) {
		this.name = this.name +" - "+ spicy;
	}
	
	@Override
	public int eat() {
		System.out.println("갓지은 밥을 상추와 마늘에 싸서");
//		System.out.println(this.name +" 먹는다");
//		return (int)(Math.random()*5)+1;
		return super.eat();
	}
}
