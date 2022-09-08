package p01.practice;

import java.util.Scanner;

public class PassTwoDimArray {

	public static void main(String[] args) {
		int[][] numbers = getArray(2, 3);
		
		// 입력한 2차원 배열 출력.
		for(int row=0; row<numbers.length; row++) {
			for(int column=0; column<numbers[row].length; column++) {
				System.out.print(numbers[row][column] + " ");
			}
			System.out.println();
		}
		
		// 2차원 배열의 모든 원소의 합 출력
		System.out.println("2차원 배열의 합 : " + sum(numbers));
	}
	
	public static int[][] getArray(int row, int column) {
		int numbers[][] = new int[row][column];
		
		Scanner input = new Scanner(System.in);
		System.out.println(row + "행 "+ column +"열 데이터에 대하여 행 단위로 space로 구분된 데이터를 enter key를 쳐서 입력하세요.");
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				numbers[i][j] = input.nextInt();
			}
		}
		
/*		
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[i].length; j++) {
				numbers[i][j] = input.nextInt();
			}
		}
*/	
		
		return numbers;
	}
	
/*	
	// return 타입이 2차원 배열인 메소드

	public static int[][] getArray() {
		int numbers[][] = new int[2][3];
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("2행 3열 데이터에 대하여 행 단위로 space로 구분된 데이터를 enter key를 쳐서 입력하세요.");
		
		for(int row=0; row<numbers.length; row++) {
			for(int column=0; column<numbers[row].length; column++) {
				numbers[row][column] = input.nextInt();
			}
		}
		
		return numbers;
	}
*/	
	
	public static int sum(int[][] num) {
		int total = 0;
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				total += num[i][j];
			}
		}
		
		return total;
	}

}
