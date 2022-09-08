package p10.abstract_class;

/*
	추상클래스(abstract class) 
	1. class가 추상클래스로 선언되면, 추상클래스를 직접 new를 사용하여 인스턴스 생성 불가
	2. 추상클래스를 사용하려면, 추상클래스를 부모로 한 자식 클래스를 new를 사용하여 인스턴스 만드는 것만 허용.
	3. 추상클래스 내부에 생성자는 있어야만 함.
		- 이유 : 자식클래스를 통해 부모인 추상클래스를 힙메모리에 인스턴스로 생성 후에 부모 추상클래스의 생성자를 호출
		
	
*/
public class SmartPhoneEx {

	public static void main(String[] args) {
//		Phone phone = new Phone("홍길동");	// 인스턴스 생성 불가
		
		SmartPhone sp = new SmartPhone("홍길동");	
		
		sp.turnOn();
		sp.internetSearch();
		sp.turnOff();
		
	}

}
