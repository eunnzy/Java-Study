package q01.quiz02;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;			// 모든 정수들의 합
		int positiveCount = 0;		// 양의 정수 개수 count	
		int negativeCount = 0;		// 음의 정수 개수 count
		
		while(true) {
			System.out.print("정수를 입력하세요: ");
			int num = input.nextInt();
			if(num == 0)		// 입력한 정수가 0이면
				break;			// 무한 반복 종료(while문 종료)
			else if(num > 0){		// 양의 정수면
				positiveCount++;	// positiveCount = positiveCount + 1
				sum += num;			// sum = sum + num (정수들의 합 계산)
			}else {					// 음의 정수면
				negativeCount++;	// negativeCount = negativeCount + 1
				sum += num;			// sum = sum + num (정수들의 합 계산)
			}
		}
		
		System.out.println("양수 전체 개수: " + positiveCount);
		System.out.println("음수 전체 개수: " + negativeCount);
		
		double avg = sum / (double) (positiveCount + negativeCount);
		System.out.println("전체 평균값: " + avg );
		
	}

}
