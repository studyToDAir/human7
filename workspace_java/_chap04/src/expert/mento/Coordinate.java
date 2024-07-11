package expert.mento;

public class Coordinate {

	public static void main(String[] args) {

		/*
		 * Q3. 정수 값을 하나 입력받으세요. 그리고 아래 형태처럼 행렬을 출력하는 프로그램을 작성하세요. "같은 줄"에서 "글자 사이 공백"은
		 * 반드시 한 칸이어야 합니다 (맨 앞 또는 맨 뒤의 공백은 상관없음). 입력 값은 1 이상의 int 정수입니다. ex1) 입력 3 -> 출력
		 * : 00 01 02 10 11 12 20 21 22 ex2) 입력 4 -> 출력 : 00 01 02 03 10 11 12 13 20 21
		 * 22 23 30 31 32 33
		 * 
		 */
		/*
		 * 입력 2 00 01 10 11
		 * 
		 * 시작은 00 오른쪽 방향의 규칙은? 오른쪽 자리가 0부터 하나씩 늘어남 어디까지? 입력받은 숫자 만큼
		 * 
		 * 다시 적어보면 오른쪽 방향의 규칙은? 입력받은 숫자 만큼 반복해서 오른쪽 자리가 0부터 하나씩 늘어남 단, 왼쪽자리는 계속 유지 됨 아래쪽
		 * 방향의 규칙은? 입력받은 숫자 만큼 반복해서 왼쪽 자리가 0부터 하나씩 늘어남 단, 오른쪽자리는 계속 유지됨
		 * 
		 * 어떻게 동시에 출력할까? 일단 한줄만 해볼까? 00 01
		 */
//		System.out.print("0" + "0" + " ");
//		System.out.print("0" + "1" + " ");

//		int x=0;
//		int y=0;
//		System.out.print(""+ x + y + " ");
//
//		y++;
//		System.out.print(""+ x + y + " ");

		// 반복되는 것과
		// 반복되지 않는 것의 규칙 찾기
		// 반복의 시작 조건
		// 반복 종료 조건

		// 내가 알고 있는 변수들로 충분히 구현 가능할까?
//		int n = 2;
//		int x = 0;
//		for(int y=0; y<n; y++) {
//			System.out.print(""+ x + y + " ");
//		}
//		System.out.println();
//		
//		x++;
//		for(int y=0; y<n; y++) {
//			System.out.print(""+ x + y + " ");
//		}
//		System.out.println();

		int n = 4;
		for (int x = 0; x < n; x++) {
			for (int y = 0; y < n; y++) {
				System.out.print("" + x + y + " ");
			}
			System.out.println();
		}
	}

}
