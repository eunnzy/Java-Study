package p01.practice;

/*
	main의 매개변수 args에 대해
	- 프로그램 외부에서 데이터가 입력되는 것
	- 
*/
public class Calculator {

	public static void main(String[] args) {
		
		for(int i=0; i<args.length; i++) {
			System.out.println("args[" + i + "] : " + args[i]);
		}
		
		if (args.length != 3) {
			System.out.println("Calculator 사용법 예: 2 + 3");
			return;			// method의 return type이 void인 경우에는 return 값이 없는 상태로 return 가능(프로그램 종료)
		}
		
		int result = 0;
		
		// Integer.parseInt : 문자열을 숫자로 변환하는 method
		switch(args[1].charAt(0)) {
		case '+':
			result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);		// String -> int형으로 바꾸어줌.
			break;
		case '-':
			result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);		// String -> int형으로 바꾸어줌.
			break;
		case '/':
			result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);		// String -> int형으로 바꾸어줌.
			break;
		case '.':
			result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);		// String -> int형으로 바꾸어줌.
			break;
			
		}
		
		System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + result);
	}

}
