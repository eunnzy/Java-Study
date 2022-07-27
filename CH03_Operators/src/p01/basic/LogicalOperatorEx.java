package p01.basic;

/*
 	Logical Operator(논리연산자)
 	1. && (AND)
 	2. || (OR)
 	3. !(NOT)
 */

public class LogicalOperatorEx {

	public static void main(String[] args) {
		int a1 = 10;
		int a2 = 20;
		int a3 = 20;
		int a4 = 0;
		boolean bResult;
		
		bResult = (a1 < a2) && (a2 == a3);				// true && true -> true
		System.out.println("bResult = " + bResult);
		
		bResult = (a1 < a2) || (a2 == a3);			 	// true || true	-> true
		System.out.println("bResult = " + bResult);
		
		bResult = (a1 > a2) && (a2 == a3);				// false && true -> false
		System.out.println("bResult = " + bResult);
		
		bResult = (a1 > a2) || (a2 == a3);				// false || true -> true
		System.out.println("bResult = " + bResult);
		
		bResult = !(a1 > a2);							// !false  = true 
		System.out.println("bResult = " + bResult);
	}

}
