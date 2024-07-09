package quiz;

public class Calc {
	// + - * / %
	int plus(int x, int y) {
		return x + y;
	}
	int minus(int x, int y) {
		return x - y;
	}
	int times(int x, int y) {
		return x * y;
	}
	double div(double x, double y) {
		return x / y;
	}
	double mod(double x, double y) {
		return x % y;
	}
	
	/**
	 *  첫번째 숫자, 두번째 글씨, 세번째 숫자
		메소드명(3, "+", 5)
		알아서 두번째 글씨에 해당하는 연산 결과(1번에서 만든 메소드 사용)를 돌려줌
		@param int 첫번째 숫자, String 연산자, int 두번째 숫자
		@return double 결과
	 */
	double compute(int x, String op, int y) {
		double result = 0;
//		if(op.equals("+")) {
//			result = plus(x, y);
//		} else if (op.equals("-")) {
//			result = minus(x, y);
//		}
//		if( op != null ) {
//			
//			if("+".equals(op)) {
//				result = plus(x, y);
//			} else if ("-".equals(op)) {
//				result = minus(x, y);
//			}
//
//		}
		
		switch(op) {
			case "+":
				result = plus(x, y);
				break;
			case "-":
				result = minus(x, y);
				break;
		}
		
		return result;
	}
}
