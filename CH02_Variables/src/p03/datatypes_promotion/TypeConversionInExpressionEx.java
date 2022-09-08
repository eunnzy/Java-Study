package p03.datatypes_promotion;

/*
 	1.정수형 산술연산(+, -, *, / 등)에서의 데이터 타입 자동 컨버젼(promotion)
 	  - int 보다 작은 byte, short, char를 사용하여 산술연산을 수행하면 무조건 int type으로 자동형변환 시킴
 	2. long type이나 float, double 등의 타입과 다른 다른 타입이 산술 연산을 수행하면 큰 데이터 타입으로 자동형변환 시킴
 	
 */

public class TypeConversionInExpressionEx {

	public static void main(String[] args) {
		byte b1 = 42;
		byte b2 = 10;
		byte sum;
		char c1 = 20;
		char c2 = 30;
		char csum;
		int isum;
		long l1 = 15;
		long result;
		double dresult;
		
		/* 
		 	sum = b1 + b2;  Type mismatch: cannot convert from int to byte
		 	
		 	b1 + b2를 수행할 때 기계어로 표현
		 	1. byte type인 b1을 int type으로 promotion 시킴 (즉, 1 byte -> 4 byte 크기로 확장)
			2. byte type인 b2을 int type으로 promotion 시킴 (즉, 1 byte -> 4 byte 크기로 확장)
			3. b1 + b2를 수행
			4. int type인 결과값을 byte type인 sum에 넣으려고 함. -> error 발생
			
		*/
		sum = (byte) (b1 + b2);    	// (byte) --> casting (강제 형 변환)
		isum = b1 + b2;				// error 발생 x
		
//		csum = c1 + c2; // error 발생 Type mismatch: cannot convert from int to char
//		isum = l1; 		// error 발생
		
		result = b1 + c1 +l1;
		/*
			기계어로 변환
			1. b1 + c1 연산하여 int type으로 변환하여 메모리에 4 byte로 저장
			2. b1과 c1의 결과값과 l1을 덧셈 연산하기 위해서
				- 2.1: b1 + c1의 결과값을 8 byte인 long type으로 변환 (promotion 발생)
				- 2.2: l1과 덧셈 연산 수행
			3. 최종값을 long type인 result에 넣음
			
		 */
		
		dresult = l1 + 0.5;
		
//		  result = l1 + 0.5; 		
		/*
		 	long type인 l1과 double type인 0.5를 더할 경우 기계어로는
			1. l1을 double type으로 변환 
			2. 0.5를 더하여 최종적으로 연산결과가 double type으로 만듬.
		 */
		
	}

}
