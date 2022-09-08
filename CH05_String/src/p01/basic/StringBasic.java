package p01.basic;

/*
	String (data) type
	1. 메모리에서 사용하는 데이터 크기가 가변적인 것이 특징임.
	  -> 실제 데이터를 힙메모리에 저장하고, String type으로 선언된 변수에는 힙메모리의 주소값을 갖고 있음.
	 	 예를 들면, String message = "안녕하세요, 자바씨~"; 인 경우, 
	 	 변수 message에는 힙메모리에 저장된 "안녕하세요, 자바씨~" 데이터의 시작 주소값을 갖고 있다는 의미임.
	2. 실제 사용 예) 고객이름, 주소, 직업, 회사명, 상품명, ... 등 
	3. 산술연산 기호 중에서 +만 사용 가능 => 문자열 합치기 (-, *, / => 는 불가)
		- 문자열 + 문자열 (연산 OK), 숫자 + 문자열 (OK), 문자열 + 숫자 (OK), 
	
*/

public class StringBasic {

	public static void main(String[] args) {
		String message = "안녕하세요, 자바씨~";
		String message1 = "정말 좋은 아침입니다.";
		String message2;
		
		System.out.println(message);
		System.out.println(message1);
		
		message2 = message1 + " " +message1;
		System.out.println(message2);
		
		
		// 2 + 3 + message => 5 + message => "5"(문자열로 바뀜) + "안녕하세요, 자바씨~"  (숫자가 문자열로 promotion됨)
		message2 = 2 + 3 + message;
		System.out.println(message2);
		
		message2 = message + 2 + 3;	// 출력결과: 안녕하세요, 자바씨~23  => 숫자 2,3이 문자열로 바뀌므로, 5가아니라 문자열 "23"이 됨.
		System.out.println(message2);
		
		

	}

}
