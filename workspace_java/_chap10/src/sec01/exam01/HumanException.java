package sec01.exam01;

public class HumanException extends Exception {

	HumanException(){
		System.out.println("HumanException 생성자 실행");
	}
	
	HumanException(String message){
		super(message);
		System.out.println("HumanException String 전달인자 생성자 실행");
	}
}
