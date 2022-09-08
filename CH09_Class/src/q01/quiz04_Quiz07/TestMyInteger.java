package q01.quiz04_Quiz07;

public class TestMyInteger {

	public static void main(String[] args) {
		MyInteger num1 = new MyInteger(7);
		MyInteger num2 = new MyInteger(26);
		
		System.out.println("num1의 value : " + num1.getValue() +", 짝수 확인 : " + num1.isEven() +", 홀수 확인 : " 
							+ num1.isOdd() + ", num1의 value와 7이 동일한지 확인 : " + num1.equals(7));		
		
		System.out.println("num2의 value : " + num2.getValue() +", 짝수 확인 : " + num2.isEven() +", 홀수 확인 : " 
				+ num2.isOdd() + ", num2의 value와 7이 동일한지 확인 : " + num2.equals(7));	
		
	}

}
