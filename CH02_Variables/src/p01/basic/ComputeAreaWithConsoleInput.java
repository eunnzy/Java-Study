package p01.basic;

import java.util.Scanner;

// 데이터를 입력 받아 오기 위한 input 클래스
public class ComputeAreaWithConsoleInput {
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		double radius;
		double area;
		
		// 1. 원의 반지름 console
		System.out.print("원의 반지름을 입력하세요: ");
		radius = input.nextDouble();
		
		// 2. 원의 면적 계산하기: 입력 데이터를 출력 데이터로 가공
		area = radius * radius * 3.14159;
		
		// 3. 원의 면적을 출력하기 (console 창에 보여주기)
		System.out.println("원의 반지름: " + radius + "인 원의 면적은 " + area +"입니다.");

	}

}
