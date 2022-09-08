package p02.inc_dec;

/*
 	increment Operator: ++ (증가 연산자)
 	
 	1. n1++ == n1 + 1,  ++n1 == n1 + 1  =>  n1의 값을 1 증가시키는 것과 같음.
 	2. C 언어, C++, Java 등 프로그래밍 언어에서 사
 */

public class IncrementOperatorEx {

	public static void main(String[] args) {
		int n1 = 10;
		int result;
		
		System.out.println("n1 = " + n1);		// 10
		n1++;	// 후위연산자 n1 = n1 + 1
		System.out.println("n1 = " + n1);		// 11
		
		++n1;	
		System.out.println("n1 = " + n1);	// 12

		result = n1++;		// result = n1;  n1 += 1;
		System.out.println("result = " + result);	// result = 12
		System.out.println("n1 = " + n1);	// 13
		
		result = ++n1;  	// n1 +=1;  result = n1;   
		System.out.println("result = " + result);	// 14
		System.out.println("n1 = " + n1);  // 14
		
	}

}
