package p05.practice;

import java.util.Scanner;

// 화씨(F)를 섭씨(C)로 바꾸는 문제

public class FahrenheitToCelcius {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("화씨(F)를 입력하세요. ");
		double fahrenheit = input.nextDouble();
		
		double celcius = (5.0/9) * (fahrenheit - 32);
		System.out.println("입력된 화씨 " + fahrenheit + "는 섭씨 " + celcius +"도 입니다.");
	}

}
