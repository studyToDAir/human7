package sec01.exam01;

import java.util.Scanner;

public class For연습Exam {

	public static void main(String[] args) {
		// 주어진 수가 양수(0포함), 음수 여부 출력
		Scanner scan = new Scanner(System.in);
////		int a = 0;
//		System.out.println("숫자를 입력하세요");
//		int a = scan.nextInt();
//		if(a >= 0) {
//			System.out.println(a +" : 양수");
//		} else {
//			System.out.println(a +" : 음수");
//		}
		
		/*
		// 입력을 3번 반복
		for(int i=1; i<=3; i++) {
			System.out.println("숫자를 입력하세요");
			int a = scan.nextInt();
			if(a >= 0) {
				System.out.println(a +" : 양수");
			} else {
				System.out.println(a +" : 음수");
			}
		}
		*/
		/*
		// 입력받은 숫자가 0이 아닌 동안 계속 반복
		for(int a = 1; a != 0;   ) {
			System.out.println("숫자를 입력하세요(종료: 0)");
			a = scan.nextInt();
			if(a >= 0) {
				System.out.println(a +" : 양수");
			} else {
				System.out.println(a +" : 음수");
			}
		}
		System.out.println("종료되었습니다");
		*/
		/*
0단계
+
+
+
+
+

1단계
+++++

2단계
+++++
+++++
+++++

2-1단계
+ + + + +


3단계
+
++
+++
++++
+++++

4단계
+....
++...
+++..
++++.
+++++

5단계
....+
...++
..+++
.++++
+++++

6단계
....+
...+++
..+++++
.+++++++
+++++++++

7단계
....+....
...+++...
..+++++..
.+++++++.
+++++++++
		 */
		
		/*
		 * 0단계
			+
			+
			+
			+
			+
		 */
//		System.out.println("+");
//		System.out.println("+");
		System.out.println("0단계");
		for(int i=1; i<=5; i++) {
			System.out.println("+");
		}
		
		/*
		 * 1단계
			+++++
		 */
	
		System.out.println("1단계");
		int n = 5;
		for(int i=1; i<=n; i++) {
			System.out.print("+");
		}
		System.out.println();
		
		/*
		 * 2단계
			+++++
			+++++
			+++++
		 */
		System.out.println("2단계");
		for(int j=1; j<=3; j++) {
			for(int i=1; i<=5; i++) {
				System.out.print("+");
			}
			System.out.println();
		}
		
		/*
		 * 2-1단계
			+ + + + +

		 */
//		System.out.println("+");
//		System.out.println(" ");
		for(int i=1; i<=5; i++) {
			System.out.print("+");
			System.out.print(" ");
		}
		System.out.println();
		
		
		
		/*
		 * 3단계
			+
			++
			+++
			++++
			+++++
		 */
//		System.out.println("+");
//		System.out.println("++");
		
//		// 첫번째 줄 1번줄
//		// +출력
//		// 한번출력 1번 출력
//		// 모든 + 출력 끝나고 엔터
//		System.out.print("+");
//		System.out.println();
//		
//		// 2번줄
//		// +출력
//		// 2번 출력
//		// 모든 + 출력 끝나고 엔터
//		System.out.print("+");
//		System.out.print("+");
//		System.out.println();
//		
//		for(int i=1; i<=2; i++) {
//			System.out.print("+");
//		}
//		System.out.println();
//		int j = 2;
//		
//		j++;
//		
//		for(int i=1; i<=j; i++) {
//			System.out.print("+");
//		}
//		System.out.println();
//		
//
//		j++;
//		
//		for(int i=1; i<=j; i++) {
//			System.out.print("+");
//		}
//		System.out.println();
		
		for(int k=1; k<=5; k++) {
			for(int i=1; i<=k; i++) {
				System.out.print("+");
			}
			System.out.println();
		}
		
		String plus = "+";
		String result = plus;
		System.out.println(result);
		
		result = result + plus;
		System.out.println(result);
		
		result = result + plus;
		System.out.println(result);
/*
 * 1단계
 * 구구단 한단을 옆으로 출력
 * 2x1=2 2x2=4...
 * 3x1=3 3x2=6...
 * ...
 * 
 * 2단계
 * 구구단 옆으로 3단씩 출력
 * 2x1=2 3x1=3 4x1=4
 * ...
 * 
 * 5x1=5 6x1=6 7x1=7
 * ...
 */

/*
 * 주사위 두개 굴림
 * 1단계
 * 주사위 2개로 굴려서 나올 수 있는 모든 조합을 출력
 * 
 * 2단계
 * 합 별로 나올 수 있는 조합
 * 합이 2 : [1,1]
 * 합이 3 : [1,2] [2,1]
 */

	}

}
