package p03.default_static_method;

/*
  	default method 선언 가능
  	1. method 이름 앞에 명시적으로 'default'라는 키워드를 넣음
  		- class에서는 default method 선언할 때 'default' 키워드 넣지 않음.
  	2. static method 선언 가능
  		- public static으로 인식.
  	3. default method와 static method를 java 1.8부터 interface 사양에 추가한 목적
  		- interface의 확장성 목적
  		
*/
public interface RemoteControl {
	int MAX_VOLUME = 10;			// 상수 정의(static final을 안 써주어도 상수로 정의됨)
	int MIN_VOLUME = 0;		// 상수 정의
	
	void turnOff();
	void turnOn();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	static void changeBattery() {
		System.out.println("건전지를 교체합니다.");
	}
	
}
