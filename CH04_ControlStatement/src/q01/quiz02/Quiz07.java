package q01.quiz02;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("매월 적금 금액을 입력하세요 : ");
		int invest = input.nextInt(); 		// 매월 적금 금액
		System.out.print("연이자율을 입력하세요 : ");
		double interestRate = input.nextDouble();  // 연이자율
		
		double monthlyRate = interestRate / 12 / 100; // 월 이자율 환산
		
		double balance = 0;	 	// 적음 처1음 시작할 때 통장 잔고에는 0원부터 시작, 1개월 지난 이후부터 이자가 붙으므로
		for(int i=0; i<6; i++) {		// 6번 실행
			balance = (balance + invest) * (1 + monthlyRate);
		}
		System.out.println("총 금액은 " + balance +"입니다.");
		
	}

}
