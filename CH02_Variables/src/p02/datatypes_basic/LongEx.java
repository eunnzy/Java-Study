package p02.datatypes_basic;

/*
	정수 type literal: 기본은 4 byte임.
	long type literal로 만들고 싶으면 정수값 끝에 'L'이나 'l'을 붙이면 되고, 이 때 8 byte로 메모리에 만듬.
	
 */


public class LongEx {

	public static void main(String[] args) {
		/*
		 	기계어로 변환
		 	1. 10을 4 byte로 메모리에 생성
		 	2. long type인 var1에 넣기 위해서 4 byte로 된 것을 8 byte로 확장하여 var1에 넣음.
		*/

		
		long var1 = 10;				// 10: 4 byte에 만듦.
		long var2 = 10L;			// 10L: 8 byte에 만듦.
//		long var3 = 1000000000000;   --> 오류 발생 (메모리 공간 부족)
		long var3 = 1000000000000L;
		
		System.out.println("var1 = " + var1);
		System.out.println("var2 = " + var2);
		System.out.println("var3 = " + var3);
	}

}

