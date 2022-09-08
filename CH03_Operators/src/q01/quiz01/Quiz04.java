package q01.quiz01;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("4개의 정수값을 입력해주세요: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		
		if ( (a == b) && (a == c)  && (a == d)) {
			System.out.println("4개 정수값이 동일합니다.");
		}else {
			System.out.println("4개의 정수값이 동일하지 않습니다.");
		}
	}

}
