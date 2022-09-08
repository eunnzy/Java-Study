package p04.dowhile_basic;

/*
	do ~ while : do ~ while문 내부 명령어를 무조건 1번은 실행.
	do { A; } while(조건식);	=> 조건식이 true인 동안에 반복문 A를 반복 실행.
	- 참고 : while문의 내부 명령어는 한번도 실행 안 할 수 있음.
	몇몇 특수한 경우에만 쓰고, 잘 안 씀.
	
*/

public class DoWhileBasic {

	public static void main(String[] args) {
		int count = 0;
		
		// do ~ while은 블록을 무조건 한 번은 실행.
		do {
			System.out.println("Java씨, 존경합니다.");		
			count++;
		}while(count < 10);
		
		
		count = 0;
		do {
			System.out.println("Java씨, 매우매우 존경합니다.");		
		}while(count > 10);

	
		while(count > 10) {
			System.out.println("Java씨, 너무너무 존경합니다.");		
			count++;
		}
		
	}

}
