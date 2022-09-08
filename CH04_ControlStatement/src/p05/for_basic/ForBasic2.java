package p05.for_basic;

/*
	중첩 for문: for문 안에 for문이 있는 경우
	 대표적으로) 구구단 
*/
public class ForBasic2 {

	public static void main(String[] args) {

		System.out.println("구구단은 다음과 같습니다.");
		
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println(dan + "단 출력값");
			for(int num = 1; num <= 9; num++) {
				System.out.println(dan + " * " + num + " = " +(dan*num));
			}
			System.out.println();
		}
	
	}

}
