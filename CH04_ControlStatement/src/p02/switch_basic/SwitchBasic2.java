package p02.switch_basic;

/*
	break : 해당 case만 실행하고 switch문을 빠져나오게 하는 효과가 있음.
*/

public class SwitchBasic2 {

	public static void main(String[] args) {
		int diceNumber =  (int)(Math.random() * 6) + 1;  // 1 ~ 6 값 중 하나을 가짐.
		
		System.out.println("diceNumber = " + diceNumber);
		
		switch(diceNumber) {
		case 1:			// diceNumber == 1 인 경우
			System.out.println("주사위 1이 나왔습니다.");
		case 2:
			System.out.println("주사위 2이 나왔습니다.");
		case 3:
			System.out.println("주사위 3이 나왔습니다.");
			break;
		case 4:
			System.out.println("주사위 4이 나왔습니다.");
		case 5:
			System.out.println("주사위 5이 나왔습니다.");
		default:		// 1 ~ 5를 제외한 나머지 즉, 6일 때 실행됨.
			System.out.println("주사위 6이 나왔습니다.");
			break;
		}
	}

}
