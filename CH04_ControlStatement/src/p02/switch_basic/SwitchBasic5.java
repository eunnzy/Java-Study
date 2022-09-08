package p02.switch_basic;

public class SwitchBasic5 {

	public static void main(String[] args) {
		int originalScore = 79;
		int convertedScore;
		
		// originalScore가 70 ~ 79 사이인 경우는 convertedScore는 모두 7
		convertedScore = originalScore / 10;
		
		switch(convertedScore) {
		case 10: 	// if (originalScore == 100)
		case 9:		// else if (originalScore >= 90)
			System.out.println("A 등급입니다.");
			break;
		case 8:		// else if (originalScore >= 80)
			System.out.println("B 등급입니다.");
			break;
		case 7:		// else if (originalScore >= 70)
			System.out.println("C 등급입니다.");
			break;
		case 6:		// else if (originalScore >= 60)
			System.out.println("D 등급입니다.");
			break;
		default:
			System.out.println("F 등급입니다.");
			break;
		}
		
	}
}
