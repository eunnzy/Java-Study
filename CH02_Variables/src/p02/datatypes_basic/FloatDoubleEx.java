package p02.datatypes_basic;

/*
 	 실수값 literal의 기본 type은 double임.
 	 double 8byte, float 4byte
 	  - 실수 literal을 float type에 넣을 경우에는 literal 값 끝에 'f'를 붙임.
 	  - f:float을 의미함.
 	  예) 3.14f: 3.14값을 float type인 4 byte로 생성해 달라는 명령어를 의미한다.
 	  - 이 때, f는 소문자이거나 대문자여도 상관없음.
 */

public class FloatDoubleEx {

	public static void main(String[] args) {
		double var1 = 3.14;
//		float var2 = 3.14; --> 오류 발생.
		float var2 = 3.14f;
		double var3 = 0.1234567890123456789;
		float var4 = 0.1234567890123456789f;
		
		System.out.println("var 1 = " + var1);
		System.out.println("var 2 = " + var2);
		System.out.println("var 3 = " + var3);
		System.out.println("var 4 = " + var4);
		/*
		 	var4는 0.123456789까지 나옴.
		 	똑같은 실수형이지만, float인 경우에는 double보다 정확도가 떨어짐.
		 */
		
		double var5 = 3e6;   // 3*10*6, E:Expontential
		float var6 = 3e6F;
		double var7 = 2e-3;  // 3*10**-3 
		
		System.out.println("var 5 = " + var5);
		System.out.println("var 6 = " + var6);
		System.out.println("var 7 = " + var7);
		
	}

}
