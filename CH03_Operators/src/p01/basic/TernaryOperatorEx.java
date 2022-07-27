package p01.basic;

/*
	TernaryOperator(3항 연산자): 피연산자 개수가 3개
	A ? B : C (연산자는 ?, : -> 2개,  피연산자: A, B, C -> 3개)
	=> 의미: A가 true이면 B를 실행하고, A가 false이면 C를 실행
	
 */

public class TernaryOperatorEx {

	public static void main(String[] args) {
		int n1 = 15;
		int n2 = 10;
		int max;
		
		if(n1 > n2) {
			max = n1;
		}else {
			max = n2;
		}
		
		max = (n1 > n2) ? n1 : n2;    // n1 > n2 가 true면 n1의 값 반환. false이면 n2의 값 반환
		System.out.println("max = " + max);
		
		int result;
		result = (n1 > n2) ? (n1 + n2) : (n1 - n2);
		System.out.println("result = " + result);

	}

}
