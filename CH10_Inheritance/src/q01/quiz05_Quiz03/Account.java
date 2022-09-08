package q01.quiz05_Quiz03;

public class Account {
	String accountNo; 	// 계좌번호
	String ownerName;	// 예금주 이름
	public int balance; 	// 잔액

	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	

	public void deposit(int amount) {
		this.balance += amount; 
		System.out.println("예금을 성공했습니다. 예금 후 잔액 : " + this.balance);
	}
	
	public int withdraw(int amount) throws Exception {	// 인출
		if(balance < amount)	// 잔액이 요구금액보다 적으면 예외 발생
			throw new Exception("잔액이 부족합니다.");
		this.balance -= amount;
		return this.balance;
	}
	
}
