package p05.protected_access_modifier.pkg1;

/*
  	A와 같은 package내에 있는 B class내에서는
  	A class에서 protected로 선언된 field, constructor, method 사용 가능.
*/
public class B {
	
	public void method() {
		A a = new A();
		a.field = "newValue";
		a.method();
	}
}
