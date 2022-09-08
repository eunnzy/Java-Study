package p01.basic;

/*
  	Audio 클래스는 RemoteControl interface의 자식 클래스라고 생각하면 됨.
  	RemoteControl interface는 Audio class의 부모 클래스라고 생각하면 됨.
*/
public class Audio implements RemoteControl{
	private int volume;
	
		
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) 
			this.volume = RemoteControl.MAX_VOLUME;
		else if(volume <= RemoteControl.MIN_VOLUME)
			this.volume = RemoteControl.MIN_VOLUME;
		else
			this.volume = volume;
		
		System.out.println("현재 Audio Volume : " + this.volume);
	}

}
