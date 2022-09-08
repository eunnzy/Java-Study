package p01.basic4;

/*
	1. Tv class 사용 => TestTv는 고객
	2. Tv class를 사용하는 고객은 거의 대부분 method 사용 (field값을 직접 사용 안함)
*/

public class TestTv {

	public static void main(String[] args) {
		Tv tv1 = new Tv();
		tv1.setChannel(30);
		tv1.setVolume(3);
		/*
		 	----------- 실행 결과 ------------
		 	올바른 채널이 아니어서 채널 변경이 안됩니다.
			올바른 볼륨이 아니어서 볼륨 변경이 안됩니다.
			--> Tv를 켜지 않아서(Tv를 turnOn() 하지 않은 상태에서  channel, volume 변경이 불가하도록 함)
		 */
		
		tv1.printTVInformation();	// channel과 volume의 default 값이 출력 됨 => turnOn()이 안 되어있어서(Tv가 꺼져있어서)

		tv1.turnOn();
//		tv1.channel = 150; 		// 고객이 field값을 마음대로 수정하면 class내에서 method등을 사용할 때 원치않는 오작도 발생 가능
		tv1.setChannel(20);
		tv1.setVolume(5);
		tv1.printTVInformation();
		
		Tv tv2 = new Tv();
		tv2.turnOn();
		tv2.channelUp();
		tv2.channelUp();
		tv2.volumeUp();
		tv2.printTVInformation();
		
		tv1.turnOff();
		tv2.turnOff();
	}

}
