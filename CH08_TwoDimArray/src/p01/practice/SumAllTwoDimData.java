package p01.practice;

public class SumAllTwoDimData {

	public static void main(String[] args) {
		int[][] numbers = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9},
				{10, 11, 12}
		};
		
		int sum = 0;
		
		// 배열 원소 전체 합
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[i].length; j++) {
				sum += numbers[i][j];
			}
		}
		System.out.println("2차원 배열 전체 원소의 합 : " + sum);
		
		// 각 행의 합
		for(int i=0; i<numbers.length; i++) {
			int rowSum = 0;
			for(int j=0; j<numbers[i].length; j++) {
				rowSum += numbers[i][j];
			}
			System.out.println((i+1) + "번째 행의 합 : " + rowSum);
		}
		System.out.println();
		
	
		// 각 열의 합
		int colLength = numbers[0].length;		// 열의 길이.
		System.out.println(colLength);			// 3
		for(int col=0; col<colLength; col++) {			
			int colSum = 0;
			for(int row=0; row<numbers.length; row++) {		
				colSum += numbers[row][col];
//				System.out.println("numbers[" + row + "][" + col +"] : " + numbers[row][col]);
			}
		
			System.out.println((col+1) + "번째 열의 합 : " + colSum);
		}
		
	}

}
