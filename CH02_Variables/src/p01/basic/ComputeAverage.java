package p01.basic;

import java.util.Scanner;

// 3개의 데이터를 키보드에서 입력 받아서 평균값 구하기.
public class ComputeAverage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// 1. 3개의 데이터를 console에서 읽기
		System.out.print("3개의 데이터를 입력: ");
		
		// console에서 여러개의 데이터를 입력할 때 space로 구분하거나 enter로 구분
		double number1 = input.nextDouble();
		System.out.println("number1: " + number1); 
		double number2 = input.nextDouble();
		System.out.println("number2: " + number2); 
		double number3 = input.nextDouble();
		System.out.println("number3: " + number3); 
		
		// 2. 3개의 데이터를 가지고 평균값 구하기
		double average = (number1 + number2 + number3)/3;
		
		
		// 3. console에 평균값 display
		System.out.println(number1 + " " + number2 +" " + number3 +" 의 평균값은 " +average +"입니다.");
		
	}

}
