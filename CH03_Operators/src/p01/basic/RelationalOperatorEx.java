package p01.basic;

/*
 	Relational Operator (비교 연산자)  ==, != , > , >= , <, <=
 	1. a == b : a와 b의 값이 같으면 true, 다르면 false 반환
 	2. a != b : a와 b의 값이 같지 않으면 true, 같으면 false 반환
 	3. a > b : a가 b보다 크면 true, 작거나 같으면 false 반환
 	4. a >= b : a가 b보다 크거나 같으면 true, 작으면 false 반환
 	5. a < b : a가 b보다 작으면 true, 크거나 같으면 false 반환
 	6. a <= b : a가 b보다 작거나 같으면 true, 크면 false 반환
 	
 */

public class RelationalOperatorEx {

	public static void main(String[] args) {
		int a1 = 5;
		int a2 = 10;
		int a3 = 5;
		boolean bResult;
		
		System.out.println("a1 == a2: " + (a1 == a2));
		System.out.println("a1 == a3: " + (a1 == a3));
		
		bResult = (a1 == a2);
		System.out.println("bResult = " + bResult);
		bResult = (a1 == a3);
		System.out.println("bRsult = " + bResult);
		
		System.out.println("a1 != a2: " + (a1 != a2));
		System.out.println("a1 != a3: " + (a1 != a3));

		System.out.println("a1 > a2: " + (a1 > a2));
		System.out.println("a1 < a3: " + (a1 < a3));
		
		System.out.println("a1 >= a2: " + (a1 >= a2));
		System.out.println("a1 <= a3: " + (a1 <= a3));
	
	}

}
