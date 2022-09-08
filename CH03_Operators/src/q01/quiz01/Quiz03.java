package q01.quiz01;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("매월 적금 금액을 입력하세요: ");
		double investMoney = input.nextDouble();
		
		System.out.print("연이자율을 입력하세요: ");
		double interestRate = input.nextDouble();
		interestRate = interestRate/12/100;
		// 입력한 이자율은 연이자율이므로 한달 이자율 계산
		
		double totalMoney = 0;  // 처음 계좌 0 원으로 시작 한달에 한번씩 investMoney만큼 적금이므로
		for(int i=0; i<6; i++) { 
			totalMoney = (investMoney +totalMoney) * (1+interestRate); 
		}
		
		System.out.println(totalMoney);		
	}

}
