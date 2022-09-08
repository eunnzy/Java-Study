package p08.practice1;

/*
	  SmartPhone class
	  1. 부모 class : PDA
	  2. 부모 interface ; MP3Interface, MobilePhoneInterface
*/
public class SmartPhone extends PDA implements MP3Interface, MobilePhoneInterface{

	@Override
	public void sendCall() {
		System.out.println("따르릉 따르릉~~");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화 왔어요~");
	}

	@Override
	public void sendSMS() {
		System.out.println("문자 보냅니다.");
	}

	@Override
	public void receiveSMS() {
		System.out.println("문자 받습니다.");
	}

	@Override
	public void play() {
		System.out.println("음악 연주 합니다.");
	}

	@Override
	public void stop() {
		System.out.println("음악 연주 중단합니다.");
	}
	
	public void schedule() {
		System.out.println("일정관리 합니다.");
	}
}
