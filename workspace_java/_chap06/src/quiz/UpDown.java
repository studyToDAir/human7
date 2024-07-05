package quiz;

public class UpDown {

	int number = (int)(Math.random() * 100) % 10;
	
	// number의 숫자를 지정하는 기능
	void setNumber(int num) {
		number = num;
	}
	
	// 임의의 수로 교체
	void initNumber() {
		number = (int)(Math.random() * 100) % 10;
	}
	
	void hint() {
		System.out.println("number : "+ number);
	}
	
	// up down 정답을 판단하는 기능
	// 전달인자 : int(추측한 숫자)
	// 리턴타입 : 없음
	void answer(int num) {
		if(number == num) {
			System.out.println("정답입니다");
		} else if (number > num) {
			System.out.println("UP");
		} else if (number < num) {
			System.out.println("DOWN");
		}
	}
	
}
