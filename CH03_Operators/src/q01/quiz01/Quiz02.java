package q01.quiz01;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("분 단위의 숫자를 입력해 주세요:");
		int inputMinutes = input.nextInt();
		
		int years = inputMinutes / (1440 * 365);
		int days = inputMinutes / 1440;
		System.out.println(years +"년 " + days + "일 ");
	
		
		
	}

}
