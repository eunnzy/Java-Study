package p01.basic;

/*
	+, -, *, /, % : 산술연산자(Arithmetic operator)
	
 */

public class ArithmeticOperatorEx {

	public static void main(String[] args) {
		int a1 = 10;
		int a2 = 3;
		int result;
		double dresult;
		
		result = a1 + a2;
		System.out.println("result = " + result);
		
		result = a1 - a2;
		System.out.println("result = " + result);
		
		result = a1 * a2;
		System.out.println("result = " + result);

		result = a1 / a2;			// 몫의 값을 가져옴
		System.out.println("result = " + result);
				
		result = a1 % a2;			// 나머지 값을 가져옴.
		System.out.println("result = " + result);
		
		dresult = a1 / (double)a2;
// ==   dresult = (double)a1 / a2;  -> a1이나 a2 둘 중에 하나만 double로 바꾸어 주어도 double로 형변환 됨.
 		System.out.println("dresult = " + dresult);
		
		// a2를 double로 자동 형변환시킴

	}

}
