package p01.basic2;

/* 
 	identifier, variable 용어에 대한 실습
	1. identifier(식별자): program code 안에서 미리 정의된 element(원소)들을 구분하기 위한 이름(name)
		 - program code가 실행되어 메모리에 올라갈 때,  element 이름들을 별도 테이블에 관리
		 - ex) variableEx(class name), main(method name), age(variable name), radius(variable name)
		 - identifier(식별자)는 자바에만 있는 것이 아니라 python, C, ... 등 프로그래밍 언어에 모두 존재 함. 
		 - identifier는 unique한 것(중복될 수 없음), 즉 독립적으로 구분이 가능해야 한다. --> 이미 선언한 변수 이름을 똑같이 선언 x
	2. variable: age, radius
	3. keyword(reserved words:예약어) : public, class, static, void, int, double 등
*/

public class VariableEx {

	public static void main(String[] args) {
		int age;
		double radius;
		
		age = 20;
		System.out.println("나이는 " + age + "입니다.");
		
		radius = 5.0;
		System.out.println("원의 반지름은 " + radius + "입니다.");
		
		age = 30;
		System.out.println("나이는 " + age + "입니다.");
		
		radius = 10.0;
		System.out.println("원의 반지름은 " + radius + "입니다.");

	}

}
