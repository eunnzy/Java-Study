package p01.basic2;

/******************************************/
/*
 	Class 이름: VariableEx3
 	Class 용도: 청소년과 성인을 구분하는 Class
 	최초 생성일자: 2022.07.26
 	최초 작성자: 
 	최종 수정일자: 2022.07.26
*/
/******************************************/

/*
 	literal(리터럴) : 변수 선언할 때 초기화 값 or 변수 사용할 때 새로 할당된 값들을 의미.
 	 - 소스 코드 내에서 직접 입력된 변수의 초기값.
 	 - literal의 예: 15, 5, 5.0, 0.1, 30
 	 - literal 값들을 프로그램이 메모리에서 실행할 때 같이 별도로 테이블 등으로 관리되고 있음.
 	 - 15, 5 : 정수 리터럴
 	 - 5.0, 0.1: 실수 리터럴
*/

public class VariableEx3 {

	public static void main(String[] args) {
		int junior = 15;	// 청소년 시작 나이(15살)
		int adult = junior + 5;  // 성인 기준 (20살)
		// junior를 초기화 해 주지 않으면 adult 변수에 초기값 설정시 오류 발생.
		double radius = 5.0;  // 반지름
		double interestRate = 0.1; // 이자율
		int age;
		
		age = 30;
		
	}

}
