package q01.quiz03;

import java.util.Scanner;

public class Quiz08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("3개의 정수를 입력하세요 : ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		
		displaySortedNumbers(num1, num2, num3);
	}
	
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		if(num1 > num2) {	
			if(num1 > num3) {
				if (num2 > num3) {
					System.out.println(num1 + " " + num2 + " " + num3);
				}else {	 	// num2 <= num3
					System.out.println(num1 + " " + num3 + " " + num2);
				}
			}else {	// num1 < num3
				System.out.println(num3 + " " + num1 + " " + num2);
			}
		}else {	// num1 <= num2
			if(num2 > num3) {
				if(num1 > num3) {
					System.out.println(num2 + " " + num1 + " " + num3);
				}else {		// num1 <= num3
					System.out.println(num2 + " " + num3 + " " + num1);
				}
			}else {		// num2 <= num3
				System.out.println(num3 + " " + num2 + " " + num1);
			}
		}
	}

}
