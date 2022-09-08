package p01.practice;

/*
	max 구하기
	1. method parameter를 array를 사용하여 여러개의 값을 parameter로 넘길 수 있어 
	   max method처럼 여러개의 숫자에 대하여 최대값을 구하는 여러 개의 메소드를 선언(메소드 오버로딩:method overloading)할 필요 없음.
	2. parameter로 배열과 유사한 다른 표기법 => '...'을 사용한 표기법. 
		- actual parameter(arguments:매개변수)로 배열을 사용해도 인식이됨.
		- actual parameter로 primitive type을 여러개 가변적으로 넘겨도 인식됨.
	   
*/
public class VarArgsDemo {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		int c=3;
		int maxValue;
		
		int[] numbers = {1, 2, 3, 12, 16};
		
		maxValue = max(a, b);
		System.out.println("maxValue = " + maxValue);
		maxValue = max(a, b, c);
		System.out.println("maxValue = " + maxValue);
		maxValue = max(numbers);
		System.out.println("maxValue = " + maxValue);
		maxValue = max(15, 24, 46, 77, 99, 120, 45);
		System.out.println("maxValue = " + maxValue);
		
	}
	
	public static int max(int... num) {			
		int result = 0;
		
		result = num[0];
		for(int i=0; i<num.length; i++) {
			if(num[i] > result)
				result = num[i];
		}
		
		return result;
	}
	
//	public static int max(int[] num) {
//	int result = 0;
//	
//	result = num[0];
//	for(int i=0; i<num.length; i++) {
//		if(num[i] > result)
//			result = num[i];
//	}
//	
//	return result;
//}
	
//	public static int max(int a, int b) {
//		if(a > b) {
//			return a;
//		}else {
//			return b;
//		}
//	}
//	
//	public static int max(int a, int b, int c) {
//		int result;
//		
//		result = max(max(a, b), c);
//		
//		return result; 
//	}
	

}
