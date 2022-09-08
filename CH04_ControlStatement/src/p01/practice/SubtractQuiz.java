package p01.practice;

import java.util.Scanner;

/*
  	뺄셈 퀴즈 : 2개의 정수로 부터 뺄셈 연산을 수행 => 결과값을 항상 양의 정수로 출력하고 싶어함.
	1. 결과값을 항상 양의 정수로 출력하고 싶음: num1 - num2 (num1, num2가 있을 때, 항상 num1이 num2보다 크게 커야 됨)
	2. 2개의 정수값 0 ~ 9 사이의 숫자
*/

public class SubtractQuiz {

	public static void main(String[] args) {
		// Math.random() => return 값을 0 ~ 0.9999999 사이의 실수값을 return (난수: 실행할 때마다 값이 바뀜)
		// Math.random() * 10 => 0 ~ 9.999999 값 리턴
		// (int) (Math.random()*10) => 0, 1, 2, ..., 9
		int num1 = (int)(Math.random()*10); // 0~9사이의 랜덤값을 줌.
		int num2 = (int)(Math.random()*10); // 0~9사이의 랜덤값을 줌.	
		
		if(num1 < num2) {
			// 2개의 숫자를 바꾸는 로직.
			int temp;
			
			temp = num1; 	// temp에는 num1의 값을 넘기고
			num1 = num2;	// num1에 num2 값을 넘겨준다.
			num2 = temp;	// 마지막으로 num2에 temp값(num1의 값)을 넘겨준다. 
			
		}
		
		System.out.println("num1이 " + num1 + "이고 " + "num2가 " + num2 +"인 경우 num1 -num2의 값은?" );
		
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		
		if( (num1 - num2) == answer) {
			System.out.println("네 맞습니다.");
		}else {
			System.out.println("안타깝지만 틀리셨습니다.");
			System.out.println(num1 + " - " + num2 + "는 " + (num1 - num2) + "이어야 합니다.");
		}
	
	}

}
