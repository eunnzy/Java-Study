package p04.final_method;

/*
   	final class : 자식 class를 만들지 말라는 의미
 	 - 대표적인 사용 예) 자바 library class
*/

public class Car {
	public int speed = 0;
	
	public void speedUp() {
		speed++;
	}
	
	public void speedDown() {
		speed--;
	}
	
	// method를 final로 선언
	public final void stop() {
		speed = 0;
	}
	
}
