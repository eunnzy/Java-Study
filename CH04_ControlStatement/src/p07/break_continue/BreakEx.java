package p07.break_continue;

/*

*/

public class BreakEx {

	public static void main(String[] args) {
		int num = 0;
		
		while(num != 6) {
			num = (int) (Math.random()*6) + 1;	// num = 1, 2, 3, 4, 5, 6 중 하나
			System.out.println("주사위번호 = " + num);
		}
		System.out.println();
		
		// 무한 loop -> 계속해서 반복됨. 
		while(true) {
			num = (int) (Math.random()*6) + 1;	// num = 1, 2, 3, 4, 5, 6 중 하나
			System.out.println("주사위번호 = " + num);
			
			if(num == 6) {		// 조건식 역할
				break;
			}
		}
		System.out.println("주사위 게임 종료");
			
		// 	음식주문자동기계, 커피자판기 처럼 무한 반복하여 주문을 받는 프로그램
		while(true) {
			// 1. 음식 메뉴 화면 display   2.주문한 음식 메뉴 입력 받음.   3.주문된 음식 요리   4.고객에게 음식 완성 메세지 display
			
			int error = 0;
			if(error != 0) { // 기계에서 error가 발생하면
				break;
			}

		}
		
	}

}
