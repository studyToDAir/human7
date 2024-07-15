package sec01.exam01;

public interface RemoteControl {

	// 상수 : static final, 변수명을 모두 대문자로
	// interface에서는 public static final 생략 가능
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	// 추상 메소드
	// public abstract 생략가능
	public abstract void turnOn();
	void turnOff();
	void setVolume(int volume);
}
