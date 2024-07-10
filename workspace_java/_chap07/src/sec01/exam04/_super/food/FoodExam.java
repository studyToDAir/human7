package sec01.exam04._super.food;

public class FoodExam {

	public static void main(String[] args) {
		
		제육 food1 = new 제육();
		
		int change = food1.order(10000);
		System.out.println("거스름돈 "+ change +"받았다");
		
		int rank = food1.eat();
		System.out.println(food1.name +"의 별점은 : "+ rank);
		
	}
	
}
