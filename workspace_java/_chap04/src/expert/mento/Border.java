package expert.mento;

public class Border {

	public static void main(String[] args) {

		/*
		 
		 3 입력시
		 ***
		 * *
		 ***
		 
		 4 입력시
		 ****	// 1번째줄 * 4개 찍음
		 *  *	// 2번째줄 *찍고 4-2칸띄고 *찍음
		 *  *	// 3번째줄 *찍고 4-2칸띄고 *찍음
		 ****	// 4번째줄 * 4개 찍음
		 
		 ****	// 1번째줄 * 4개 찍음
		 ****	// 2번째줄 * 4개 찍음
		 ****	// 3번째줄 * 4개 찍음
		 ****	// 4번째줄 * 4개 찍음
		 */
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		
		System.out.print("*");
		System.out.print(" ");
		System.out.print(" ");
		System.out.print("*");
		System.out.println();
		
	}

}
