package q01.quiz02;

import java.util.Scanner;

public class Quiz05 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int randomNum = (int) (Math.random() * 100);	// 0 ~ 100까지 중 하나의 랜덤 숫자 리턴.
		
	//	System.out.println(randomNum );
		
		do {
			System.out.println("0 ~ 100까지 숫자를 추측해 보세요 : ");
			int guess = input.nextInt();	// 추측값 입력 받기
			
			if(randomNum == guess) {		// 랜덤 숫자와 사용자가 추측한 숫자가 같으면
				System.out.println("숫자가 " + randomNum +" 정확히 맞추었습니다.");
				break;	// 무한루프 종료
			}else if(randomNum > guess) {	   // 랜덤 숫자 > 추측한 숫자
				System.out.println("당신이 추측한 숫자의 값이 낮습니다.");
			}else {		                // 랜덤 숫자 < 추측한 숫자
				System.out.println("당신의 추측한 숫자의 값이 높습니다.");
			}
			
			
		}while(true);
		
	}
}
