package q01.quiz04;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] arr = new double[3][4];		// 3행 4열 2차원 배열 생성
		
		
		// 3행 4열 배열 입력 받기
		System.out.println("3행 4열 배열의 값을 입력해주세요 : ");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = input.nextDouble();
			}
		}
		
		// 배열 정보 출력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) 
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
		
		System.out.println();
		
		int colLength = arr[0].length;
		for(int i=0; i <colLength; i++) {
			double sum = 0;
			for(int j=0; j<arr.length; j++) {
				sum += arr[j][i];
			}
			System.out.println((i+1) + "번째 열의 합계는 " + sum + "입니다.");
		}

	}

}
