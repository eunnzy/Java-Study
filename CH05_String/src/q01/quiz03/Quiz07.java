package q01.quiz03;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("매월 적금 금액 : ");
		double amount = input.nextDouble();
		System.out.print("월 이자율 : ");
		double monthlyRate = input.nextDouble();
		System.out.print("적금 기간 : ");
		int numOfMonths = input.nextInt();
		
		double convertRate = monthlyRate/100;
		
		double resultSavings = calculateSavings(amount, convertRate, numOfMonths);
		System.out.println(numOfMonths +"개월이 지난 후의 적금액 : " + resultSavings);
		
	}
	
	public static double calculateSavings(double amount, double monthlyRate, int numOfMonths) {
		double balance = 0;
		
		for(int i=0; i<numOfMonths; i++) {
			balance = (balance + amount) * (1+monthlyRate);
		}
		
		return balance;
	}

}
