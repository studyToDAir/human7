package quiz.dic.학생제출2;

public class 한영사전 extends 사전 {
	
	한영사전(String name) {
		this.name = name;
		System.out.println("\n한영사전을 실행합니다. \n");
		
		this.target[0] = "love";
		this.target[1] = "friendship";
	}
	
}
