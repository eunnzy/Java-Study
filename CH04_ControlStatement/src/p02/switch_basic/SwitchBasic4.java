package p02.switch_basic;

public class SwitchBasic4 {

	public static void main(String[] args) {
		char grade = 'D';
		
		switch(grade) {
		case 'A':
		case 'E':
		case 'B':
			System.out.println("우수회원 입니다.");
			break;
		case 'C':
		case 'D':
			System.out.println("일반회원 입니다.");
			break;
		}
		
		if ( (grade == 'A') || (grade == 'E') || (grade == 'B') ) {
			System.out.println("우수회원입니다.");
		}else if( (grade == 'C') || (grade == 'D') ){
			System.out.println("일반회원입니다.");
		}
		
	}
	

}
