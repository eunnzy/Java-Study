package q01.quiz03;

import java.util.Scanner;

public class Quiz09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		long num = input.nextLong();
		
		System.out.println("각 자리수를 더한 값은 " + sumDigits(num) +"입니다.");
		
	}
	
	public static int sumDigits(long n) {
		String longToStr = Long.toString(n);
		
		int sum = 0;
		for(int i=0; i<longToStr.length(); i++) {
			sum += longToStr.charAt(i) - '0';			// 문자를 숫자로 바꿔주기 위해 -'0'을 뺴준다.
		}
		
		return sum;
	}
}
