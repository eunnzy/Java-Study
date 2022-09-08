package p06.user_defined_exception;

public class AccountEx {

	public static void main(String[] args) {
		Account account = new Account();
		
		// 예금하기
		account.deposit(10000);
		System.out.println("예금액 : " + account.getBalance());
		
		try {
			// 출금하기
			account.withdraw(30000);
		} catch (BalanceInsufficientException e) {
			String message = e.getMessage();		// error 메세지를 message에 저장
			System.out.println(message);
		}
		
		
//		try {
//			account.withdraw(20000);
//		} catch (BalanceInsufficientException e) {
//			e.printStackTrace();		// 그냥 오류 출력.
//		}
		
	}

}
