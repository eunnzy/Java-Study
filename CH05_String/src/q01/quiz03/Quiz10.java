package q01.quiz03;

import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int number = input.nextInt();
		
		reverse(number);
	}
	
	public static void reverse(int number) {	// 정수 뒤집기 함수.
		String intToStr = Integer.toString(number);		// 입력받은 정수를 문자열로 바꾸기
		
		String reverseStr = "";	// 뒤집은 정수 담기 위한 변수
		for(int i=intToStr.length()-1; i>=0; i--) {	
				reverseStr += intToStr.charAt(i);
		}
		System.out.println(number +"의 역순 결과 값 :" + reverseStr);
	}

}
