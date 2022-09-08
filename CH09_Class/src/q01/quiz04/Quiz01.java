package q01.quiz04;

import java.util.Scanner;

// 2차원 테이블 행 합계 구하기
public class Quiz01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] arr = new double[3][4];		// 3행 4열 2차원 배열 생성
		
		
		// 3행 4열 배열 입력 받기
		System.out.println("3행 4열 배열의 값의 값을 입력해주세요 : ");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = input.nextDouble();
			}
		}
		
		
		// 배열 정보 출력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 행의 합계 출력
		for(int i=0; i<arr.length; i++) {
			double sum = 0;
			for(int j=0; j<arr[i].length; j++) {
				sum += arr[i][j];
			}
			System.out.println((i+1) + "번째 행의 합계는 " + sum + "입니다.");
		}
		
	}

}
