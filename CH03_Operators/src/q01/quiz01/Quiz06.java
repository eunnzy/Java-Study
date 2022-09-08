package q01.quiz01;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("실수값 a와 b의 값을 입력해주세요: ");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		
		if ((a > 0 && a < 1) && (b > 0 && b < 1)) {
			System.out.println("두 수 모두 0과 1 사이에 있습니다.");
		}else if((a > 0 && a < 1)) {
			System.out.println("a만 0과 1사이에 있습니다.");
		}else if((b > 0 && b < 1)) {
			System.out.println("b만 0과 1사이에 있습니다.");
		}else {
			System.out.println("두 수 모두 0과 1 사이에 있지 않습니다.");
		}
		
		
		
		
	}

}
