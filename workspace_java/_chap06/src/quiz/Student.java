package quiz;

public class Student {
	
	// 값
	// 이름, 나이, 주소, 성별, 전공, 안경사용여부
	String name;
	int age;
	String addr;
	int gender;
	String major;
	boolean hasGlasses;
	
	int intel = 0;	// 지식
	int stress = 0;	// 스트레스 수치
	int hp = 100;	// 체력
	int hungry = 0;	// 공복감
	
	// 행동
	// 공부, 식사, 수면, 게임
	
	// 공부
	// 공부한 내용을 출력하고
	// 지식이 높아지고
	// 스트레스 높아지고
	// 체력 낮아지고
	// 공복감 높아지고
	
	// 전달인자 : String 공부한 내용(과목)
	// 리턴타입 : 없음
	int study(String subject) {
		System.out.println(subject+"을(를) 공부했다");
		
		intel += 5;
		stress += 10;
		hp--;
		hungry++;
		
		// intel을 리턴하는 코드를 완성하세요
		return intel;
	}

	// 식사
	// 먹은 음식을 출력하고
	// 체력 조금 올라가고
	// 스트레스 조금 낮아지고
	// 공복감 많이 낮아지고
	// 전달인자 : String 음식
	// 리턴타입 : int 공복감
	int eat(String food) {
		System.out.println("맛있는 "+ food +" 와구와구");
		
		hp += 3;
		stress -= 10;
		hungry -= 10;
		
		return hungry;
	}
	
	// 수면 메소드 완성
	// 전달인자 : 없음
	// 리턴타입 : 없음
	void sleep() {
		System.out.println("꿀잠 자자!!!");
		hp += 30;
		stress -= 20;
		hungry += 5;
	}
	
	// 게임 메소드 완성
	// 단, 게임 하면서 게임 공부도 했다치고
	// study 메소드 활용
	// 전달인자 : 게임이름
	// 리턴타입 : int 스트레스 수치
	int doGame(String title) {
		System.out.println(title + " 시작!! 잘해보자");
		
		study(title);
		
		stress -= 10;
		hungry += 3;
		
		return stress;
	}
	
	int doGame(String title, int hour) {
		System.out.println(title + " 시작!! "+ hour +"시간만 하자");
		
		// 방어코딩
		// hour가 0 이하인 경우 다시 입력해달라고
		if(hour <= 0) {
			System.out.println("다시 입력해달라");
//			return 0;
		} else {
			// 시간이 정상인 경우
			// 반복문 연습
			// 난이도1 : 시간당 한번씩 "한번만 더하자" 출력
			for(int i = 0; i < hour; i++) {
				System.out.println(i +"시간밖에 안지났으니 한번만 더하자");
			}
//			for(int i = hour; i>0 ; i--) {
//				System.out.println(i +"시간밖에 안지났으니 한번만 더하자");
//			}
//			// 난이도2 : 30분에 한번씩 출력(단 syso 두번쓰지말고)
//			//			 증감식에서 0.5씩 더하기로 풀어보자
//			for(double i = 0; i < hour; i += 0.5) {
////				i = 0.5;
////				i++;
////				i = i + 1;
////				i = (int) (i + 0.5);
//				System.out.println(i +"시간밖에 안지났으니 한번만 더하자");
//			}
			
			
			// 조건문 연습
			// 2시간 이하 - 오늘 좀 안됐다 그만하자, 스트레스 + 5
			// 4시간 이하 - 간단하게 한게임 했다, 스트레스 - 10
			// 4시간 초과 - 오늘 신났다, 스트레스 -20
			
			if( hour > 0 && hour <= 2 ) {
				System.out.println("오늘 좀 안됐다 그만하자");
				stress += 5;
			} else if (hour <= 4) {
				System.out.println("간단하게 한게임 했다");
				stress -= 10;
			} else {
				System.out.println("오늘 신났다");
				stress -= 20;
			}
		}
		
		study(title);
		
//		stress -= 10;	// 위 조건에 따라 수치 변동
		hungry += 3 + (hour * 0.7);
		
		return stress;
	}
	
	// 공부할때랑 게임할때 받는 스트레스가 다르니까
	// 스트레스를 전달할 수 있는 study를 오버로딩한 메소드 만들기
	
	/* 생성자 */
	// 이름과 나이를 입력받지 않으면 생성 못하게 만들기
	// 나이는 중요하지 않아서 이름 있어도 생성할 수 있게 만들기
	// 단, 두번째 생성자에서는 이름과 나이를 전달받는 생성자 호출하기
	
	
	// 내 정보 보기
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", addr=" + addr + ", gender=" + gender + ", major=" + major
				+ ", hasGlasses=" + hasGlasses + ", intel=" + intel + ", stress=" + stress + ", hp=" + hp + ", hungry="
				+ hungry + "]";
	}
	
	
	

}
