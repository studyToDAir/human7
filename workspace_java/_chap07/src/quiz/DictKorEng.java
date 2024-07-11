package quiz;

public class DictKorEng {
	
	String ko_word1 = "사랑";
	String en_word1 = "love";
	
	String ko_word2 = "우정";
	String en_word2 = "friendship";
	
	// String으로 이루어진 배열 : String[]
	// 그 배열의 변수명 : ko_word
	// String으로 이루어진 2개짜리 배열을 생성해라 : new String[2]
	// String 변수 2개를 자동 생성했다
	String[] ko_word = new String[2];
	String[] en_word = new String[2];
	
	DictKorEng() {
		
		// 그 2개의 변수 중 첫번째 변수는 : ko_word[0]
		ko_word[0] = "사랑";
		en_word[0] = "love";

		ko_word[1] = "우정";
		en_word[1] = "friendship";
	}

//	// 메소드명 translate
//	// 전달인자 String 한글단어
//	// 리턴타입 String 영어단어
//	String translate(String word) {
//		if(ko_word1.equals(word)) {
//			return en_word1;
//		} else if(ko_word2.equals(word)) {
//			return en_word2;
//		} else {
//			return "그런 단어는 모릅니다";
//		}
//	}
	
	// 메소드명 translate
	// 전달인자 String 한글단어
	// 리턴타입 String 영어단어
	String translate(String word) {
		
		for(int i=0; i<ko_word.length; i++) {
			
			if(ko_word[i].equals(word)) {
				return en_word[i];
			}
			
		}
		
		return "그런 단어는 모릅니다";
	}
	

}
