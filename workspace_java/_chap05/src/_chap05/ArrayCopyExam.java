package _chap05;

public class ArrayCopyExam {

	public static void main(String[] args) {

		// 커피 1호점에서 판매하는 메뉴
		String[] coffee = new String[3];
//		coffee[0] = "아아";
		coffee[0] = "따아";
		coffee[1] = "라떼";
		coffee[2] = "말차";
		
		// 커피 2호점에서 1호점과 똑같은 커피를 판매할껍니다
		/*
		 *  얕은 복사 shallow copy, thin clone, call by reference
		 *  stack영역의 값(주소)만 복사
		 *  원본이 바뀌면 당연히도 내 값도 바뀝니다.
		 */
		String[] coffee2 = coffee;
		for(int i=0; i<coffee2.length; i++) {
			System.out.println(coffee2[i]);
		}
		
		// 얕은 복사로 연결되어 있어서
		// 내껄 바꿔도 원본이 바뀐다
		// 원본의 "주소만 공유"하고 있기 때문에 coffee나 coffee2는 같은거다
		coffee2[1] = "연유라떼";
		System.out.println("coffee2[1]의 값을 바꾸고 원본인 coffee출력");
		for(int i=0; i<coffee.length; i++) {
			System.out.println(coffee[i]);
		}
		
		// 할일 : 크기와 내용을 동일하게 가지는 새로운 배열을 만들겠다
		
		/*
		 *  깊은 복사, deep copy, deep clone, call by value
		 *  heap영역의 새로운 주소에 자리를 마련하고 변수에 주소를 넣는다
		 *  그리고 원본의 값들을 복사해서 채워넣는다
		 *  그래서 원본과 동일한게 생기지만 전혀 다른 주소를 가지게 된다
		 *  즉, 내 값을 바꿔도 원본이 바뀌지 않음
		 */
		String[] coffee3 = new String[coffee.length];
//		coffee3[0] = "따아";	// 수동이니까 원본이 바뀌면 이것도 바꿔줘야 하니까
//		coffee3[0] = coffee[0];
		for(int i=0; i<coffee3.length; i++) {
			coffee3[i] = coffee[i];
		}
		System.out.println("coffee3 출력");
		coffee3[2] = "아샷추";
		for(int i=0; i<coffee3.length; i++) {
			System.out.println(coffee3[i]);
		}
		System.out.println("coffee3[2]의 값을 바꾸고 원본인 coffee출력");
		for(int i=0; i<coffee.length; i++) {
			System.out.println(coffee[i]);
		}
		
		
		// coffee3에 "사라다빵"을 추가하려면?
//		coffee3 = new String[]{"따아", "연유라떼", "아샷추", "사라다빵"};
		
		/*
		 *  전략 : coffee의 크기보다 1개 많은 새로운 배열을 만들고
		 *  앞에서부터 복사해 놓고
		 *  마지막에 추가할 값을 적어보자
		 */
		coffee3 = new String[coffee.length + 1];
		// 앞에 3개만 복사
		for(int i=0; i<coffee.length; i++) {
			coffee3[i] = coffee[i];
		}
		// 비어있는
		coffee3[3] = "사라다빵";
		System.out.println("4번째 메뉴를 추가한 결과");
		for(int i=0; i<coffee3.length; i++) {
//			System.out.println(coffee3[i]);
			String menu = coffee3[i];
			System.out.println(menu);
		}
		
		// 향상된 for문
		System.out.println("향상된 for문");
//		int cnt = 0;
		for( String menu : coffee3) {
//			cnt++;
			System.out.println(menu);
		}
		
		// 모든 자식 배열의 크기가 같게 선언할 수 밖에 없음
		int[][] a2 = new int[10][100];
		// 자식별로 크기를 다르게 선언할 수 있음
		int[][] a3 = {
						{1,2},
						{1,2,3}
					};
		
		// 연습문제 5. 223p.
		int[][] array = {
							{95, 86},		// 2
							{83,92,96},		// 3
							{78,83,93,87,88}// 5
						};
//		1. 모두 출력
//		int[] array1 = array[0]; // {95, 86}
////		array1[0]
//		System.out.println(array[0][0]);
//		System.out.println(array[0][1]);
//		
//		System.out.println(array[1][0]);
//		System.out.println(array[1][1]);
//		System.out.println(array[1][2]);
//		
////		array[0].length만큼
//		for(int i=0; i<array[0].length; i++) {
//			System.out.println(array[0][i]);
//		}
//		
//		for(int i=0; i<array[1].length; i++) {
//			System.out.println(array[1][i]);
//		}
		
		for(int j=0; j<array.length; j++) {
			
			for(int i=0; i<array[j].length; i++) {
				System.out.println(array[j][i]);
			}
			
		}
		
//		2. 합계 출력
		int sum = 0;
		int count = 0;
		for(int j=0; j<array.length; j++) {
			
			for(int i=0; i<array[j].length; i++) {
//				System.out.println(array[j][i]);
				sum = sum + array[j][i];
				count++;
			}
			
		}
		System.out.println("총합 : "+ sum);
		
		// 3-0 모든 개수 세기
		// 모든 요소를 하나씩 세기
		System.out.println("개수 : "+ count);
		// 배열의 크기만 누적
		count = 0;
		for(int i=0; i<array.length; i++) {
			count += array[i].length;
		}
		System.out.println("개수2 : "+ count);
		
//		3. 평균 출력(합계를 개수로 나누기)
		System.out.println((double)sum / count);
		
		// 문제 4.
		// 주어진 배열에서 최대값 찾기
		// 전략 : 배열의 첫번째 값부터 혹은 절대 나올수 없는 최저치를 기준으로
		// 기준과 비교해서
		// 큰 값을 새로운 기준으로 정한다
		// 그렇게 살아남은 값이 최대값!
		
		int[] array2 = {1, 5, 3, 8, 2, 9, 3};
		int max = Integer.MIN_VALUE;	// int가 가질 수 있는 최소값, 최대값은 MAX_VALUE
		for(int i=0; i<array2.length; i++) {
			if( array2[i] > max ) {
				max = array2[i];
			}
		}
		System.out.println("최대값 : "+ max);
		
	}

}
