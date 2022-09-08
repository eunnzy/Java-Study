package q01.quiz04_Quiz07;

public class MyInteger {
	private int value;
	
	public MyInteger() {
		this.value = 0;
	}
	
	public MyInteger(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	
	// value가 짝수인지 아닌지 확인
	public boolean isEven() {
		if(this.value%2 == 0)	// 짝수면
			return true;	// true 리턴
		
		return false;	// 홀수면 false 리턴
	}
	
	// value가 홀수인지 아닌지 확인
	public boolean isOdd() {
		if(this.value%2 != 0)	// 홀수이면 
			return true;	// true 리턴
		
		return false;	// 짝수이면 false 리턴
		
	}
	
	// value의 값과 number의 값이 같은지 확인
	public boolean equals(int number) {
		if(this.value == number)		// value = number이면
			return true;				// true 리턴
		
		return false;		// value와 number가 동일한 값이 아니면 false 리턴
	}
}
