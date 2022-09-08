package q01.quiz02;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// 컴퓨터가 낸 것
		int computerNum = (int) (Math.random() * 2);
		System.out.print("가위(0), 바위(1), 보(2) 중 숫자 0, 1, 2 중 하나의 숫자를 입력하세요: ");
		int userNum = input.nextInt();
		System.out.println("컴퓨터가 낸 것: " + computerNum);
		
		if (userNum == computerNum) {	// 컴퓨터와 사용자가 동일한 것을 낸 경우
			System.out.println("비겼습니다.");
		} else if ( (userNum == 0 && computerNum== 2) || (userNum == 1 && computerNum == 0) || (userNum == 2 && computerNum == 1) ) {	// 사용자가 이긴 경우
			System.out.println("당신이 이겼습니다.");
		} else {		// 컴퓨터가 이긴 경우
			System.out.println("당신이 졌습니다.");
		}
		
		
	}

}
