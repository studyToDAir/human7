package sec01.exam01;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {

		int score = 81;
		
//		if(score > 90) {
		if(score >= 90) 
		{
			System.out.println("90점 이상입니다");
			
			if(score >= 95) {
				System.out.println("95점 이상입니다");	
			}
		}
		
		if(score < 90) {
			System.out.println("90점 미만입니다");
		}
		
		//참고로
		boolean up90 = score >= 90;
		if( up90 ) {
			System.out.println("up90");
		}
		if( !up90 ) {
			System.out.println("!up90");
		}
		
		if( up90 ) {
			System.out.println("참");
		} else {
			// 위의 조건이 하나도 만족하지 않는 경우 무조건 실행
			System.out.println("거짓");
		}
		
		System.out.println("----------------");
		if(score >= 90) {
			System.out.println("학점은 A");
		} else if(score < 90 && score >= 80) {
			System.out.println("학점은 B");
		} else {
			System.out.println("학점은 C");
		}

		// if, else if, else 이런식으로 묶여있으면
		// 그 중 하나만 실행된다
		if(score >= 90) {
			System.out.println("학점은 A");
		} else if(score >= 80) {
			// 이거 위에 조건이 거짓일때만 여기로 온다
			System.out.println("학점은 B");
		} else {
			System.out.println("학점은 C");
		}
		
		if(score >= 90) {
			System.out.println("90점 이상입니다");
			System.out.println("학점은 A");
		}
		// 위 if와 관계 없이 동작
		if(score >= 80) {
			System.out.println("90점 미만 80점 이상입니다");
			System.out.println("학점은 B");
		}

		
//		// 3은 짝수인가?
//		int num = 4;
		Scanner input = new Scanner(System.in);
//		num = input.nextInt();
//		if(num % 2 == 1) {
//			System.out.println("홀수");
//		} else {
//			System.out.println("짝수");
//		}
		
		
		String a = "abc";
		String b = "abc";
//		b = input.nextLine();
//		if(a == b)
		if(a.equals(b)) 
		{
			System.out.println("a와 b가 같다");
		} else {
			System.out.println("a와 b가 다르다");
		}
		
		
		double rand = Math.random();
		System.out.println("rand : "+ rand);
		// 0 이상 1 미만
		
		// 주사위 : 1~6까지
		int dice = (int)(rand * 6) + 1;
		System.out.println("주사위 숫자는 : "+ dice);
		
		if ( dice == 6 ) {
			System.out.println("와 6이 나왔군요");
		}
		
		rand = Math.random();
		int rsp = (int)(rand * 3);	// 0 ~ 2
//		rsp = 0;
		System.out.println("rsp : "+ rsp);
		if(rsp == 0) {
			System.out.println("가위");
		} else if (rsp == 1) {
			System.out.println("바위");
		} else {
			System.out.println("보");
		}
		
		int my = 1; // 바위
		
		if( rsp == my ) {
			System.out.println("비김");
		} else {
			
		}
		
		if( rsp == 0 && my == 0 ) {
			System.out.println("비김");
		} else if (rsp == 0 && my == 1) {
			System.out.println("내가 이김");
		} else if (rsp == 0 && my == 2) {
			System.out.println("내가 짐");
		}
		
		
		
		double rand2 = Math.random();
		System.out.println("rand2 : "+ rand2);
		// 0 이상 1 미만
		
		// 주사위 : 1~6까지
		int dice2 = (int)(rand2 * 6) + 1;
		System.out.println("주사위 숫자는 : "+ dice2);

		if(dice2 == 1) {
			System.out.println("주사위 1이 나왔습니다");
		} else if(dice2 == 2) {
			System.out.println("주사위 2가 나왔습니다");
		}
		
		// if중에서 == 또는 equals인 경우 switch로 바꿀 수 있다
		switch(dice2) {
			case 1 :
				System.out.println("주사위 1이 나왔습니다");
				break;
			case 2 :
				System.out.println("주사위 2이 나왔습니다");
				break;
			case 3 :
				System.out.println("주사위 3이 나왔습니다");
				break;
			case 4 :
				System.out.println("주사위 4이 나왔습니다");
				break;
			case 5 :	// else if (dice2 == 5)
				System.out.println("주사위 5이 나왔습니다");
				break;
			default :	// if의 else
				System.out.println("주사위 6이 나왔습니다");
				break;
		}
		
		int month = 3;
		
		if( month >= 3 && month <= 5 ) {
			System.out.println("봄");
		} else if ( month >= 6 && month <= 8 ) {
			System.out.println("여름");
		} else if ( month >= 9 && month <= 11 ) {
			System.out.println("가을");
//		} else if ( month == 12 || (month >= 1 && month <= 2) ) {
//		} else if ( month == 12 || month == 1 || month == 2 ) {
		} else {
			System.out.println("겨울");
		}
		
		if(month < 1) month = 1;
		if(month > 12) month = 12;
		
//		if(month < 1) 
//			if(month > 12) month = 12;
//	else
//		month += 1;
		
//		String str;
//		if(month >= 3 && month <=5) {
//			str = "봄임";
//		} else {
//			str = "봄 아님";
//		}
//		System.out.println(str);
		
		String str = (month >= 3 && month <=5) ? "봄임" : "봄 아님";
		System.out.println(str);

		// break가 없을때 다음 case도 실행되는 원리를 이용해서
		switch(month) {
			case 3 : 
			case 4 : 
			case 5 : 
				System.out.println("봄2");
				break;
			case 6 : 
			case 7 : 
			case 8 : 
				System.out.println("여름2");
				break;
			case 9 : 
			case 10 : 
			case 11 : 
				System.out.println("가을2");
				break;
			default :
				System.out.println("겨울2");
				break;
		}
		
		// char, byte, short, int(즉, int 이하), String만 허용됨
		// boolean, long, float, double은 못씀
		
		
	}

}
