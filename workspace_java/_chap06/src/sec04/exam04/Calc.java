package sec04.exam04;

public class Calc {

	void execute() {
		double result = avg(7,10);
		println("실행결과:"+result);
	}
	
	double avg(int a, int b) {
		double sum = plus(a, b);
		double result = sum / 2;
		return result;
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	void println(String msg) {
		System.out.println(msg);
	}
	
}
