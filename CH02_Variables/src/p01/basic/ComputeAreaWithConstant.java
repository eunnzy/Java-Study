package p01.basic;

import java.util.Scanner;

public class ComputeAreaWithConstant {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double PI = 3.14159; // 상수(값을 변경할 수 없고 고정된 수)는 대문자로 표현.
		/* 
		 * 상수는 변하지 않는 값 --> 변수 선언시 "final" 키워드 사용
		 * 선언시 초기값(상수값)을 넣어주어야 함.
		 * 한 번 넣어 준 상수값을 수정할 수 없다.
		 * ex. PI = 3.15로 바꿀 수 없음. (오류)
		 */	
		double radius;
		double area;
		
		// 1. 원의 반지름을 console 키보드에서 읽어 오기
		
		System.out.println("원의 반지름을 입력하세요: ");
		radius = input.nextDouble();
		
		area = radius * radius * PI;

		// 3. 원의 면적을 출력하기 (console 창에 보여주기)
		System.out.println("원의 반지름: " + radius + "인 원의 면적은 " + area +"입니다.");
		
	}

}
