package p03.while_practice;

import java.io.IOException;

public class WhileKeyControlEx {

	public static void main(String[] args) throws IOException {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if( (keyCode != 13) && (keyCode != 10) ) {			// enter key (CR, LF)가 아닌 경우에 메뉴를 출력
				System.out.println("------------------------------");
				System.out.println("1. 증속   |  2. 감속  |   3. 중지" );
				System.out.println("------------------------------");
				System.out.print("선택: ");
			}
			
			// read() method : 키보드에서 한 문자씩 읽어옴.
			keyCode = System.in.read();
			System.out.println("keyCode : " + keyCode);
			
			if(keyCode == 49) {
				speed++;
				System.out.println("현재 속도 : " + speed);
			}else if(keyCode == 50){
				speed--;
				System.out.println("현재 속도 : " + speed);
			}else if(keyCode == 51){
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
		
	}

}
