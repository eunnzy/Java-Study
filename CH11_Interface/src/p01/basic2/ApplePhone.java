package p01.basic2;

public class ApplePhone implements Phone{

	@Override
	public void sendCall() {
		System.out.println("Apple Phone - 따르릉");
	}

	@Override
	public void receiveCall() {
		/*
		   	다른 class에서 Interface를 구현한 자식 class를 부모인 Interface로 자동형변환하여 사용할 경우,
		 	자식 class에서 새로 추가한 메소드는 직접 사용할 수 없지만, 
		 	Interface에서 override한 자식 클래스의 메소드 안에 내부적으로 사용하는 것은 가능.
		 */
		flash();
		System.out.println("Apple Phone - 전화왔습니다.");
	}

	public void flash() {
		System.out.println("Apple Phone - 전화기에 불이 켜졌습니다.");
	}
}
