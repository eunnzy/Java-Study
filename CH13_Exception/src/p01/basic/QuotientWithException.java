package p01.basic;

import java.util.Scanner;

/*
	Java RuntimeException class 사용하여 에러 처리 방법
	1. try {} catch {} 문법을 사용
	2. try 안에는 나눗셈 method를 실행하고, 나눗셈 method를 실행하면서 Exception 인스턴스가 발생하면
	   catch 안에 있는 코드를 실행함.
	 - 2.1 try 안에는 나눗셈 method를 실행하면서 Excepton instance가 발생하지 않으면 catch 절 안에 있는 코드 실행 안함
	3. try 안에 Exception이 발생하여 catch 절이 실행되더라도 전체 프로그램의 나머지 코드들이 정상적으로 실행.
*/
public class QuotientWithException {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("2개의 정수를 입력하세요 : ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();

		try {
			int result = quotient(num1, num2);
			System.out.println(num1 + " / " + num2 + " = " + result);
			
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("end of program");
	}
	
	public static int quotient(int num1, int num2) {
		if(num2 == 0) {
//			강제로 Exception을 발생 (ArithmeticException class의 인스턴스를 생성하여 Exception 발생)
			throw new ArithmeticException("분모에 해당하는 값으로 0을 사용할 수 없습니다.");
		}
		return (num1 / num2);
	}
	
	
}
