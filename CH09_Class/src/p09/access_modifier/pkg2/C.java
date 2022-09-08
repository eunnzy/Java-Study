package p09.access_modifier.pkg2;

import p09.access_modifier.pkg1.A;

/*
  	1. 다른 패키지에서 default로 선언된 field, constructor, method 사용 불가
  	 
*/

public class C {
//	A a1 = new A();	// error : default constructor 다른 패키지에서 호출 불가
	A a2 = new A(1);	// public constructor 호출
//	A a3 = new A(1.0);	// private constructor 접근 불가
	
	public C() {
//		a2.a = 1;	// default field 접근 불가
		a2.b = 2; 	// public field 접근 가능
//		a2.c = 3;	// private field 접근 불가
	
		a2.printPublic();	
//		a2.printDefault();
//		a2.printPrivate();
	}
}
