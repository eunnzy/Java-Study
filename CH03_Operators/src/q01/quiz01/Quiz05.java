package q01.quiz01;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("a와 b의 값을 입력해 주세요: ");
		int a = input.nextInt();
		int b = input.nextInt();
		
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a + b / 2 = " + ((a + b) / 2));
		System.out.println("최대값: " + ((a > b) ? a : b));
		System.out.println("최소값: " + ((a < b) ? a : b));
		
	}

}
