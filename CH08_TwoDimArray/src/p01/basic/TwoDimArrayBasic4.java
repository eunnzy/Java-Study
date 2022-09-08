package p01.basic;

public class TwoDimArrayBasic4 {

	public static void main(String[] args) {
		int[][] num;
		
		// 비정방형 배열 : 각 행의 열의 개수가 다른 배열.
		num = new int[4][];		// 행의 개수만 배열 크기 선언하고, 열의 개수는 모름.
		
		num[0] = new int[1];
		num[1] = new int[2];
		num[2] = new int[3];
		num[3] = new int[4];
		
	}

}
