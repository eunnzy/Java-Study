package q01.quiz05_Quiz05_7;

public class SnowTireExample {

	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;	// 자동 타입 변환 발생 (promotion)
		
		snowTire.run();		// 자동 타입 변환이 발생하면 override한 메소드에만 접근가능 => override된 자식 메소드 run()의 코드를 실행
		tire.run();		// 자동 타입 변환이 발생 했으므로 자식 메소드 run()의 코드를 실행
		
		/*
		 	<출력결과>
		 	스노우 타이어가 굴러갑니다.
		 	스노우 타이어가 굴러갑니다.
		 */
	}

}
