package p05.for_basic;

/*
 	3개의 중첩 for문 
 	 - 3개 이상의 중첩 for문을 사용하면 프로그램 실행 속도를 크게 저하시킬 수 있어 실무적으로는 가급적 사용 x
 	 - 예) 10 * 10 * 10 =>  전체 실행 횟수: 1000번 실행 
 	 - 어쩔 수 없이 사용해야만 한다면, 반드시 전체 반복 횟수를 확인하고 사용할 것.
 */

public class ForBasic3 {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) 
				for(int k=1; k<=10; k++) {
					System.out.println("3개 숫자의 곱 = " + (i * j * k));
				}
		}
		
		
	}

}
