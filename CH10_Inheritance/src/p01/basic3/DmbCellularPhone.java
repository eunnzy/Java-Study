package p01.basic3;

public class DmbCellularPhone extends CellularPhone{
	int channel;

	public DmbCellularPhone(String model, String color, int channel) {
		// 부모 클래스의 field를 생성자에서 호출가능.
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("채널 " + channel + " 번 DMB 방송 수신 시작합니다.");
	}

	void changeChannelDmb(int channel) {
		System.out.println("채널 " + channel +" 번으로 변경합니다.");
//		this.channel = channel;
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다. ");
	}
	
	
}
