package p01.basic;

/*
	Operator Precedence (연산자 우선순위)
	assignment operator인 = 을 기준으로 해서, 
	1. 오른쪽에 있는 수식을 계산할 때 왼쪽부터 오른쪽으로 계산.
	2. 왼쪽부터 오른쪽으로 계산할 때, 연산순위가 높은 연산부터 수행한다 (*, /, %가 +,- 보다 연산순위 높아 먼저 수행됨.)
	3. 단, ()가 모든 연산자보다 우선순위가 제일 높음.
	4. 프로그래밍 할 때 사용할 tip: 연산순위가 제일 높은 ()를 적극 활용!
 */

public class OperatorPrecedenceEx {

	public static void main(String[] args) {
		int result = 0;
		
		// 1) 5 - 2 => 3   2) 3 + 3 => 6    3) 6 - 6 => 0
		result = 5 - 2 + 3 - 6;
		System.out.println("result = " + result);
		
		// 1) 4 / 2 => 2   2) 8 * 4 => 32   3) (5+2)7 % 3 => 1   
		// 4) 3 - 2 + 32 - 1 => 32 (왼쪽부터 오른쪽으로 계산)
		result = 3 - 4/2 + 8*4 - (5+2)%3;
//		result = 3 - (4/2) + (8*4) - ((5+2)%3);
		System.out.println("result = " + result);
	}

}
