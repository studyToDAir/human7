package sec04.exam04;

public class CalcExam {

	public static void main(String[] args) {
		
		Calc calc = new Calc();
		// 실행
		calc.execute(40, 20);
		calc.execute();
		calc.println("abc");
		calc.avg(4, 50);
		System.out.println("----------");
		int a = 1;
//		double b = (double)a;
		double b = a;
		calc.plus(1, 1.5);
	}

}
