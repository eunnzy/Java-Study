package q01.quiz05_Quiz04;

public class Car extends Vehicle{

	@Override
	void move() {	// 추상 메소드 move()를 override
		System.out.println("도로로 다닌다.");
	}
}
