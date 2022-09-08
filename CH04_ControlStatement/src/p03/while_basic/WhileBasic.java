package p03.while_basic;

/*
	while, do~while, for: 특정 명령어 집합을 반복적으로 수행하고자 할 때 사용하는 command
	  예) 수능 50만명의 성적처리 할 때 사용할 수 있음.
	while (boolean: 조건식) { A; }  boolean: true / false 값만 가능. => boolean이 true인 동안에 A 명령어 반복 실행.
	- 초기값과 while문 조건식, 조건 증감 명령어을 꼼꼼하게 살펴볼 필요가 있음.
*/

public class WhileBasic {

	public static void main(String[] args) {

//		System.out.println("Java씨, 존경합니다.");
//		System.out.println("Java씨, 존경합니다.");
//		System.out.println("Java씨, 존경합니다.");
//		System.out.println("Java씨, 존경합니다.");
//		System.out.println("Java씨, 존경합니다.");
//		System.out.println("Java씨, 존경합니다.");
//		System.out.println("Java씨, 존경합니다.");
//		System.out.println("Java씨, 존경합니다.");
//		System.out.println("Java씨, 존경합니다.");
//		System.out.println("Java씨, 존경합니다.");
		
		// 이렇게 중복된 것을 하나하나 코딩하는 것은 좋지 않은 방법.

		int count = 0;  // 반복문 초기화
		while(count < 10) {		// count가 0 ~ 9까지 실행 10 -> false
			System.out.println("Java씨, 존경합니다.");
			count++;		// count = count + 1; (count값 하나씩 증가)
							// count 값을 증가시켜 주지 않으면 while문은 계속해서 실행된다(무한루프 발생)
							// count값이 변함으로써 while문의 조건식 결과를 false로 만들어 줄 수 있음, 조건 증감 명령어
		}
		
		// -> while문만 실행하면 Java씨, 존경합니다. 가 10번 출력됨.
		// while문의 조건이 true인 경우 while 블록문 실행.
		System.out.println();
		
		count = 10;
		while(count >= 1) {
			System.out.println("Java씨, 존경합니다.");
			count--;		
		}
		System.out.println();
		
		
		count = 1;
		while(count <= 10) {
			System.out.println("Java씨, 존경합니다.");
			count++;		
		}
		System.out.println();
		
		
		count = 1;
		int endValue = 10;
		while(count <= endValue) {
			System.out.println("Java씨, 존경합니다.");
			count++;		
		}
		
		
	}

}
