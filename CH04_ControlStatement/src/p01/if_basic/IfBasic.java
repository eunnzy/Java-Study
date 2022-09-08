package p01.if_basic;

import java.util.Scanner;

/*
	if(boolean) { A; } else { B; }
		-> boolean이 true이면 A 실행, false이면 B 실행.

*/

public class IfBasic {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("원의 반지름을 입력하세요: ");
		int radius = input.nextInt();
		
		double area = 0.0;
		
		// 반지름이 0이상인 경우에만 아래 조건문을 실행.
		if(radius >= 0) {		
			area = radius * radius * 3.14159;
			System.out.println("원의 면적은 " + area +"입니다.");
		}else {
			System.out.println("반지름은 양수를 입력하셔야 합니다.");
		}
		
		
	}

}
