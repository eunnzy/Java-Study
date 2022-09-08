package q01.quiz02;

import java.util.Scanner;

// 비만도 계산하기
public class Quiz02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("체중을 입력하세요: ");
		double weight = input.nextDouble();
		System.out.print("키를 입력하세요(meter단위): ");
		double height = input.nextDouble();
		
		
		double bmi = weight / (height * height);
		System.out.println("bmi = " + bmi);
		
		if(bmi < 18.5) {
			System.out.println("저체중입니다.");
		}else if(bmi >= 18.5 && bmi < 25) {
			System.out.println("정상 체중입니다.");
		}else if(bmi >= 25 && bmi < 30) {
			System.out.println("과체중입니다.");
		}else {
			System.out.println("비만입니다.");
		}
		
	}

}
