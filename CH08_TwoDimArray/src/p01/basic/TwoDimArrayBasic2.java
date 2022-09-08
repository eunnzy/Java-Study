package p01.basic;

public class TwoDimArrayBasic2 {

	public static void main(String[] args) {
		int[][] numbers = new int[4][3];
		
		numbers[0][0] = 1;
		numbers[0][1] = 2;
		numbers[0][2] = 3;
		
		numbers[1][0] = 4;
		numbers[1][1] = 5;
		numbers[1][2] = 6;

		numbers[2][0] = 7;
		numbers[2][1] = 8;
		numbers[2][2] = 9;

		numbers[3][0] = 10;
		numbers[3][1] = 11;
		numbers[3][2] = 12;

		// 행(row)의 길이
		System.out.println("행의 길이 : " + numbers.length);

		// 열(column)의 길이
		System.out.println("열의 길이 : " + numbers[0].length);
		System.out.println("열의 길이 : " + numbers[1].length);
		System.out.println("열의 길이 : " + numbers[2].length);
		
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
	}

}
