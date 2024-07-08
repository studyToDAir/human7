package sec06.exam02.pack1;

//import sec06.exam02.pack2.Receipt_3;
import sec06.exam02.pack2.*;	// 해당 폴더(패키지)에 있는 클래스만
								// 단, 하위 패키지의 클래스 제외
import sec06.exam02.pack2.Receipt_1;

public class Receipt_2 {

	String str;
	
	Receipt_2(){
		// 다른 패키지의 클래스를 찾을때
		// 1. 내 패키지에 있는가?
		// 2. java.lang 패키지에 있는가?	// java 실행 시 자동으로 import
		// 3. import한 곳에 있는가?
		
		// 내 패키지에 있어서 *로 로딩해도 내껄 찾아갑니다
		// 명확히 import 해준 경우 pack2의 Receipt_1 사용 가능 
		Receipt_1 r1 = new Receipt_1();	
		Receipt_3 r3 = new Receipt_3();
		r3.a = 8;
//		r3.test();
		
		// pack1의 Receipt_1을 사용하고 싶다면?
		// 다른 패키지의 클래스를 가져오는
		// 두번째 방법 : 패키지 정보와 클래스 정보를 한번에 쓰기
		// 귀찮아서 import 사용한다
		// 부득이한 경우 사용할 수 있다는걸 알아두자
		sec06.exam02.pack1.Receipt_1 r1_1 = new sec06.exam02.pack1.Receipt_1();
	}
}
