package p05.protected_access_modifier.pkg2;
import p05.protected_access_modifier.pkg1.A;

/*
   	A class와 상속 관계가 아닌 다른 package의 C class에서는
	A class protected로 선언된 field, method, constructor 사용이 불가능함.
*/

public class C {
	
	public void method() {
	/*
		A a = new A();					// A class에 접근 불가능함. (A와 C는 다른 패키지에 있기 때문)
		a.field = "newValue";
		a.method();
	*/
	}
}
