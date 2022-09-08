package p06.user_defined_exception;

/*
	Exception의 자식 class로 user defined Exception 선언 가능.
*/
public class BalanceInsufficientException extends Exception{
	
	public BalanceInsufficientException() {
		
	}

	public BalanceInsufficientException(String message) {
		super(message);	// 부모 클래스인 Exception class의 생성자를 호출.
	}

	
}
