package q01.quiz05_Quiz01;

import java.util.Scanner;

public class TestTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("side 1의 값을 입력하세요  = ");
		int side1 = input.nextInt();
		System.out.print("side 2의 값을 입력하세요  = ");
		int side2 = input.nextInt();
		System.out.print("side 3의 값을 입력하세요  = ");
		int side3 = input.nextInt();
		
		System.out.print("도형의 색깔 입력하세요  = ");
		String color = input.next();
		
		System.out.print("filled 값을 입력하세요 (도형의 색깔이 true, 색깔이 채워져있지 않으면 false) : ");
		boolean filled = input.nextBoolean();

		// 입력 받은 값으로 triangle 인스턴스 생성
		Triangle triangle = new Triangle(side1, side2, side3, color, filled);
		
		System.out.println("Triangle 전체 정보 : " + triangle.toString());
		System.out.println("Triangle color : " + triangle.getColor());
		System.out.println("Triangle area : " + triangle.getArea());
		System.out.println("Triangle Perimeter : " + triangle.getPerimeter());
		System.out.println("Triangle filled : " + triangle.isFilled());

	}

}
