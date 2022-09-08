package p02.anonymous_instance;

/*
  	access modifier가 기본적으로 public이 원칙임.
*/
public interface RemoteControl {
	// public static final int MAX_VOLUME = 10;
	int MAX_VOLUME = 10;			// 상수 정의(static final을 안 써주어도 상수로 정의됨)
	public int MIN_VOLUME = 0;		// 상수 정의
	
	// public abstract void turnOn(); 
	public abstract void turnOff();
	void turnOn();
	public void setVolume(int volume);
	
}
