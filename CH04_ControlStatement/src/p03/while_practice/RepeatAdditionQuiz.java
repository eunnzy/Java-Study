package p03.while_practice;

import java.util.Scanner;

/*
   	0~9 사이의 2개의 숫자를 random number 숫자를 생성하여 합계(덧셈 결과)를 만든 후,
	사용자로부터 console에서 덧셈 결과를 입력받아 내부적으로 생성한 덧셈겨로가와 일치할 때까지 while문 수행
*/
public class RepeatAdditionQuiz {

	public static void main(String[] args) {
		int number1 = (int)(Math.random() * 10); 
		int number2 = (int)(Math.random() * 10); 
		
		Scanner input = new Scanner(System.in);
		System.out.println(number1 + "과 " + number2 + "의 합계는?");
		int answer = input.nextInt();
		
		// while 내부 수행 조건: 정답이 틀릴 경우에만 while문이 반복 수행됨.
		while(answer != (number1 + number2)) {
			System.out.println("정답이 아닙니다. 다시 시도해 보세요.");
			System.out.println(number1 + "과 " + number2 + "의 합계는?");
			answer = input.nextInt();
		}
		
		System.out.println("예, 정답입니다. 잘 맞추셨습니다.");
		
		
	}

}
