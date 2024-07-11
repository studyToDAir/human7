package quiz.dic.학생제출2;

public class 사전Exam {

	public static void main(String[] args) {

		한영사전 koen = new 한영사전("한영사전");
		
		koen.trKo("love");
		koen.Kotr("우정");
		koen.join("집", "home");
		koen.join("가족", "family");
		koen.join("귀여운", "cute");
		koen.Kotr("집");
		koen.print();
		
		한일사전 kojp = new 한일사전("한일사전");
		kojp.trKo("友情");
		kojp.Kotr("사랑");
		kojp.join("바다", "海");
		kojp.join("커피", "コーヒー");
		kojp.print();
	}

}
