package p02.switch_basic;

/*
	switch문은 if ~ else if ~ else로 코딩 가능
	  - 가능하면 switch문을 많이 사용하는 것을 추천.
	  - 깔끔하고 명료. (보기 좋음) 
	  - 유용한 적용 사례 : 주사위, 달력, 회사직급 등과 같이 등급이 정해져 있는 경우
*/

public class SwitchBasic {

	public static void main(String[] args) {
		int diceNumber =  (int)(Math.random() * 6) + 1;  // 1 ~ 6 값 중 하나을 가짐.
		
		System.out.println("diceNumber = " + diceNumber);
		
		switch(diceNumber) {
			case 1:			// diceNumber == 1 인 경우
				System.out.println("주사위 1이 나왔습니다.");
				break;
			case 2:
				System.out.println("주사위 2이 나왔습니다.");
				break;
			case 3:
				System.out.println("주사위 3이 나왔습니다.");
				break;
			case 4:
				System.out.println("주사위 4이 나왔습니다.");
				break;
			case 5:
				System.out.println("주사위 5이 나왔습니다.");
				break;
			default:		// 1 ~ 5를 제외한 나머지 즉, 6일 때 실행됨.
				System.out.println("주사위 6이 나왔습니다.");
				break;
		}
	}

}
