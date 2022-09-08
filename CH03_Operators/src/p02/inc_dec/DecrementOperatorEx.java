package p02.inc_dec;

/*
 	decrement operator : --
 	
*/

public class DecrementOperatorEx {

	public static void main(String[] args) {
		int n1 = 10;
		int result;
		
		System.out.println("n1 = " + n1);		// 10
		n1--;		// n1 = n1 - 1 (n1 -= 1)
		System.out.println("n1 = " + n1);	// 9

		--n1;
		System.out.println("n1 = " + n1);	// 8
		
		result = n1--;			//result = n1;  n1 = n1 -1;
		System.out.println("result = " + result); // 8
		System.out.println("n1 = " + n1);	// 7
		
		result = --n1;			// n1 = n1 -1; result = n1;
		System.out.println("result = " + result);	// 6
		System.out.println("n1 = " + n1);	// 6
		
	}

}
