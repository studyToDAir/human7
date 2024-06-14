package sec03.exam01;

import java.util.Scanner;

public class Hello {
	/* 범위 주석 */
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 한줄 주석

		// 한줄 지우기 : Ctrl + d
		// 한줄 복사 : Ctrl + Alt + 방향키
		// 한줄 이동 : Alt + 방향키
		// 코드 정렬 : Ctrl + Shift + f

		System.out.println("Hello World");
		
		
		
		double temp = 30.5;
		float temp2 = 30.5F;
		
		int age = 20;
		long age2 = 3000000000L;
		
		age = (int)age2;
		System.out.println(age);
		
		age2 = (long)age;
		age2 = age;

		temp = age;
		age = (int)temp;
		
		temp = 30.57;
		age = 10;
		System.out.println((double)age + temp);
		
		
		int money = 70000;
		int count = 6;
		System.out.println(money / count);
		System.out.println((double)money / count);
		
		int a = 2000000000;
		int b = 2000000000;
//		int c = (int)(   (long)a + b   );
//		System.out.println((long)c);
		
		long c = (long)a + b;
		System.out.println(c);
		
		System.out.println("1" + 3);
		System.out.println(""+ 5 + 4 + "1" + 3);
		
		
//		String car_cc = "a";
//		int a1 = Integer.parseInt(car_cc);
//		
		
//		Scanner scanner = new Scanner(System.in);
//		int input = scanner.nextInt();
//		System.out.println(input);
		
		
		int a2 = -1;
		
		a2 = a2 + 2;
		
		a2 += 2;
		
		a2 += 1;
		a2++;
		++a2;
		a2--;
		
		a2 = 10;
		int a3 = a2++;
//		int a4 = ++a2;
		System.out.println("a3 : "+ a3);
		System.out.println("a2 : "+ a2);
		
		System.out.println("--------------");
		a2 = 10;
//		a3 = a2++ + 2;
//		a3 = 2 + ++a2 + 1;
		int a4 = 2 + a2++ + 1;
		System.out.println("a4 : "+a4);
		System.out.println("a2 : "+ a2);
//		System.out.println("a3 : "+ a3);

		
		a2 = 10;
		a3 = (a2++) + (a2);
		
		
		a2 = 2;
//		a3 = a2++ + ++a2 - --a2 - a2-- + --a2;		
//		a3 = a2++ + ++a2 * (--a2 - a2--) + --a2;		
		
		System.out.println("a3 : "+ a3);
		System.out.println("a2 : "+ a2);
		
//		System.out.println("a3 : "+ a3);
		
		
		a2 = 2;
//		a3 = a++ + a;
		a3 = a + a+1;
		
		
		
		
		
//		System.out.println("--------------");
//		a2 = 3;
//		int b2 = a2++      +       ++a2;
//		System.out.println(b2);
		
		
		int[] a5 = {10,20,30,40,50};
		
		int b2 = 0;
		System.out.println(a5[b2++]);
		System.out.println(a5[b2++]);
		System.out.println(a5[b2++]);
		System.out.println(a5[b2++]);
		System.out.println(a5[b2++]);
		
		
		b2 = b2 + 1;
		b2 = 1 + b2;
		
		b2 += 1;
		b2++;
		
		
//		if(  (3 < b2) < 6 ) {
		
		
		
		
		
		
		
	}

}
