package quiz;

// 은행 계좌
public class Account {

	String bankName;
	long money = 0;
	boolean isDebug = true;
	
	Account(String bankName){
		this.bankName = bankName;
	}
	
	
	/*
	 *  입금 : 단 음수 입력 막기
		출금 : 단 음수, 잔액보다 큰 수 출금 막기
		확인 : 잔액 출력
	 */
	
	// 입금
	// 기존의 잔액에
	// 입금액을 더하기 한다
	// 전달인자가 음수인 경우 더하지 않는다
	// 전달인자 : int 입금액
	// 리턴타입 : 없음
	/**
	 * @param int 입금액
	 * @return void
	 */
	void income(long money) {
		if(isDebug) {
			System.out.println("입금 : 받은돈 : "+ money);
		}
		if(money > 0) {
			this.money += money;
		}
	}
	
	/**
	 * 출금 : 단 음수, 잔액보다 큰 수 출금 막기
	 * 기존의 잔액에
	 * 출금액을 빼서 저장한다
	 * 단, 전달인자가 음수 또는 잔액보다 큰 경우 제외
	 * 
	 * @param int 출금액
	 * @return void
	 */
	void outcome(long money) {

		if(isDebug) {
			System.out.println("출금 : 받은돈 : "+ money);
			System.out.println("money > 0 : "+ (money > 0));
			System.out.println("this.money >= money : "+ (this.money >= money));
		}
		
		if(money > 0) {
			if(this.money >= money) {
				this.money -= money;
			}
		}
	}
	
	/**
	 * 확인 : 잔액 출력
	 * 
	 * @param 없음
	 * @return int 잔액
	 */
	long view() {
		System.out.println("은행이름 : "+ this.bankName);
		System.out.println("현재 잔액 : "+ this.money);
		return this.money;
	}
	
}










