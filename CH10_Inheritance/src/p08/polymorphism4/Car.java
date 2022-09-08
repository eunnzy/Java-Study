package p08.polymorphism4;

public class Car {
	// Tire(String location, int maxRotation) 생성자 : 타이어의 위치와 최대 수명
	Tire frontLeftTire = new Tire("앞왼쪽", 6);			
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	
	int run() {
		System.out.println("자동차가 달립니다.");
		// override된 자식 roll() method 실행(polymorphism)
		if(frontLeftTire.roll() == false) {		// 앞왼쪽 타이어가 펑크가 났을 때
			stop();
			return 1;
		}
		if(frontRightTire.roll() == false) {	// 앞오른쪽 타이어가 펑크가 났을 때
			stop();
			return 2;
		}
		if(backLeftTire.roll() == false) {		// 뒤왼쪽 타이어가 펑크가 났을 때
			stop();
			return 3;
		}
		if(backRightTire.roll() == false) {		// 뒤오른쪽 타이어가 펑크가 났을 때
			stop();
			return 4;
		}
		return 0;
	}
	
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}
