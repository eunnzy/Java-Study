package p07.break_continue;

public class ContinueEx {

	public static void main(String[] args) {
		int sum = 0;
		
		// 1 ~ 10사이의 짝수의 합
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) {		// 홀수인 경우
				continue;		// 다음 i
			}
			sum += i;
		}
		
		System.out.println("1~10사이의 짝수의 합 = " + sum);
		
	}

}
