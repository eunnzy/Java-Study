package p05.protected_access_modifier.pkg2;

import p05.protected_access_modifier.pkg1.A;

/*
	1. 부모 constructor가 protected로 선언된 경우에는 자식 class에서 new로 instance 생성 불가함.
	 => 대신에 super()를 통해 부모 생성자 호출 가능.
	2. protected로 선언된 field, method는 자식 클래스에서 사용가능.
*/
public class D extends A{
	
	public D() {
		super();
		this.field = "newValue";
		this.method();
	}
	
	public void method() {
//			A a = new A();					// A class에 접근 불가능함. (A와 C는 다른 패키지에 있기 때문)
//			a.field = "newValue";
//			a.method();
	}
	
}
