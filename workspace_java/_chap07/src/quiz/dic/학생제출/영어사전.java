package quiz.dic.학생제출;

public class 영어사전 extends 사전 {
	String 영[] = new String[] { "Love", "Friendship", "non" };

	영어사전() {
		this.사전 = "한영사전";
	}

	@Override
	void 펼침(String a) {
		a = "한영사전";
		System.out.println("모르는 단어가 있어서 " + a + " 사전을 펼침");
	}

	String 찾기(String l) {
		for (int i = 0; i < 번역.length; i++) {
			if (l.equals(번역[i])) {
				System.out.println(영[i]);
			}
		}
		return l;
	}
}