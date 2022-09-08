package p03.realnumber_problem;

/*
	프로그램에서 실수로 산술연산을 가급적 하지 말 것. (왜냐하면 오차 발생)
	
 */

public class RealNumberWrongUseEx {

	public static void main(String[] args) {
		float f1 = 0.1f;
		double d1 = 0.1;
		
		System.out.println("f1 = " + f1);
		System.out.println("d1 = " + d1);
		
		int apple = 1;
		double pieceUnit = 0.1;
//		float pieceUnit = 0.1f;
		int number = 7;
		
		double result = apple - number * pieceUnit;
		
		System.out.println("사과 1개에서 ");
		System.out.println("0.7조각을 빼면, ");
		System.out.println(result + "조각이 남습니다.");
	}

}
