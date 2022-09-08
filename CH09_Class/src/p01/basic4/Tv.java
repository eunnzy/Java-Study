package p01.basic4;

public class Tv {
	int channel = 1;
	int volumeLevel = 1;
	boolean on = false;
	
	public Tv() { 	}
	
	public void turnOn() {
		on = true;
	}
	
	public void turnOff() {
		on = false;
		channel = 1;
		volumeLevel = 1;
	}
	
	public void setChannel(int newChannel) {
		if( on && (newChannel >= 1) && (newChannel <= 120) ) {
			channel = newChannel;
		}else {
			System.out.println("올바른 채널이 아니어서 채널 변경이 안됩니다.");
		}
	}
	
	public void setVolume(int newVolumeLevel) {
		if( on && (newVolumeLevel >= 1) && (newVolumeLevel <= 7) ) {
			volumeLevel = newVolumeLevel;
		}else {
			System.out.println("올바른 볼륨이 아니어서 볼륨 변경이 안됩니다.");
		}
	}
	
	public void channelUp() {
		if(on && (channel < 120)) {		// channel의 최대값 120을 넘었는지 체크
			channel++;
		}
	}
	
	public void channelDown() {
		if(on && (channel > 1)) {
			channel--;
		}
	}
	
	public void volumeUp() {
		if(on && (volumeLevel < 7)) {
			volumeLevel++;
		}
	}
	
	public void volumeDown() {
		if(on && (volumeLevel > 1)) {
			volumeLevel--;
		}
	}
	
	public void printTVInformation() {
		System.out.println("channel : " + channel + ", volume : " + volumeLevel);
	}
}
