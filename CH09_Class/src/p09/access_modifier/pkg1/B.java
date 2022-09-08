package p09.access_modifier.pkg1;

public class B {
	A a1 = new A();		// default constructor 호출
	A a2 = new A(1);	// public constructor 호출
//	A a3 = new A(1.0);	// error : private constructor 호출
	
	public B() {
		a1.a = 1;		// default field 사용
		a1.b = 2;		// public field 사용
//		a1.c = 3;		// error : private field 접근은 다른 클래스에서 불가.
		
		a1.printDefault();
		a1.printPublic();
//		a1.printPrivate();	// error : private method 접근 불가
	}
	
	
}
