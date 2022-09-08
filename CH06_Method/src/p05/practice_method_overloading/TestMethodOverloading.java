package p05.practice_method_overloading;

/*
	method overloading 정의
	1. method 이름이 동일하더라도 method signature가 다른 경우 JVM 다른 method로 인식하는 것이다.
	2. C language에서는 method overloading이 허용 안됨. => C 언어의 method signature는 method 이름만 해당됨.
*/

public class TestMethodOverloading {

	public static void main(String[] args) {
		System.out.println("3과 4의 최대값 : " + max(3,4));
		System.out.println("3.2과 5.4의 최대값 : " + max(3.2,5.4));
		System.out.println("3.2, 5.4, 10.4의 최대값 : " + max(max(3.2,5.4),10.4));
		
	}
	
	public static int max(int num1, int num2) {
		if(num1 > num2) {
			return num1;
		}else {
			return num2;
		}
	}
	
	public static double max(double num1, double num2) {
		if(num1 > num2) {
			return num1;
		}else {
			return num2;
		}
	}
	
	public static double max(double num1, double num2, double num3) {
		double result;
		
		result = max(max(num1,num2), num3);
		
		return result;
	}

}
