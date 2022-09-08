package q01.quiz01;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("3자리의 정수를 입력하세요: ");
		int num = input.nextInt();
		
		int one = num % 10;	// 일의 자리
		int ten = (num/10)%10;
		int hundred = (num/10)/10;
		
		int sum = one + ten + hundred; 
		System.out.println(num + "의 각 자리수 합은 " + sum +"입니다.");
		
		
		
	}

}
