package sec01.exam01;

public class LottoExam {

	public static void main(String[] args) {

		double rand = Math.random();
		// 0 이상 1 미만
		/*
		 * 0 <= rand && rand < 1
		 * 0 ~ 0.99999999999
		 * 
		 * 0 * 45 <= rand * 45 < 1*45
		 * 0 ~ 45 * 0.999999 == 44.99999999
		 * int로 바꾸면
		 * 0 ~ 44 까지 나오고 1을 더하면
		 * 1 ~ 45 까지 random한 숫자가 나온다
		 */
		
		int number = (int)(rand * 45); 	// 0 ~ 44 까지
		number = number + 1;			// 1 ~ 45 까지
		number = (int)(rand * 45) + 1;	// 그냥 위에거 한번에 쓴거
		
		number = ( (int)(rand * 10000) ) % 45 + 1;
		System.out.println(number);
		
		rand = Math.random();
		number = (int)(rand * 45) + 1;
		System.out.println(number);
		
		rand = Math.random();
		number = (int)(rand * 45) + 1;
		System.out.println(number);
	}

}
