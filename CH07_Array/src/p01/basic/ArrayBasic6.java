package p01.basic;

public class ArrayBasic6 {

	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};		// 배열 초기값을 넣을 때 length에도 전체 개수를 설정
		int sum = 0;
		
		for(int score : scores) {
			sum += score;
		}
		
		double average = (double)sum / scores.length;
		
		System.out.println("전체 합계 : " + sum);
		System.out.println("전체 평균 : " + average);
	}

}
