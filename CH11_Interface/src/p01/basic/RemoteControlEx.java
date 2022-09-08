package p01.basic;

/*
   Interface 정의
   1. 상수와 abstract method만 사용하는 것을 말함 (원칙)
   	- 2016년 Java 1.8 버전부터 default method와 static method를 추가했음.
   2. 문법
   	- field 선언할 때 public static final 키워드를 사용하지 않아도 Java에서 자동으로 붙여줌. (상수)
   	- method 선언할 때 public abstract 키워드를 사용하지 않아도 Java에서 자동으로 붙여줌.
   3. Interface 사용의 기본은 polymorphism 방식으로 사용하는 것이 기본
   	- 사용방법 : 인터페이스 이름(부모) 변수이름 = 인터페이스 구현 클래스 (자식) 인스턴스
   	-		   변수이름.추상메소드구현한메소드
   4. 부모 class 역할을 하는 Interface는 기본적으로 힙메모리에 생성이 되지 않음.
*/
public class RemoteControlEx {

	public static void main(String[] args) {
		// RemoteControl interface 이름이 data type으로 간주.
		RemoteControl rc;
		
		rc = new Television();
//		rc = new Audio();	// promotion(자동 형 변환)
		
		rc.turnOn();		// polymorphism 발생.
		rc.setVolume(7);
		rc.turnOff();
		
//		rc = new Television();
	}

}
