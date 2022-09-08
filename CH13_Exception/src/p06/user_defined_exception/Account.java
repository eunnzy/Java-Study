package p06.user_defined_exception;

/*
	Account : 은행 계좌 잔고 관리 class
*/
public class Account {
	private long balance;	// 계좌 잔고 금액
	
	public Account() {
		
	}
	
	public long getBalance() {
		return balance;
	}
	
	// 입금
	public void deposit(int money) {
		balance += money;
	}
	
	// 출금
	public void withdraw(int money) throws BalanceInsufficientException {
		if(balance < money) {
			throw new BalanceInsufficientException("잔고부족 : " + (money - balance) + " 모자람");		// 메소드가 끝나버림.
		}
		balance -= money;
	}
	
}
