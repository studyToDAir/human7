package sec05.exam02._static;

public class CalcExam {

	// 자바가 즉 java.exe가 특정 클래스를 실행할때
	// 예를 들어 CalcExam 클래스를 실행할때
	// CalcExam.main(스트링배열)을 실행한다
	// new CalcExam() 하지 않는다
	public static void main(String[] args) {
		
		Calc calc1 = new Calc();
		Calc calc2 = new Calc();
		
		calc1.color = "빨강";
		calc2.color = "파랑";
		if(calc1.test2() == Constant.LOGIN_SUCCESS) {
			
		}
		
//		System sys = new System();
		
		System.out.println(calc1.pi);
		System.out.println(Calc.pi);

		calc1.pi = 3;
		System.out.println(calc1.pi);
		System.out.println(calc2.pi);
		
		Calc.test();
		calc1.test2();
		
		print1();
	}
	
	static void print1() {
		print2();
	}
	static void print2() {
		print3();
	}
	static void print3() {
		
	}
	

}
