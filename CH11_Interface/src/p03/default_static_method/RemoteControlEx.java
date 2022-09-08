package p03.default_static_method;

public class RemoteControlEx {

	public static void main(String[] args) {
		// RemoteControl interface 이름이 data type으로 간주.
		RemoteControl rc;
		
		rc = new Television(); 	// promotion(자동 형 변환)
		rc.turnOn();		
		rc.setVolume(7);
		rc.setMute(true);
		rc.turnOff();

		RemoteControl.changeBattery();

		
		rc = new Audio();	
		rc.turnOn();		
		rc.setVolume(7);
		rc.setMute(false);
		rc.turnOff();
		
		
	}

}
