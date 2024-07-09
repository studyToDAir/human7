package quiz;

public class CalcExam {

	public static void main(String[] args) {
		
		Calc calc = new Calc();
		double result = calc.compute(1, "+", 2);
		System.out.println(result);
		
		result = calc.compute(1, null, 2);
		System.out.println(result);

	}

}
