package p01.basic;

import java.util.Scanner;

/*
	분모를 0으로 나누면 나오는 Exception
	1. 2개의 정수값을 입력 받아, 2개 정수에 대하여 나누기 연산 수행.
	2. 분모로 입력된 정수값이 0이면, Exception error 발생하고 프로그램이 강제 종료되는 현상 발생
*/
public class Quotient {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("2개의 정수를 입력하세요 : ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
		System.out.println("end of program");

	}
	
}
