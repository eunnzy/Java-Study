package p01.basic;

import java.util.Scanner;

/*
	배열 사용해서 코딩 단순화 예제 (simplifying)
*/

public class ArrayBasic8 {

	public static void main(String[] args) {
		String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul" ,"Aug", "Sep", "Oct", "Nov", "Dec"};
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("달력 숫자를 입력하세요. (1 ~ 12 사이의 숫자)");
		int month = input.nextInt();
		
		System.out.println("이번 달은 " +months[month-1] + " 입니다.");

		
//		switch(month) {
//		case 1:
//			System.out.println("이번달은 ");
//			break;
//		case 1:
//			System.out.println("이번달은 ");
//			break;
//		}
		
	}

}
