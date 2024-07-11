package quiz.dic.학생제출2;

public class 사전 {

	String name;
	String[] ko = new String[10];
	String[] target = new String[10];
	int cnt = 2;
	
	사전() {
//		System.out.println("사전을 실행합니다. ");
		
		this.ko[0] = "사랑";
		this.ko[1] = "우정";
	}
	
	/**
	 * taget -> 한국어 변역
	 * 
	 * 전달인자로 한국어로 변역할 단어 받기
	 * for문 돌려서 일치하는 단어 찾기, 있다면 한국어로 return 해줌
	 * 일치하는 단어가 없다면 "사전에 등록되지 않음" 출력
	 * 
	 * 전달인자 : String 번역 대상 단어
	 * 리턴타입 : String 번역된 단어
	*/
	String trKo(String target) {
		String result = "";
		boolean is = false; 
		// 조건이 맞으면 true가 됨, for문이 끝난 후 등록X 출력문 출력 
		// => for문이라 여러개 출력 되는 걸 막는 법
		
		for(int i = 0; i < this.target.length; i++) {
			
			if(target.equals(this.target[i])) {
				result = this.ko[i];
				System.out.println(this.target[i] + " - " + this.ko[i]);
				is = true;
			}
		}
		
		if(!is) {
			System.out.println("사전에 등록되지 않은 단어입니다. ");
			result = null;
		}
		
		return result;
	}
	
	/**
	 * 한국어 -> taget 변역
	 * 
	 * 전달인자로 한국어로 변역할 단어 받기
	 * for문 돌려서 일치하는 단어 찾기, 있다면 한국어로 return 해줌
	 * 일치하는 단어가 없다면 "사전에 등록되지 않음" 출력
	 * 
	 * 전달인자 : String 번역 대상 단어
	 * 리턴타입 : String 번역된 단어
	*/
	String Kotr(String ko) {
		String result = "";
		boolean is = false;
		
		for(int i = 0; i < this.ko.length; i++) {
			
			if(ko.equals(this.ko[i])) {
				result = this.target[i];
				System.out.println(this.ko[i]+ " - " + this.target[i]);
				is = true;
			}
		} 
		
		if(!is) {
			System.out.println("사전에 등록되지 않은 단어입니다. ");
			result = "X";
		}
		
		return result;
	}
	
	
	/**
	 * 단어 추가 메소드
	 * 
	 * 매소드 실행 시 단어 추가 됨
	 * 
	 * 전달인자 : String 추가할 단어
	 * 리턴타입 : X
	*/
	void join(String word, String target) {
		if(cnt < ko.length) {
			
			ko[cnt] = word;
			this.target[cnt] = target;
			
			cnt++;
		} else {
			System.out.println("최대 "+ (ko.length - 1)+"단어만 등록할 수 있습니다.");
		}
	}
	
	/**
	 * 사전 내용 프린트 메소드 
	*/
	void print() {
		System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("\n~ " + this.name + " ~\n");
		for(int i = 0; i< cnt; i++) {
			System.out.println(ko[i] + "\t | "+ this.target[i] );
		}
		System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
	}
	
}
