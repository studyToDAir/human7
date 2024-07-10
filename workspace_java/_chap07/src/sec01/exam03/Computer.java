package sec01.exam03;

public class Computer extends Calc{

	@Override
	double areaCircle(double radius) {
		System.out.println("Computer의 areaCircle 실행");
		plus(1,2);
		return Math.PI * radius * radius;
	}
	
	@Override
	int plus(int x, int y) {
		System.out.println("문의하신 정답은");
		int result = super.plus(x, y);
		System.out.println(result + "입니다");
		
		return result;
	}
}
