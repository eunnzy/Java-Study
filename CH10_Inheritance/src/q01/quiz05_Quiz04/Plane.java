package q01.quiz05_Quiz04;

public class Plane extends Vehicle{

	@Override
	void move() { // 추상 메소드 move()를 override
		System.out.println("하늘로 다닌다.");
	}

}
