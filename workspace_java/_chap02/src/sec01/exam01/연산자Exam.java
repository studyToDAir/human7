package sec01.exam01;

public class 연산자Exam {

	public static void main(String[] args) {

		int a = 10;
//		a = 11;
//		a = 10 + 1;
		int b = a + 1;
		
		// a = 10 + 1
		a = a + 1; 	//  a = 1 + a
		a += 1;		// a = a + 1과 같다
		a++;		// a += 1과 같다
		++a;
		
		a = 10;
		a++;
		System.out.println("a : "+ a);
		
		a = a - 2;
		a -= 2;
		a -= 1;
		a--;		// a = a - 1과 같다
		--a;
		
		a = 10;
		a--;
		System.out.println("a : "+ a);
		// 현재 a가 9
		System.out.println("++a : "+ ++a); // 출력: 10
		// 현재 a가 10
		System.out.println("a++ : "+ a++);	// 출력 : 10
		System.out.println("a : "+ a);		// 출력 : 11
		// 현재 a가 11
		
		System.out.println(a++ + ++a);
//		11 + (a가 12가 된 상태)에다가 1더하기 해서 예측: 11 + 13 
		// 위 내용을 풀어쓰기
		a = 11;
		int result = a;	// a
		a = a + 1;		// a다음에 오는 ++
		a = a + 1;		// 두번째 a 앞에 오는 ++
		result = result + a;
		System.out.println(result);
		
		boolean c = true;
		System.out.println("c : "+ c);
		c = !c;
		System.out.println("!c : "+ c);
		
		
		double d = 7.0;
		System.out.println(d / 3);
//		System.out.println(3 / 0);	// double 일때는 Infinity, int일때는 / by zero
		
		int f = 1564684684;
		int p = 3;
		System.out.println("몫 : "     + (f / p));
		System.out.println("나머지 : " + (f % p));
		
		
		// 나 돈 10000원이 있어요
		// 커피 4500원짜리 몇잔 살 수 있나요?
		int money = 10000;
		int coffee = 4500;
		int count = money / coffee;
		System.out.println(count +"잔");
		int change = money % coffee;
		System.out.println("잔돈 : "+ change);
		
		// 올리브영에서 전품목 15%행사를 합니다.
		// 1. 꿀홍차 5000을 샀을때 얼마를 내야 하나요?
		// 2. 꿀홍차 5000과 립스틱 10000을 샀어요 얼마를 내야 하나요?
		
		double percent = 0.15;
		int tea = 5000;
		double discount = tea * percent;
		System.out.println("할인받을 금액 : "+ discount);
		double pay = tea - discount;
		System.out.println("내야 하는 돈 : "+ pay);
		
		// 7234원이 있어요
		// 5000원, 1000원, 500원, 100원, 50원, 10원, 1원
		// 각각 최대 몇개까지로 표현할 수 있나요?
		
		 String left = "수박";
		 String right = "멜론";
		 // 단, left = "멜론" 금지
		 System.out.println("left : "+ left);	// 결과 : 멜론
		 System.out.println("right : "+ right);	// 결과 : 수박
		 
		 String table = left;
		 left = right;
		 right = table;
		 
		 System.out.println("left : "+ left);	// 결과 : 멜론
		 System.out.println("right : "+ right);	// 결과 : 수박
		 
		 // swap
		 
		 
//		 left = "watermelon";
//		 right = "melon";
//		 left = right;
////		 right = right + "water";
//		 right += "water";
		 
		 
		 
		 
		 
		 System.out.println(3 > 5);
		 boolean bool = 3 > 5;
		 System.out.println(bool);
		 
		 System.out.println(0.1 == 0.1f);	// 결과 false
		 //같은 타입으로 변경해서 비교하자
		 System.out.println((float)0.1 == 0.1f);
		 
		 
		 System.out.println("3 == 3 : " + (3 == 3));
		 System.out.println("3 != 3 : " + (3 != 3));
		 
		 String str1 = "최민수";
		 String str2 = "최민수";
//		 System.out.println(str1 == str2);
		 // 글씨 비교는 == 사용 금지
		 // String 변수나 ""에 .equals( )붙여서 사용 ()안에 글씨와 비교
		 
		 System.out.println(   str1.equals(str2)    );
		 
		 
		 System.out.println(   10 | 3   );
		 
		 
		 int i1 = 7;
		 int i2 = 15;
		 int i3 = 17;
		 
		 System.out.println("i3이 가장 큰 값인가? "
				 + ( (i3 >= i1) && (i3 >= i2)    )    );
		 
		 boolean i4 = i3 > i2;
		 System.out.println(  i4 ? "i3이 크다" : "i3이 작거나 같다" );
		 
		 
		 // 5번
		 int var1 = 5;
		 int var2 = 2;
		 double var3 = var1 / var2;				// 예상 : 2.5
		 System.out.println("var3 : "+ var3);	// 출력 : 2.0
		 int var4 = (int) (var3*var2);
		 System.out.println("var4 : "+ var4);
		 
		 // 6번
		 int i5 = 356;
		 System.out.println(  (i5 / 100) * 100  );
		 System.out.println(  i5 - (i5 % 100)  );
		 
	}

}
