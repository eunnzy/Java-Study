package q01.quiz04_Quiz05;

public class TestFan {

	public static void main(String[] args) {
		Fan fan1 = new Fan(); 
		fan1.printFanInformation();
		fan1.setSpeed(Fan.FAST);	// speed를 fast로 설정
		fan1.setRadius(10);			// radius를 10으로 설정
		fan1.setColor("yellow");	// color를 yellow로 설정
		fan1.setOn(true);			// 선풍기 켜기
		fan1.printFanInformation();	// fan1 정보 출력
			
		System.out.println();
		
		Fan fan2 = new Fan(); 	
		fan2.setOn(true);			// 선풍기 켜기
		fan2.setSpeed(Fan.MEDIUM);	// speed를 medium으로 설정
		fan2.setRadius(5);			// radius를 5로 설정
		fan2.setColor("blue");		// color를 blue로 설정
		fan2.printFanInformation();	// fan2 정보 출력
		fan2.setOn(false);			// 선풍기 끄기
		fan2.printFanInformation();	// fan2 정보 출력
		
		
		
		
		
	}

}
