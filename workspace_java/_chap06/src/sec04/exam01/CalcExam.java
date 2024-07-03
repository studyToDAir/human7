package sec04.exam01;

public class CalcExam {

	public static void main(String[] args) {
		powerOn();	// 이건 내꺼에요
		powerOn();	// 두번 써도 되서 두번 씀
		
		Calc calc = new Calc();
		calc.powerOff();
		System.out.println(calc);
		Calc calc2 = new Calc();
		System.out.println(calc2);
		
		Calc calc3 = new Calc();
		calc3.powerOn();
//		calc3.isOn = true;
		
		calc2.powerOn();
		
		int result = calc3.plus(3, 8);
//		int result = calc3.plus(3, calc3.plus(3, 8));
		System.out.println("plus 결과 : "+ result);
		
		double div = calc3.divide(5, 0);
		System.out.println("divide 결과 : "+ div);
		
//		int[] a = {2, 7};
//		int[] a = new int[]{2, 7};
		int[] a = new int[2];
		a[0] = 2;
		a[1] = 7;
		
		System.out.println( calc3.plus2(a) );
		
		System.out.printf("%d_%s", 3, "abc");
		
		int num = calc.plus3(1,2,3,4);
		System.out.println("plus3 결과 : "+ num);
		
		num = calc.plus3(1,2,3,4,5,6,7,8,9);
		System.out.println("plus3 결과 : "+ num);
	}

	static void powerOn() {
		System.out.println("전원을 켭니다");
	}
}
