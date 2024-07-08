package sec06.exam06._get_set;

public class Car {
	
	private int speed;
	private boolean stop;
	
	// getter는 필드값을 읽어서 리턴하는 기능
	// 메소드명 : get + 필드명(첫글자만 대문자)
	// 전달인자 : 없음
	// 리턴타입 : 필드의 타입
	public int getSpeed() {
		return this.speed;
	}
	
	// setter는 필드값을 수정할 수 있는 기능
	// 메소드명 : set + 필드명(첫글자만 대문자)
	// 전달인자 : 필드의 타입으로된 변수
	// 리턴타입 : 없음
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	// getter 중에서 boolean 타입일 경우
	// get+필드명 대신에 is+필드명도 가능하나
	// 오류가 발생하는 라이브러리도 있으니 가능하면 get을 쓰자
	public boolean isStop() {
		return this.stop;
	}
}
