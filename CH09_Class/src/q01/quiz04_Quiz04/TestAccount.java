package q01.quiz04_Quiz04;

public class TestAccount {
	
	public static void main(String[] args) {
		// id가 1122이고, balance가 20000원인 account 인스턴스 생성
		Account account = new Account(1122, 20000);
		account.setAnnualInterestRate(4.5);
		// 연이자율 4.5로 설정
		
		account.withdraw(2500);
		account.deposit(3000);
		
		System.out.println("잔고: " + account.getBalance() + " 월 이자율: " + account.getMonthlyInterestRate());
		
		
	}
}
