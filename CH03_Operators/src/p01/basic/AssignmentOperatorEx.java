package p01.basic;

/*
	AssignmentOperator(할당 연산자)
	1. = (equal)
	2. +=, -=, *=, /=, %=, .... => C언어부터 사용되는 표현 방식
	
*/

public class AssignmentOperatorEx {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = n1;
		
		System.out.println("n1 = " + n1);

//		n1 = n1 + 10;
		n1 += 10;
		System.out.println("n1 = " + n1 );

//		n1 = n1 - 10;
		n1 -= 10;
		System.out.println("n1 = " + n1 );

//		n1 = n1 * 2;
		n1 *= 2;
		System.out.println("n1 = " + n1 );

//		n1 = n1 / 3;
		n1 /= 3;
		System.out.println("n1 = " + n1 );

	}

}
