package p01.basic2;

public class PhoneEx {

	public static void main(String[] args) {
		Phone phone;
		
//		phone = new ApplePhone();
//		phone = new LgPhone();
		phone = new SamsungPhone();
		
		phone.sendCall();
		phone.receiveCall();
//		phone.flash();		// flash() 메소드에 접근 불가능.
		
	}

}
