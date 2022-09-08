package p02.anonymous_instance;

/*
  	익명객체(Anonymous Instance)
  	1. Interface를 implements한 인스턴스를 의미 
  	2. 자식 class를 공식적으로 만들지 않고 1회성으로 자식 클래스를 만들기를 원할 때 사용.
  	3. Android mobile app 프로그래밍에서 많이 사용.
*/
// RemoteControl interface 이름이 data type으로 간주.
public class RemoteControlEx {

	public static void main(String[] args) {
		// 익명 객체
		RemoteControl rc = new RemoteControl() {		
			int volume;
			
			@Override
			public void turnOn() {
				System.out.println("Anonymous(익명)객체 - 전원을 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Anonymous(익명)객체 - 전원을 끕니다.");
			}
			
			@Override
			public void setVolume(int volume) {
				this.volume = volume;
				System.out.println("Anonymous(익명)객체 - volume : " + volume);
			}
		};
		
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(7);
	}

}
